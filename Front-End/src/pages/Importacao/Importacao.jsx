import { read } from "fs";
import React, { Component, useState } from "react";
import { Button, Form } from "react-bootstrap";
import GridImportacao from "../../components/GridImportacao/GridImportacao";
import GridUsuarios from "../../components/GridUsuarios/Usuarios";
import Navbar2 from "../../components/Navbar2";
import fileSize from 'file-size'
import "./Importacao.css";
import Importar from "../../services/importar";

export default function Importacao() {
  
  const [nameArquivo,setNameArquivo] = useState("");
  const [tamanho,setTamanho] = useState("");


  const handlearquivo= (e) => {
    

    let file = e.target.files
    let reader = new FileReader();


    setNameArquivo( file[0].name);
    setTamanho(file[0].size);
    console.log(file[0])

    
  }


  return (
    

    <>
      
      <Navbar2 />
      <div className="container_GridImportacao">
        <h2>Importar Transações</h2>
        <Form.Group controlId="formFile" className="mb-3">
          <Form.Control type="file"  onChange={(e)=>{handlearquivo(e)}} />
          <Button type="submit" onClick={()=>Importar(nameArquivo,tamanho)} >Importar</Button>
        </Form.Group>
        
        <h2>Importados Realizados</h2>
        <GridImportacao url={'/arquivo'} />
      </div>
    </>
  );
}
