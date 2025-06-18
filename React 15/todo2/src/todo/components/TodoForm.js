import { FaPlus } from "react-icons/fa";

const TodoForm = ({onSubmit, onChange, form, errors}) => {
    return(
        <form onSubmit={onSubmit}>
            <h1>Title</h1>
            <div>
                <input type="text" onChange={onChange} name="title" placeholder="할일 제목" value={form?.title ?? ''}/>
                {errors?.title && <div>{errors.title}</div>}
            </div>
            <h1>Content</h1>
            <div>
                <textarea
                onChange={onChange}
                name="content"
                placeholder="할일 내용"
                value={form?.content ?? ''}
                ></textarea>
                {errors?.content && <div>{errors.content}</div>}
            </div>
            <button type="submit">
                <FaPlus />
            </button>
        </form>
    );
}

export default TodoForm;