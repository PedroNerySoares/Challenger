import React from 'react';
import {BrowserRouter as Router} from "react-router-dom";
import Navbar2 from './components/Navbar2';
import Usuarios2 from './pages/Usuarios/Usuarios';
// import Table from './pages/Usuarios/tables/inde';

import Routes from './Routes'

function App() {

  return (
  
     <Router >
       <Routes />
     </Router>

  );
}

export default App;
