import React, { useMemo , useState} from 'react';

//remembers the state and avoids rerendering like inn cart total value calculation
function Memo() {
    const [ a, setA] = useState(5);
    const[b, setB] = useState(3);
    const [clicks, setClicks] = useState(0);

    const sum = useMemo(()=> {
        return a+b;
    },[a,b])

return (
    <>
    <p> Sum: {sum}</p>
    <input value={a} onChange={(e)=> setA(Number(e.target.value))} />
    <input value = {b} onChange ={(e)=> setB(Number(e.target.value))} />

    <button onClick = { ()=>setClicks(clicks +1)}>
        Useless Button: {clicks}
    </button>
    </>
)
}

export default Memo;