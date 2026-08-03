// function that accepts another function as an argument  or returns a function as its output is HOF
function order(callprepare) {
    console.log("Customer order for food");
    callprepare();
}

function prepare() {
    console.log("food prepared");
}

order(prepare);

function creditCard(customer) {
    console.log("Processing credit card payment for" + customer);
}

function upi(customer) {
    console.log("Processing UPI payment for" + customer);
}


function payment(paymentMethod, customer) {
    console.log("Payment processing started for" + customer);
    paymentMethod(customer);
} 

payment(creditCard, "John Doe");
payment(upi, "Jane Smith");

function X () {
    let a = 10;
    return function Y() {
        console.log(a);
    }
}
let res = X(); // example of closures
res();
