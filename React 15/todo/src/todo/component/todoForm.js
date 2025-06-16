import { FaPlusSquare } from "react-icons/fa";

const todoForm = ({onSubmit}) => {
    return (
        <form onSubmit={onSubmit}>
            <input type="text"></input>
            <button type="submit">
                <FaPlusSquare />
            </button>
        </form>
    );
};

export default todoForm;