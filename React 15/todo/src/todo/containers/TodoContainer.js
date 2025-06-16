import TodoForm from '../component/todoForm';
import TodoItems from '../component/todoItems';

const TodoContainer = () => {

    const onSubmit = (e) =>{
        e.preventDefault();
    };

  return (
    <>
        <TodoForm onSubmit={onSubmit} />
        <TodoItems />
    </>
  );
};

export default TodoContainer;