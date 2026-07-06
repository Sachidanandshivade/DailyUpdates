
//function  declaration  - are default hoisted
function square() {
    let num = 10
    console.log(`the square of the number is ${num*num}`)
}
square()




//function expression  -- not hoisted
let square2 = function() {
    let num = 20
    console.log(`The square of the number is ${num * num}`)
}
square2();




//arrow function
let square3 = (num) => console.log(`The square of the number is ${num * num}`)
square3(30);

let add = (a, b) => a + b;
console.log(add(10, 20)); // 30



//anonymous function  - IIFE
    (function () {
        console.log("hello everyone")
    })();




// 4 types of functions for finding largest of 3 numbers

function largest(num1 , num2, num3){
    if(num1>num2 && num1>num3) {
        console.log(num1)
    }else if(num2> num1 && num2>num3) {
        console.log(num2);
    }else {
        console.log(num3);
    }
}
largest(10,2,3)


let largest1 = function(num1 , num2, num3) {
    if(num1>num2 && num1>num3) {
        return num1
    }else if(num2> num1 && num2>num3) {
        return num2
    }else {
       return num3;
    }
}
console.log(largest1(10,29,30));

const lar = (num1 , num2, num3) => {
    if(num1>num2 && num1>num3) {
       return num1;
    }else if(num2> num1 && num2>num3) {
        return num2;
    }else {
        return num3;
    }
}
console.log(lar(1,3,4));





(function(num1 , num2, num3){
    if(num1>num2 && num1>num3) {
         console.log(num1);
    }else if(num2> num1 && num2>num3) {
        console.log(num2);
    }else {
        console.log(num3);
    }
})(1,2,3);