const handleSubmit = async (event) => {
    event.preventDefault();
    
    const formData = new FormData(event.target);
    const data = {}; 

    formData.forEach((value, key) => {
      data[key] = value;
    });

   /* try {
      const response = await fetch("YOUR_BACKEND_ENDPOINT", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
      });

      if (response.ok) {
        console.log("Form data submitted successfully");
        formRef.current.reset();
      } else {
        console.error("Failed to submit form data");
      }
    } catch (error) {
      console.error("An error occurred:", error);
    }
  }; */
        console.log("Form data:", data);
    };
    
  export default handleSubmit;