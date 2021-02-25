package com.cybershepherd.KZPrototype.userform;

import com.cybershepherd.KZPrototype.lodge.Lodge;
import com.cybershepherd.KZPrototype.lodge.LodgeService;
import com.cybershepherd.KZPrototype.order.RentOrder;
import com.cybershepherd.KZPrototype.order.RentOrderService;
import com.cybershepherd.KZPrototype.person.Person;
import com.cybershepherd.KZPrototype.person.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserformService {
    private final RentOrderService rentOrderService;
    private final PersonService personService;
    private final LodgeService lodgeService;

//    TODO check if id null
    public ResponseEntity submitUserform(Userform userform){
        Person person = userform.getPerson();
        ResponseEntity personResponse = this.processPerson(person);
        person.setId(personService.findPersonIdByPesel(person));

        RentOrder rentOrder = userform.getRentOrder();
        Lodge lodge = userform.getLodge();

        if(person.getId() == null) return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        rentOrder.setPersonId(person.getId());
        if(lodgeService.isLodgeOfGivenId(lodge.getId()))
            rentOrder.setLodgeId(lodge.getId());
        else
            return new ResponseEntity<String>("Lodge of given id doesn't exist", HttpStatus.BAD_REQUEST);
//        TODO: Add date period check
        ResponseEntity rentOrderResponse = rentOrderService.addRentOrder(rentOrder);
        HttpStatus status = HttpStatus.OK;
        StringBuilder sb = new StringBuilder();
        if(personResponse.getStatusCode() != HttpStatus.OK) {
            status = HttpStatus.BAD_REQUEST;
            sb.append(personResponse.getBody() + "\n");
        }
        if(rentOrderResponse.getStatusCode() != HttpStatus.OK) {
            status = HttpStatus.BAD_REQUEST;
            sb.append(rentOrderResponse.getBody()+"\n");
        }
        return new ResponseEntity<String>(sb.toString(), status);
    }

    private ResponseEntity processPerson(Person person){
        return personService.addPerson(person);
    }

    private String processLodge(Lodge lodge){

        return null;
    }

    private String processRentOrder(RentOrder rentOrder){
        return null;
    }



}
