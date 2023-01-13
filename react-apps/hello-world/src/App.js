import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet';
import NoJSX from './components/NoJSX';
import ConditionalRendering from './components/ConditionalRendering';
import ListRendering from './components/ListRendering';
import TraineeForm from './components/TraineeForm';

function App() {
  return (
    <div className="App">
    <div className='container'>
      {/* <header className="App-header">
       <h1>Hello World.. Welcome to React</h1>
       <Greet message={'React is fun'}/>
       <Greet message={'We like SPA Apps'}/>
       <Greet message={'We can use Angular too'}/>
      </header> */}

      {/* <NoJSX/> */}

      {/* <ConditionalRendering/> */}
      {/* <ListRendering/> */}

      <TraineeForm/>
      </div>
    </div>
  );
}

export default App;
