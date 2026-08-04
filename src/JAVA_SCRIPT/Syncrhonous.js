function bookMovieTicket() {
    setTimeout(() => {
        console.log("1. Open BMS");
    },1200);
    setTimeout(() => {
    console.log("2. Select movie");
    },3000);
    setTimeout(() => {
    console.log("3. Select timings");
    },5000);
    setTimeout(() => {
    console.log("4. Select seats");
    },8000);
    setTimeout(() => {
    console.log("5. Payment");
    },2000);
}

bookMovieTicket();

function SynBookMovieTicket() {
    // Callbacks
setTimeout(() => {
    console.log("1. Open BMS");
    setTimeout(() => {
        console.log("2. Select Movie");
        setTimeout(() => {
            console.log("3. Select Timings");
            setTimeout(() => {
                console.log("4. select seats");
                setTimeout(() => {
                    console.log("5. Make payment");
                }, 2000);
            }, 8000);
        }, 5000);
    }, 3000);
}, 12000);
}

SynBookMovieTicket();