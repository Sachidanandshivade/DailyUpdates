// exception handlor 
// default expection handler and User defined exception handler

try {
a = 10;
c = a/b;
console.log(c);
} catch(err) {
    console.log("Error occurred:", err.message, err.name, err.stack);
}finally {
    console.log("This block will always execute");
}

// custom exception

let age = 7

try {
    if(age <= 18) {
        throw "Not Eligible to vote";
    }
    console.log("Eligible")
}
catch(e) {
    console.log(e)
}
finally {
    console.log("Thank you")
}

function div(a,b) {
    try{
    if(b == 0) {
        throw "Division by zero is not allowed";
    }
    console.log(a/b);
} catch(e) {
    console.log(e);
}finally {
    console.log("Thank you for using the division function");
}
}

div(10,0);