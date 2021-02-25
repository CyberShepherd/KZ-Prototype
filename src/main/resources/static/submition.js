var userform = {
    name: null,
    lastname: null,
    pesel: null,
    email: null,
    phoneNum: null,
    address: null,
    apartment: null,
    postalCode: null,
    city: null,
    lodgeId: null,
    arrival: null,
    department: null
}

var userformValidation = {
    name: null,
    lastname: null,
    pesel: null,
    email: null,
    phoneNum: null,
    address: null,
    apartment: null,
    postalCode: null,
    city: null,
    lodgeId: null,
    dates: null
}

function initializeUserform(){
    userform.name = $('#formName').val();
    userform.lastname = $('#formLastname').val();
    userform.pesel = $('#formPesel').val();
    userform.email = $('#formEmail').val();
    userform.phoneNum = $('#formEmail').val();
    userform.address = $('#formStreet').val();
    userform.apartment = $('#formStreetNum').val();
    userform.postalCode = $('#formPostalCode').val();
    userform.city = $('#formCity').val();
    userform.lodgeId = $('#lodgeSelector').val();
    userform.arrival = $('#formFromDate').val();
    userform.department = $('#formToDate').val();
}

function validateUserform() {
    userformValidation.name = validateName();
    userformValidation.lastname = validateLastname();
    userformValidation.pesel = validatePesel();
    userformValidation.email = validateEmail();
    userformValidation.phoneNum = validatePhoneNum();
    userformValidation.address = validateAddress();
    userformValidation.apartment = validateApartment();
    userformValidation.postalCode = validatePostalcode();
    userformValidation.city = validateCity();
    userformValidation.lodgeId = validateLodge();
    userformValidation.dates = validateDates();
    console.log(userformValidation);
}


//TODO:Add validation later
const btnFunction = function () {
    postUserform();
}

function postUserform(){
    initializeUserform();
    console.log(userform);
    var response = $.ajax({
        url: host + '/api/userform',
        type: 'POST',
        data: JSON.stringify(userform, null, 2),
        dataType: 'json',
        contentType: 'application/json'
    });
    response.done(function(){
        console.log("Request send and received");
    })
}

const userformValid = function () {
    validateUserform();
    for(var key in userformValidation) {
        if (userformValidation[key] == false
            || userformValidation[key] == null) return false;
    }
    return true;
}

const validateName = function(){
    return isMadeOfLettersOnly(userform.name);
}

const validateLastname = function(){
    return isMadeOfLettersOnly(userform.lastname);
}

const validatePesel = function () {
    return isMadeOfNumbersOnly(userform.pesel);
}

//TODO: Add validation
const validateEmail = function () {
    return true;
}

const validatePhoneNum = function(){
    let valid = isMadeOfNumbersOnly(userform.phoneNum);
    if(!valid && isStatementNotNull(userform.phoneNum))
        valid = isMadeOfNumbersOnly(userform.phoneNum.toString().substr(1));
    return valid;
}

//TODO: add validation
const validateAddress = function(){
    return true;
}

const validateApartment = function () {
    return isMadeOfNumbersOnly(userform.apartment);
}

//TODO: add validation
const validatePostalcode = function () {
    return true;
}

const validateCity = function(){
    return isMadeOfLettersOnly(userform.city);
}

const validateDates = function(){
    if(!isStatementNotNull(userform.arrival)) return false;
    if(!(userform.arrival instanceof date)) return false;
    if(!isStatementNotNull(userform.department)) return false;
    if(!(userform.department instanceof date)) return false;
    if(userform.arrival > userform.department) return false;
    return true;
}

const validateLodge = function () {
    let lodge = userform.lodgeId;
    if(!isStatementNotNull(lodge)) return false;
    for(let i=0; i<lodgesJson.length; i++){
        if(lodge == lodgesJson[i].id) return true;
    }
    return false;

}

function isStatementNotNull(statement) {
    return statement != null && statement != undefined;
}

function isMadeOfLettersOnly(statement){
    if(!isStatementNotNull(statement)) return false;
    if(/^[a-zA-Z]+$/.test(statement)) return true;
    else return false;
}

function isMadeOfNumbersOnly(statement){
    if(!isStatementNotNull(statement)) return false;
    if(/^[0-9]+$/.test(statement)) return true;
    else return false;
}

$('#btn-submition').click(btnFunction);