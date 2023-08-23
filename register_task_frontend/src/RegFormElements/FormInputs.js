import React from "react";
import '../RegFormElements/FormInputs.css';
import countries from "./Countries";
import DateInputs from "./Date";
import handleSubmit from "./SubmitHandler";

function FormInputs() {
    return (
		<form action="" className="form-container" onSubmit={handleSubmit}>
		<div className="text-input-container">      
			<div className="input-wrapper-firstname"> 
				<span>First Name: </span><input type="text" name="firstName" required pattern="^[A-Za-z]{2,30}$" onInvalid= {(e) => { e.target.setCustomValidity("Length has to be between 2 and 30 characters, without digits and symbols!");}}/>
			</div>
			<div className="input-wrapper-lastname">
				<span>Last Name: </span><input type="text" name="lastName" required pattern="^[A-Za-z]{2,30}$" onInvalid= {(e) => { e.target.setCustomValidity("Length has to be between 2 and 30 characters, without digits and symbols!");}}/> 
			</div>
			<div className="input-wrapper-phone">
				<span>Phone: </span><input type="text" name="phone" required pattern="[0-9]{10}" onInvalid= {(e) => { e.target.setCustomValidity("The number has to be exactly 10 digits!");}}/> 
			</div>
			<div className="input-wrapper-email">
				<span>E-mail: </span><input type="text" name="email" required pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}(?:\.[a-zA-Z]{2,})?" onInvalid={(e) => { e.target.setCustomValidity("Please enter a valid email address");}}/> 
			</div>
		</div>
		<div className="coutries-wrapper">
			<span>Country: </span>
			<select name="country">
				{countries.map((country, index) => (
					<option key={index} value={country}>{country}</option>
				))}
			</select>
		</div>
		<DateInputs/>
		<div className="submit-button-wrapper">
			<button type="submit" className="submit-button">SUBMIT</button>
		</div>
	</form>
	
    );
}

export default FormInputs;