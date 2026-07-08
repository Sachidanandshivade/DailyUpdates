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