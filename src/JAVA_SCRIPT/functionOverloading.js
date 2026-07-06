//JavaScript doesn't support true function overloading —
// you can't define multiple functions with the same name
// but different parameter types/counts and have JS pick the right one automatically.

// Spread operator

function add(...numbers) {
    let total = 0;
    for(let num of numbers) {
        total = total+num
    }
    console.log(total)
}

add(3,3);
add(3,4,5)
add(3,4,5,6)