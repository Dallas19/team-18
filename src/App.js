import React from 'react';
import logo from './logo.svg';
import './App.css';
import {
    Button,
} from 'react-bootstrap';


class App extends React.Component{
  render(){
    // return <Button title="hello"/>
    return(
    <div>
    <style type="text/css">
      {`
        .btn-flat {
          background-color: purple;
          color: white;
        }

        .btn-xxl {
          padding: 1rem 1.5rem;
          font-size: 1.5rem;
        }
      `}
    </style>

    <Button variant="flat" size="xxl">
      start
    </Button>
    <style type="text/css">
    {`
      .btn-flat {
      background-color: blue;
      color: white;
      }

      .btn-xxl {
      padding: 1rem 1.5rem;
      font-size: 1.5rem;
      }
    `}
    </style>
    <Button variant = "flat" size="xxl"> Start </Button>

  </div>
);
  }
}

export default App;
