class Mentor {
    name;
    age;
    skill;

    constructor(name, age, skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    teach() {
        console.log(`${this.name} teaches`);
    }

    groom() {
        console.log(`${this.name} grooms`);
    }
}

let m = new Mentor("Alice", 30, "JavaScript");

console.log(`${m.name} ${m.age} ${m.skill}`);
m.teach();
m.groom();