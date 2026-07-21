class Animal {
    make_sound() {
        console.log("Animal makes sound");
    }
}

class Dog extends Animal {
    make_sound() {
        console.log("Bow Bow");
    }
}

class Cat extends Animal {
    make_sound() {
        console.log("Meow Meow");
    }
}

// Creating instances
let d = new Dog();
let c = new Cat();

// Calling methods
d.make_sound(); // Output: Bow Bow
c.make_sound(); // Output: Meow Meow