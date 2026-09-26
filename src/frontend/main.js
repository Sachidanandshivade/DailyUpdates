const worker = new Worker("worker.js");

const button = document.getElementById("start");
const result = document.getElementByid("result");

button.addEventListener("click", () => {
    worker.postMessage(111111111111111111111);
});

worker.onmessage = (event) => {
    result.textContent = event.data;
}