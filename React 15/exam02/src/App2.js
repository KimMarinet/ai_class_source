import { Fragment } from 'react/jsx-runtime';
import MyComponent from './components/MyComponent';
import MyComponent2 from './components/MyComponent2';

const App2 = () => {
  return (
    <Fragment>
      <MyComponent name="김문수" number ={7}/>
      <MyComponent2 />
    </Fragment>
  );
};

export default App2;
