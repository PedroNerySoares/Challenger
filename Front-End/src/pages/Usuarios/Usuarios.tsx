import React, { Component, useState } from "react";
import { Button } from "react-bootstrap";
import { collapseTextChangeRangesAcrossMultipleVersions, isConstructorDeclaration } from "typescript";
import GridUsuarios from "../../components/GridUsuarios/Usuarios";

import Navbar2 from "../../components/Navbar2";
import "./Usuarios.css";

export default function Usuarios2() {


  return (

      <div className="containerUsu"> 
      <Navbar2 />
      <h1>Usuários Cadastrados</h1>
      <GridUsuarios url={'/usuario'} />
      </div>

  );
}
