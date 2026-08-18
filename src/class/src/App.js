import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import { createContext, useContext } from 'react';
import Greeting from './components/Greeting';
import Memo from './components/Memo';
import Callback from './components/Callback';
import Reference from './components/Reference';
import Card1 from './components/Context';

function App() {
   const ThemeContext = createContext();
   const theme = 'dark';
   return (
      <>
      <ThemeContext.Provider value={theme}>
    <Greeting />
    <Memo />
    <Callback />
    <Reference />
    <Card1 />
    </ThemeContext.Provider>
    </>
   );
}

export default App;
