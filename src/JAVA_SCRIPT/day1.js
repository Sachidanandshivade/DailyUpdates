const cars = ["Volvo","BMW","Saab"];
const bikes = new Array("Hero", "Royal Engfield", "Triump");
console.log(cars);
console.log(bikes);

let name = Array.from("hello");
let arr = Array.of(5);
let arr1 = new Array(5); // empty array of 5 slots

let arr2 = [...arr,34,5,6];

let arr3 = ["Java", "Python", "JavaScript"];
let str = arr3.join(" ");
console.log(str);

let text = JSON.stringify(cars);
console.log(text);


cars.push("Mahindra");

// Basic Array Methods
// Array length
// Array toString()
// Array at()
// Array join()
// Array pop()
// Array push()
// Array shift()
// Array unshift()
// Array isArray()
// Array delete()
// Array concat()
// Array copyWithin()
// Array flat()
// Array slice()
// Array splice()
// Array toSpliced()

console.log(cars.length);
console.log(arr2.toString());
console.log(cars.at(2));
console.log(typeof(cars.join("*")));
console.log(cars.pop());
cars.push("BMW");
console.log(cars.shift());
cars.unshift("Mercedes");
console.log(cars);

console.log(cars.concat(bikes,arr2));
const myArr = [[1,[2,3]],[3,4],[5,6]];
console.log(myArr.flat());

const fruits = ["Apple", "Bananan", "Orange", "Mango"];
console.log(fruits.splice(1,3,"Lemon"));
console.log(fruits);
fruits.splice(1,1);
console.log(fruits);
console.log(fruits.slice(1));
console.log(fruits);


//Search Methods

console.log(fruits.indexOf("Apple"));
console.log(fruits.lastIndexOf("Apple"));

console.log(fruits.includes("Mango"));

const n = [1,2,3,4,5,6];
let no = n.findLastIndex(fun);

function fun(value, index, array) {
    return value > 3;
}
console.log(no);


console.log(cars.sort());
console.log(cars.reverse());
console.log(cars.toSorted());
console.log(cars.toReversed());

const points = [10,20,30,40,50];
console.log(Math.min.apply(null,points));
console.log(Math.max.apply(null,arr2));

for (let key of points.keys()) {
    console.log(key);
}

for (let key of points.entries()) {
    console.log(key);
}

const person = {
    name: "Sachi"
};

function greet(greeting) {
    return greeting + " " + this.name;
}
console.log(greet.call(person, "Hello"))

