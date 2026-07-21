class ATM {
    #balance = 50000;

    #checkBalance() {
        return this.#balance;
    }

    withdraw(amt) {
        if (amt <= this.#checkBalance()) {
            this.#balance -= amt;
            console.log(`Withdrew: ${amt}. Remaining Balance: ${this.#balance}`);
        } else {
            console.log("Insufficient balance!");
        }
    }
}

let atm = new ATM();
atm.withdraw(5000);