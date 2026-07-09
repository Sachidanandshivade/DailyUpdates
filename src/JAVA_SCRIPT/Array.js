let arr = [101,"Abhi",6.9,true]
console.log(arr[3])
console.log(arr[2])
console.log(arr)

arr.push(9)
arr.unshift(10)




//replacing
arr.splice(1,2,"sachi", 17)
console.log(arr)
arr.pop();
arr.shift()
console.log(arr.slice(1,3))
console.log(arr)

let a = [3,7,2,5,8,1]
console.log(a.sort().reverse())

let mul5 = arr.map(n => n*5)
console.log(mul5)

let even = arr.filter(n => n%2 === 0)
console.log(even)

let sum = arr.reduce((sum,n)=> sum+arr,0)
console.log(sum)

let b =[10,11,12]
console.log(b.concat(a))

//join
let words = ["I", "am", "Knowledgeable"] // I am Knowledgeable
let sentence = words.join(" ")
console.log(sentence)

//Destructuring array
let mentor = ["Gama", "Sandesh", "Sharana"]
let[Web, Python, Java] = mentor
console.log(mentor)
console.log(Web) //Gama
console.log(Java) //Sharana
console.log(Python) //Sandesh