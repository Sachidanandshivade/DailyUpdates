import React, {useRef, useState} from 'react';

//  used to grab an element from webpage and control it
function Reference() {
    const inputRef = useRef(null);

    const focusInput = ()=> {
        inputRef.current.focus();
    };
    console.log("hello there");

    return (
        <>
        <input ref={inputRef} type="text" />
        <button onClick={focusInput}>Focus Inside textbox</button>
        </>
    )
}

export default Reference;