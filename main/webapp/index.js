function showIframe(page){
    const buttons = document.querySelectorAll('.navButtons');
    buttons.forEach(button => {
        button.style.color="white";
});

    // Highlight the clicked button
    const clickedButton = document.getElementById(page);
    clickedButton.style.textDecoration="underline";
    clickedButton.style.color="gold";

    
    switch(page){
        case 'doctorPage' : document.getElementById('formElement').src = "./add_doctor.html";
        break;
        case 'departmentPage' : document.getElementById('formElement').src = "./add_department.html";
        break;
        case 'patientPage' : document.getElementById('formElement').src = "./add_patient.html";
    }
    document.getElementById("formElement").style.display = "block"; 
}
