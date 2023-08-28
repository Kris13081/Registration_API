const handleSubmit = async (event) => {

  event.preventDefault();

  const formData = new FormData(event.target);
  const data = {}; 

  formData.forEach((value, key) => {
     data[key] = value;
  });

  try {
     const response = await fetch("/api/v1/users/register", {
        method: "POST",
        headers: {
           "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
     });

     if (response.ok) {
        alert("Form data submitted successfully");
        event.target.reset();
     } else {
        alert("User with this email or phonenumber is already existing!");
     }
  } catch (error) {
    alert("An error occurred:", error);
  }

  console.log(data);
}; 
   
export default handleSubmit;