import userEvent from '@testing-library/user-event';
import { useState, useEffect, useRef } from 'react';

function initialItems(){
    return [...(new Array(10)).keys()].map(i => ({id: i+1, title: '할일${i}',}))
}

const Todo = () => {
  /*const [items, setItems] = useState([
    { id: 1, title: '할일1' },
    { id: 2, title: '할일2' },
    { id: 3, title: '할일3' },
  ]);*/

  const [items, setItems] = useState(initialItems);
  const [title, setTitle] = useState();
  const [cnt, setCnt] = useState(0);

  useEffect(() => {
    console.log("컴포넌트가 마운트 되었을 때 한번 실행")

    return () => {
      console.log('뒷정리 함수 - 컴포넌트가 언마운트 되었을 때 호출');
    };
  },[]); // [] - 실행 기준, 비어있으면 마운트 되었을 때 1번 실행

  useEffect(() => {
    console.log("숫자가 변경되었다", cnt)

    return () => {
      console.log('뒷정리 함수 - 앞선 작업의 정리 부분을 정의');
    };
  },[cnt]);

  const onClick = () => {
    setItems((prev) => prev.concat({ id: prev.length, title }));
  };

  const onRefresh = () => {
    setCnt(cnt + 1);
  };

  return (
    <>
      <input
        type="text"
        onChange={(e) => setTitle(e.target.value)}
        value={title}
      />
      <button type="button" onClick={onClick}>
        등록
      </button>

      <ul>
        {items.map(({ id, title }) => (
          <li key={id}>{title}</li>
        ))}
      </ul>
      <button type='button' onClick={onRefresh}>화면 갱신</button>
    </>
  );
};

export default Todo;