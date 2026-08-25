const d = new Date();
console.log(d);

const dd = new Date();
console.log(dd.toLocaleString('en-IN'));
console.log(dd.toLocaleString('en-US'));
console.log(dd.toLocaleDateString('en-IN'));
console.log(dd.toLocaleString('ja-JP'));

const bithdate = new Date('2005-04-28');
const date = new Date();
const ag = date.getFullYear() - bithdate.getFullYear();
console.log(ag);

const cd = new Date(2026, 7, 25);
console.log(cd);

const timestamp = Date.now();  // jan 1, 1970 Unix timestamp/epoch timestamp
const s = new Date(timestamp);
console.log(s);

function age(dateString) {
    const birthdate = new Date(dateString);  // Parse the birth date
    const today = new Date();                 // Get today's date
    let agee = today.getFullYear() - birthdate.getFullYear();  // Initial age difference
    
    // Check if birthday hasn't occurred yet this year
    if (today.getMonth() - birthdate.getMonth() < 0 || 
      (today.getMonth() === birthdate.getMonth() && today.getDate() < birthdate.getDate())) {
    agee--;  // Subtract 1 if birthday hasn't happened yet
  }
  return agee;
}

console.log(age("2005-04-28"));


function deaedlineC(time) {
    const deadline = new Date(time);
    const today = new Date();

    if(today > deadline) {
        console.log("Application closed");
    }else{
        console.log("Application is still open");
    }
}

deaedlineC("2026-08-26");

const deadline = new Date("2026-08-26T10:00:00");
const now = new Date();

const difference = deadline-now;
const hours = Math.floor(difference/(1000 * 60*60));
const minutes = Math.floor(
    (difference / (1000 * 60)) % 60
);

const seconds = Math.floor(
    (difference / 1000) % 60
);

console.log(`${hours}:${minutes}:${seconds}`);


function countdown(minutes) {
    let time = minutes*60;
    let timer = setInterval(()=>{
        let min = Math.floor(time/60);
        let sec = time%60;

        console.log(`${min}:${sec < 10 ? "0" + sec: sec}`);
        time--;

        if(time < 0) {
            clearInterval(timer);
            console.log("Time Up!");
        }
    },1000);
}

// countdown(5);



// formatting 

const dat = new Date();
console.log(dat);
// console.log(dat.toDateString());
// console.log(dat.toTimeString());
console.log(dat.getFullYear());
console.log(dat.getUTCFullYear());



