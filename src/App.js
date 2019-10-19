import React from 'react';
import logo from './logo.svg';
import './App.css';
import {
    Button,
} from 'react-bootstrap';


class App extends React.Component{
  render(){
    return(

      <html>
        <style type="text/css">
        {`
              #emergency {
                font-family: 'Dancing Script', cursive;
                font-size: 40px;
                color: Black;
                background: none;
                border-radius: 10px;
                padding: 2.0em;
                outline: none;
                background-color: yellow;
              }

              .emergency {
                display: inline-block;
                height: 100%;
                align-items: center;
                font-size: 2em;
                margin: 20;
                float: left;
              }

              #Dog {
                font-family: 'Dancing Script', cursive;
                font-size: 40px;
                color: Black;
                background: none;
                border-radius: 10px;
                padding: 2.0em;
                outline: none;
                background-color: Blue;
              }

              .Dog container{
                display-inline: block;
                height: 100%;
                align-items: center;
                font-size: 2em;
                float: right;
              }

        `}
        </style>
        <div class="button">
          <button id="emergency">Emergency</button>
        </div>

        <div class="button">
          <button id="Dog">Dog</button>
        </div>
      </html>

      );
  }
}

export default App;
