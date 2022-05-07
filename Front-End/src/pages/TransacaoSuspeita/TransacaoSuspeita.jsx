import React, { Component, useState } from "react";
import { Button, Form, FormControl, InputGroup, Table } from "react-bootstrap";
import GridDetalhe from "../../components/GridDetalhe/GridDetalhe";
import Movimentaco from "../../components/GridMovimentação/GridDetalhe";
import LabelDetalhe from "../../components/LabelDetalher/LabelDetalhe";
import Navbar2 from "../../components/Navbar2";

import "./TransacaoSuspeita.css";
export default function TransacaoSuspeita() {
  return (
    <>
      <Navbar2 />
      <div className="container_GridImportacao">
        <h2>Análise de Transações Suspeitas</h2>
        <GridDetalhe url={'/transacao/suspeita'}/>
        <h2>Contas Suspeitas</h2>
        <Movimentaco url={'/transacao'} />
        <h2>Agências Suspeitas</h2>
        <Movimentaco url={'/transacao'} />
        
      </div>
    </>
  );
}
