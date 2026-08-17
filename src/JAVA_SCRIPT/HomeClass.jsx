import { Component } from "react";
import About from "./Components/About";
import Contact from "./Components/Contact";
import Homeclass from "./Components/Homeclass";
import Home from "./Home";

// Functional Component
class Home extends Component() {
    render() {
  return (
    <>
      <h1>Welcome to React</h1>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
      niet ad iure, ducimus quis. Facilis voluptatem</p>
      <Home />
      <About />
      <Contact />
      <Homeclass />
      <h3>- Thank you</h3>
    </>
  )
}
}

export default App;