import React, { createContext, useContext } from 'react';

// Step 1: Create context
 const ThemeContext = createContext();

// Step 2: Create Provider
// function App() {
//   const theme = 'dark';
  
//   return (
//     <ThemeContext.Provider value={theme}>
//       <Header />
//       <Main />
//       <Footer />
//     </ThemeContext.Provider>
//   );
// }

// Step 3: Any component can grab the value
function Card1() {
  const theme = useContext(ThemeContext); // Grab it!
  return <div style={{ background: theme }}>Card 1</div>;
}

// function Card2() {
//   const theme = useContext(ThemeContext); // Grab it!
//   return <div style={{ background: theme }}>Card 2</div>;
// }

export default Card1;