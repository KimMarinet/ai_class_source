import { useState } from "react";
import TodoForm from '../components/TodoForm';
import TodoItems from "../components/TodoItems";

const TodoContainer = () => {

    const [form, setForm] = useState({});
    const [items, setItems] = useState([]);
    const [errors, setErrors] = useState({});
    
    const onSubmit = (e) => {
        e.preventDefault();

        let hasErrors = false;

        const requiredFields = {
            title: '제목을 입력하세요.',
            content: '내용을 입력하세요.',
        };

        const errors = {};

        for (const [field, message] of Object.entries(requiredFields)) {
            if (!form[field] || !form[field]?.trim()) {
                errors[field] = message;
                hasErrors = true;
            }
        }

        setErrors(errors);

        if (hasErrors) return;

        setItems(items.concat({ ...form, id: Date.now() }));

        setForm({});
    };

    const onChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const onToggle = (id) => {
        setItems((prevItems) =>
        prevItems.map((item) =>
            item.id === id ? { ...item, checked: !item.checked } : item,
        ),
        );
    };

    // 스케쥴 삭제
    const onRemove = (id) => {
        setItems((prevItems) => prevItems.filter((item) => item.id !== id));
    };

    const onRemoveAll = () => {
        setItems(items.filter(({checked}) => !checked));
    }
    
    return(
        <>
            <TodoForm
                onSubmit={onSubmit}
                onChange={onChange}
                form={form}
                errors={errors}
            />
            <TodoItems 
                items={items} 
                onToggle={onToggle} 
                onRemove={onRemove}
                onRemoveAll = {onRemoveAll} 
            />
        </>
    );
}

export default TodoContainer;