import { Fragment } from 'react/jsx-runtime';
import './App.css';

/*
function App() {
  let name;
  name = name ?? 'Default';
  ///return name ? <h1>{name}님 반갑습니다.</h1> : '';
  return name && <h1 className="greet">{name}님 반갑습니다.</h1>;
}
*/

function App() {
  return (
    <Fragment>
      <h1>반갑습니다</h1>
      <h2>안녕하세요</h2>
    </Fragment>
  );
}

export default App;
