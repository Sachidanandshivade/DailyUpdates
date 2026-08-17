import React, { useEffect, useState } from "react";

export default function Greeting() {   
    let [name,setName] = useState("Aishwarya");
    const [count, setCount] = useState(0);
        const inc = () => {
          setCount(count + 1);
        };

        const dec = ()=> {
            setCount(count - 1);
        }
        const reset = () => {
            setCount(0);
        }

        useEffect(()=> {
            setTimeout(() => {
                setCount(count + 1);
            },1000);
        },[count]);
        return (
            <>
      <h1>Hello, {name}!</h1>
      <button onClick={() => setName("Sachi")}>Change Name</button>
        <h2>Count: {count}</h2>
        <button onClick={inc}>Increment</button>
        <button onClick={dec}>Decrement</button>
        <button onClick={reset}>Reset</button>
      </>
      );
}