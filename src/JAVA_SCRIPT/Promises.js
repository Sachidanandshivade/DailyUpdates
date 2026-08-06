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


const p = new Promise((resolve, reject) => {
  let app = "BMS";
  if (app === "BMS") {
    resolve();
  } else {
    reject(new Error("BMS not found"));
  }
});

p.then(() => {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log("Open BMS - 2s");
      resolve();
    }, 2000);
  });
})
.then(() => {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log("Select the Movie - 3s");
      resolve();
    }, 3000);
  });
})
.then(() => {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log("Select Seat - 5s");
      resolve();
    }, 5000);
  });
})
.then(() => {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log("Book the tickets - 1s");
      resolve();
    }, 1000);
  });
})
.catch((e) => {
  console.log("Error:", e.message);
})
.finally(() => {
  console.log("Close Phone");
});