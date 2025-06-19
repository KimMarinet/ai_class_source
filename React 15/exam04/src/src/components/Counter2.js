import { useCallback, useState } from "react";

const Counter2 = () => {
    const [number, setNumber] = useState(0);

    //const onPlus = () => setNumber(number + 1);
    //const onMinus = () => setNumber(number - 1);

    //const onPlus = useCallback(() => setNumber(number + 1), [number]);
    //const onMinus = useCallback(() => setNumber(number - 1), [number]);

    const onPlus = useCallback(() => {
        setNumber((number) => number + 1);
    }, []);

    const onMinus = useCallback(() => {
        setNumber((number) => number - 1);
    }, []);

    return(
        <>
            <h1>{number}</h1>
            <button type="button" onClick={onMinus}>-1</button>
            <button type="button" onClick={onPlus}>+1</button>
        </>
    )
};

export default Counter2;