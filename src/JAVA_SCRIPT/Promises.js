function checkApp(app) {
    return new Promise((resolve,reject) => {
        if(app === "BMS") {
            resolve("BMS is available ");
        }else{
            reject("BMS is not available");
        }
    });
}
checkApp("BMS").then((message) => {
    console.log("message");
})
.catch((error) => {
    console.log("error");
})
.finally(()=>{
    console.log("Thank you for using the application");
});
