import React from 'react';
import {BrowserRouter as Router} from "react-router-dom";
import Navbar2 from './components/Navbar2';
import Usuarios2 from './pages/Usuarios/Usuarios';
// import Table from './pages/Usuarios/tables/inde';

import Routes from './Routes'

function App() {

  const axios = require('axios').default
  const dados=[
    {id:1,usuario:"kmaleo",email:"kmaleo@gmail.com"},
    {id:2,usuario:"pedro",email:"pedro@gmail.com"},
    {id:3,usuario:"mayara",email:"mayara@gmail.com"},
    {id:4,usuario:"marcia",email:"marcinhadojaca@gmail.com"}
  ]

  return (
    // <Usuarios2 />
     <Router >
       <Routes />
     </Router>

  );
}

export default App;
