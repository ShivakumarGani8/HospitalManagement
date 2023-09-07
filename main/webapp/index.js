function showIframe(page){
    const buttons = document.querySelectorAll('button');
    buttons.forEach(button => {
    button.style.backgroundColor="rgb(52 52 100)";
    button.style.fontWeight="600";
    button.style.border="none";
});

    // Highlight the clicked button
    const clickedButton = document.getElementById(page);
    clickedButton.style.fontWeight = '800';
    clickedButton.style.border="2px solid white";

    
    switch(page){
        case 'doctorPage' : document.getElementById('formElement').src = "./add_doctor.html";
        break;
        case 'departmentPage' : document.getElementById('formElement').src = "./add_department.html";
        break;
        case 'patientPage' : document.getElementById('formElement').src = "./add_patient.html";
    }
    document.getElementById("formElement").style.display = "block";

    
}