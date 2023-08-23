function invalidPhoneHandler(e) {
    e.target.setCustomValidity("The number has to be exactly 10 digits!");
}

export default invalidPhoneHandler;