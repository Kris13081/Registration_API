function invalidNameHandler(e) {
    e.target.setCustomValidity("Length has to be between 2 and 30 characters, without digits and symbols!");
}

export default invalidNameHandler;