class CoffeeMachine {
    boilwater() {
        console.log("water boiled");
    }
    addMilk() {
        console.log("Milk added");
    }
    addCoffeeBeans() {
        console.log("Beans added");
    }
    coffeeReady() {
        this.boilwater();
        this.addMilk()
        this.addCoffeeBeans();
        console.log("Your Coffee is Ready!");
    }
}

let cm = new CoffeeMachine();
cm.coffeeReady();