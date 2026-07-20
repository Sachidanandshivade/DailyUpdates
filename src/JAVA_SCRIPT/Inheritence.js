const FlyMixin = {
    fly() {
        console.log("Flying...");
    }
};

const SwimMixin = {
    swim() {
        console.log("Swimming...");
    }
};

class Duck {}

// Prototype Inheritance
Object.assign(Duck.prototype, FlyMixin, SwimMixin);

const duck = new Duck();
duck.fly();
duck.swim();


class Bank {
    #balance;
    constructor(balance) {
        this.#balance = balance; //private
    }

    getBalance() {
        return this.#balance
    }

    setBalance(newBalance) {
        if(newBalance > 0){
            this.#balance = newBalance
        }
        else {
            console.log("Invalid balance")
        }
    }
}

let b = new Bank(30000)
// console.log(b.#balance)
console.log(b.getBalance())
b.setBalance(60000)
console.log(b.getBalance())