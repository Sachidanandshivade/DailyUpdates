let fruits = ["apple", "mango", "orange"];

// Using forEach
fruits.forEach(f => console.log(f));

// Using for...of loop (for arrays)
for (let i of fruits) {
    console.log(i);
}


// Using for...in loop (for objects)
let stu = {
    "name": "Suganth",
    "age": 21
};

for (let s in stu) {
    console.log(`${s} is ${stu[s]}`);
}
// Output will be:
// name is Suganth
// age is 21


const correct_pin = "1234";
let entered_pin;

