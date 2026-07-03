function add(a,b) {
    let c = a + b;
    console.log(`The Sum of ${a} and ${b} is ${c}`)
}

add(10,5);

const square = (a) => a * a;
console.log(square(5));

const largest=(a,b,c) => {
    if(a>b && a>c) {
        console.log(a);
    }else if(b>a && b>c) {
        console.log(b);
    }else{
        console.log(c)
    }
}
largest(20,21,23);

const greet = (name) => {
    console.log(`Hello ${name} . Welcome to Front_End Class`);
}

greet("VIRAT");