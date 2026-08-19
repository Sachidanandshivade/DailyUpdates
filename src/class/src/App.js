import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import { createContext, useContext } from 'react';
import Greeting from './components/Greeting';
import Memo from './components/Memo';
import Callback from './components/Callback';
import Reference from './components/Reference';
import Card1 from './components/Context';
import { BrowserRouter } from 'react-router-dom';
import Navbar from './components/Navbar';
import { Route,Routes } from 'react-router-dom';

function App() {
   const ThemeContext = createContext();
   const theme = 'dark';
   return (
      <>
      <BrowserRouter>
      <ThemeContext.Provider value={theme}>
         <Navbar />
         <Routes>
            <Route path = "/Greeting"  element= {<Greeting />}></Route>
            <Route path = "/Memo"  element= {<Memo />}></Route>
            <Route path = "/Reference"  element= {<Reference />}></Route>
         </Routes>
    </ThemeContext.Provider>
    </BrowserRouter>
    </>
   );
}

export default App;
