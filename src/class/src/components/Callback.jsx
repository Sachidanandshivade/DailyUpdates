import React, {useCallback, useState} from 'react';

// remembers the function and avoids rerender until the state/ data provided changes
function Callback() {
    const[clicks, setClicks] = useState(0);
const sayHello = () => {
    console.log("Hello!");
}

    return (
        <>
        <p> Want to talk</p>
        <button onClick={sayHello}>Click ME</button>
        </>
    )
}

export default Callback;