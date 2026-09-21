const themeButton = document.createElement("button");

themeButton.textContent = "🌙 Dark Mode";

document.body.prepend(themeButton);

themeButton.addEventListener("click", () => {
    document.body.classList.toggle("dark");

    if (document.body.classList.contains("dark")) {
        themeButton.textContent = "☀️ Light Mode";
    } else {
        themeButton.textContent = "🌙 Dark Mode";
    }
});

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

select.append(
    option,
    option1,
    option2,
    option3
);

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

form.append(
    company,
    role,
    locationInput,
    select,
    button
);

document.body.append(form);

let applications =
    JSON.parse(localStorage.getItem("applications")) || [];

let editingId = null;

const dashboard = document.createElement("div");

dashboard.id = "dashboard";

document.body.append(dashboard);

const searchInput = document.createElement("input");

searchInput.placeholder = "Search applications...";

document.body.append(searchInput);

let searchText = "";

searchInput.addEventListener("input", () => {
    searchText = searchInput.value.toLowerCase();
    displayApplications();
});

const applicationList = document.createElement("div");

applicationList.id = "applicationList";

document.body.append(applicationList);

form.addEventListener("submit", (event) => {
    event.preventDefault();

    if (
        company.value.trim() === "" ||
        role.value.trim() === "" ||
        locationInput.value.trim() === ""
    ) {
        alert("Please fill all fields");
        return;
    }

    if (editingId === null) {
        const application = {
            id: Date.now(),
            company: company.value.trim(),
            role: role.value.trim(),
            location: locationInput.value.trim(),
            status: select.value
        };

        applications.push(application);

        localStorage.setItem(
            "applications",
            JSON.stringify(applications)
        );
    } else {
        const application = applications.find(
            app => app.id === editingId
        );

        application.company = company.value.trim();
        application.role = role.value.trim();
        application.location = locationInput.value.trim();
        application.status = select.value;

        localStorage.setItem(
            "applications",
            JSON.stringify(applications)
        );

        editingId = null;
        button.textContent = "Submit";
    }

    displayApplications();

    company.value = "";
    role.value = "";
    locationInput.value = "";
    select.value = "Applied";
});

function displayApplications() {
    displayStats();

    const filteredApplications =
        applications.filter(application => {
            const matchesSearch =
                application.company
                    .toLowerCase()
                    .includes(searchText) ||
                application.role
                    .toLowerCase()
                    .includes(searchText) ||
                application.location
                    .toLowerCase()
                    .includes(searchText);

            const matchesStatus =
                selectedStatus === "All" ||
                application.status === selectedStatus;

            return matchesSearch && matchesStatus;
        });

    applicationList.innerHTML = "";

    if (filteredApplications.length === 0) {
        const message = document.createElement("p");

        if (applications.length === 0) {
            message.textContent = "📋 No job applications yet.";
        } else {
            message.textContent = "🔍 No applications found.";
        }

        applicationList.append(message);
        return;
    }

    for (let application of filteredApplications) {
        const card = document.createElement("div");

        card.classList.add("application-card");

        card.classList.add(
            application.status.toLowerCase()
        );

        card.textContent =
            `${application.company} - ` +
            `${application.role} - ` +
            `${application.location} - ` +
            `${application.status}`;

        const deleteButton =
            document.createElement("button");

        deleteButton.type = "button";
        deleteButton.textContent = "Delete";

        deleteButton.addEventListener("click", () => {
            applications =
                applications.filter(
                    app => app.id !== application.id
                );

            localStorage.setItem(
                "applications",
                JSON.stringify(applications)
            );

            displayApplications();
        });

        const editButton =
            document.createElement("button");

        editButton.type = "button";
        editButton.textContent = "Edit";

        editButton.addEventListener("click", () => {
            editingId = application.id;

            company.value = application.company;
            role.value = application.role;
            locationInput.value = application.location;
            select.value = application.status;

            button.textContent = "Update Application";
        });

        card.append(
            deleteButton,
            editButton
        );

        applicationList.append(card);
    }
}

function displayStats() {
    const total = applications.length;

    const applied =
        applications.filter(
            application =>
                application.status === "Applied"
        ).length;

    const interviews =
        applications.filter(
            application =>
                application.status === "Interview"
        ).length;

    const selected =
        applications.filter(
            application =>
                application.status === "Selected"
        ).length;

    const rejected =
        applications.filter(
            application =>
                application.status === "Rejected"
        ).length;

    dashboard.innerHTML = `
        <div>Total Applications: ${total}</div>
        <div>Applied: ${applied}</div>
        <div>Interviews: ${interviews}</div>
        <div>Selected: ${selected}</div>
        <div>Rejected: ${rejected}</div>
    `;
}

displayApplications();