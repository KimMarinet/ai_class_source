import { useState, useRef, useEffect } from "react";

const Counter= () => {
    const [number, setNumber] = useState(0);

    const cntRef = useRef(0);
    const h1Ref = useRef();

    useEffect(() =>{
        console.log('h1Ref', h1Ref.current);
        h1Ref.current.style.background = 'orange';
    },[h1Ref]);

    const onPlus = () => {
        setNumber(number + 1);
        console.log('cntRef.current',cntRef.current);
        cntRef.current++;
       
    };
    const onMinus = () => setNumber(number - 1);

    return (
        <>
            <button type="button" onClick={onPlus}>
                +1
            </button>
            <h1 ref={h1Ref}>{number}</h1>
            <button type="button" onClick={onMinus}>
                -1
            </button>
        </>
    );
}

export default Counter;