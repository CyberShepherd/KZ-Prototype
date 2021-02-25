package com.cybershepherd.KZPrototype.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RentOrderRepository extends JpaRepository<RentOrder, Long> {

    @Query(value = "FROM RentOrder WHERE ?1 = lodge_id AND (arrival BETWEEN ?2 AND ?3 OR department BETWEEN ?2 AND ?3)")
    public List<RentOrder> findOrdersBetweenDates(Long lodgeid, LocalDate arr, LocalDate dep);
}
