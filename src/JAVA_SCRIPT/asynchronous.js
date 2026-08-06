function wait(ms) {
    return new Promise(resolve => setTimeout(resolve,ms));
}

async function bookTicket() {
     await wait(2000);
    console.log("Open BMS - 2s");
    await wait(10000);
    console.log("Select the Movie - 3s");
    await wait(5000);
    console.log("Select Seat - 5s");
    await wait(1000);
    console.log("Book the tickets - 1s");
}

bookTicket();