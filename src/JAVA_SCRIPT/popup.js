
let res = confirm("do you want to continue")
if(res) {
    console.log("User selected ok")
}else {
    console.log("User selected cancel")
}

let name = prompt("enter your name:")
console.log("heelo" , name)

let a = prompt("enter a number:")
let b = prompt("enter another number:")
let resu = confirm("do you want to add the numbers")
if(resu) {
    console.log(a+b)
}else{
    console.log("Thank you")
}