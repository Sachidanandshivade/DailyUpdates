function reverseString(str){
let result = "";
for(let i=str.length-1; i>=0;i--) {
    let c = str.charAt(i);
    result += c;
}
return result;
}

console.log(reverseString("hello"));

function isPalindrome(str){
let result = "";
for(let i=str.length-1; i>=0;i--) {
    let c = str.charAt(i);
    result += c;
}
return result === str;
}

console.log(isPalindrome("hello"));


function findLargest(arr){
let max = -Infinity;
for(let i=0;i<arr.length;i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}
return max;
}

console.log(findLargest([10,5,25,8,30,15]));

function findSmallest(arr){
let min = Infinity;
for(let i=0;i<arr.length;i++) {
    if(arr[i] < min) {
        min = arr[i];
    }
}
return min;
}

console.log(findSmallest([10,5,25,8,30,15]));


function findSLargest(arr){
let max = -Infinity;
let sMax = max;
for(let i=0;i<arr.length;i++) {
    if(arr[i] > max) {
        sMax = max;
        max = arr[i];
    }else if(arr[i] <= max && arr[i] > sMax){
        sMax = arr[i];
    }
}
return sMax;
}

console.log(findSLargest([10,5,25,8,30,15]));




function findDuplicates(arr) {
    let m  = new Map();
    let result = [];
    for(let i=0;i<arr.length;i++) {
        m.set(arr[i],(m.get(arr[i]) || 0)+1);
    }
    for(let num of m.keys()){
        if(m.get(num) > 1) {
            result.push(num);
        }
    }
    return result;
}



const input = document.createElement("input");
const button = document.createElement("button");
const list = document.createElement("ul");

input.placeholder = "Enter task...";
button.textContent = "Add Task";

document.body.append(input);
document.body.append(button);
document.body.append(list);

button.addEventListener("click", ()=> {
   const li = document.createElement("li");
   const deleteButton = document.createElement("button");
   deleteButton.textContent = "Delete";
    li.textContent = input.value;
    deleteButton.addEventListener("click", () => {
    li.remove();
})
    li.append(deleteButton);
    list.append(li);

});


const list1 = document.createElement("ul");

for (let i = 1; i <= 3; i++) {

    const li = document.createElement("li");
    const button = document.createElement("button");

    li.textContent = `Task ${i}`;
    button.textContent = "Delete";

    li.append(button);
    list1.append(li);
}

document.body.append(list);
list1.addEventListener("click", (event) => {

    console.log(event.currentTarget);
    event.stopPropagation();
    // figure out which button was clicked

});





