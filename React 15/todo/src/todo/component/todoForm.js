import { FaPlusSquare, FaRoad } from "react-icons/fa";
import { FaPersonMilitaryPointing } from "react-icons/fa6";

const todoForm = ({ onSubmit, onChange, form }) => {
    console.log('TodoForm 랜더링')
    return (
        <form onSubmit={onSubmit}>
        <div>
            <input
            type="text"
            onChange={onChange}
            name="title"
            placeholder="할일 제목"
            value={form?.title ?? ''}
            />
        </div>
        <div>
            <textarea
            onChange={onChange}
            name="content"
            placeholder="할일 내용"
            value={form?.content ?? ''}
            ></textarea>
        </div>
        <button type="submit">
            <FaPlusSquare />
        </button>
        </form>
    );
};

export default todoForm;