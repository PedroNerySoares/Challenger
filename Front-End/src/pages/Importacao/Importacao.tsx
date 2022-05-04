import React, { Component, useState } from "react";
import { Button, Form } from "react-bootstrap";
import GridImportacao from "../../components/GridImportacao/GridImportacao";
import GridUsuarios from "../../components/GridUsuarios/Usuarios";
import Navbar2 from "../../components/Navbar2";

import "./Importacao.css";
export default function Importacao() {
  return (
    <>
      <Navbar2 />
      <div className="container_GridImportacao">
        <h2>Importar Transações</h2>
        <Form.Group controlId="formFile" className="mb-3">
          <Form.Control type="file" />
          <Button type="submit">Importar</Button>
        </Form.Group>
        
        <h2>Importados Realizados</h2>
        <GridImportacao url={'/arquivo'} />
      </div>
    </>
  );
}
