import React, { Component, useState } from "react";
import { Button, Form, FormControl, InputGroup, Table } from "react-bootstrap";
import GridDetalhe from "../../components/GridDetalhe/GridDetalhe";
import LabelDetalhe from "../../components/LabelDetalher/LabelDetalhe";
import Navbar2 from "../../components/Navbar2";

import "./Importacao.css";
export default function ImportacaoDetalhe() {
  return (
    <>
      <Navbar2 />
      <div className="container_GridImportacao">
        <h2>Detalhe da Importação</h2>

        <div className="detalheUsu">
          <div className="teste">
          
            <InputGroup className="mb-3">
              
              <LabelDetalhe name={"Importado em"} value={"04/05/2022"} />
              <LabelDetalhe name={"Importado por"} value={"Pedro Soares"} />
              <LabelDetalhe name={"Transação"} value={"01/01/2022"} />
           
            </InputGroup>
          </div>
        </div>

        <h2>Transação Importadas</h2>
        <GridDetalhe url={'/transacao'} />
      </div>
    </>
  );
}
