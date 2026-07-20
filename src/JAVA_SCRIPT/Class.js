// 1. Parent Class
class Employee {
    constructor(name, age, skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    info() {
        console.log(`the name is ${this.name}`);
    }

    role() {
        console.log("Emp role...");
    }
}

// 2. Child Class: Developer
class Developer extends Employee {
    role() {
        console.log("Dev");
    }

    work() {
        console.log("Dev proj");
    }
}

// 3. Child Class: Tester
class Tester extends Employee {
    role() {
        console.log("Test");
    }

    work() {
        console.log("Testing project");
    }
}

// 4. Object Creation & Method Execution
let d = new Developer("Sam", 25, "JS"); // Example constructor arguments
let t = new Tester("Alex", 28, "QA");

d.info();   // Inherited method -> Logs: the name is Sam
t.info();   // Inherited method -> Logs: the name is Alex
d.role();   // Overridden method -> Logs: Dev
d.work();   // Specialized method -> Logs: Dev proj
t.role();   // Overridden method -> Logs: Test
t.work();   // Specialized method -> Logs: Testing project