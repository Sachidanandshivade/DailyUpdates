const form = document.createElement("form");

const company = document.createElement("input");
company.placeholder = "Enter the Company";

const role = document.createElement("input");
role.placeholder = "Enter the role applied for";

const locationInput = document.createElement("input");
locationInput.placeholder = "Enter the location";

const select = document.createElement("select");
const option = document.createElement("option");
option.value = "Applied";
option.textContent = "Applied";
const option1 = document.createElement("option");
option1.value = "Interview";
option1.textContent = "Interview";

const option2 = document.createElement("option");
option2.value = "Selected";
option2.textContent = "Selected";

const option3 = document.createElement("option");
option3.value = "Rejected";
option3.textContent = "Rejected";

select.append(option,option1,option2,option3);


const button = document.createElement("button");
button.type = "submit";
button.textContent = "Submit";

const statusFilter = document.createElement("select");
const allOption = document.createElement("option");
allOption.value = "All";
allOption.textContent = "All";

const appliedOption = document.createElement("option");
appliedOption.value = "Applied";
appliedOption.textContent = "Applied";

const interviewOption = document.createElement("option");
interviewOption.value = "Interview";
interviewOption.textContent = "Interview";

const selectedOption = document.createElement("option");
selectedOption.value = "Selected";
selectedOption.textContent = "Selected";

const rejectedOption = document.createElement("option");
rejectedOption.value = "Rejected";
rejectedOption.textContent = "Rejected";

statusFilter.append(
    allOption,
    appliedOption,
    interviewOption,
    selectedOption,
    rejectedOption
);

document.body.append(statusFilter);

let selectedStatus = "All";

statusFilter.addEventListener("change", () => {
    selectedStatus = statusFilter.value;

    displayApplications();
});

form.append(company);
form.append(role);
form.append(locationInput);

form.append(select);
form.append(button);
document.body.append(form);

let applications = JSON.parse(localStorage.getItem("applications")) || [];
let editingId = null;


// search logic
const searchInput = document.createElement("input");
searchInput.placeholder = "Search applications...";
document.body.append(searchInput);
let searchText = "";
searchInput.addEventListener("input", ()=>{
    searchText = searchInput.value.toLowerCase();
    displayApplications();    
})



// adding values to array 
const applicationList = document.createElement("div");
document.body.append(applicationList);
form.addEventListener("submit", (event) => {
    event.preventDefault();
    if(editingId === null){
    const application = {
        id: Date.now(),
        company: company.value,
        role: role.value,
        location: locationInput.value,
        status: select.value
    };
    applications.push(application);
    localStorage.setItem("applications", JSON.stringify(applications));
}else{  

         const application = applications.find(
            app => app.id === editingId
        );

        application.company = company.value;
        application.role = role.value;
        application.location = locationInput.value;
        application.status = select.value;

        localStorage.setItem("applications", JSON.stringify(applications));

        editingId = null;

        button.textContent = "Submit";
}
    displayApplications();

    company.value = "";
    role.value = "";
    locationInput.value = "";
});






// displaying and filtering based on search

function displayApplications() {
    const filteredApplications = applications.filter(application => {

    const matchesSearch =
        application.company.toLowerCase().includes(searchText) ||
        application.role.toLowerCase().includes(searchText) ||
        application.location.toLowerCase().includes(searchText);

    const matchesStatus =
        selectedStatus === "All" ||
        application.status === selectedStatus;

    return matchesSearch && matchesStatus;
});

    applicationList.innerHTML = "";
    for(let application of filteredApplications) {
        const card = document.createElement("div");
        card.textContent = `${application.company} - ${application.role} - ${application.location} - ${application.status}`;

        const deleteBttn = document.createElement("button");
        deleteBttn.textContent = "Delete";

        deleteBttn.addEventListener("click", () => {
            applications = applications.filter(app => app.id !== application.id);
            localStorage.setItem("applications", JSON.stringify(applications));
            displayApplications();
        });

        const edit = document.createElement("button");
        edit.type = "button";
        edit.textContent = "EDIT";

       

        edit.addEventListener("click", ()=>{
            editingId = application.id;
            
            company.value = application.company;
            role.value = application.role;
            locationInput.value = application.location;
            select.value = application.status;

            button.textContent = "Update Application";
        });

        card.append(deleteBttn);
        card.append(edit);
         applicationList.append(card);
    }
   
}
displayApplications();
