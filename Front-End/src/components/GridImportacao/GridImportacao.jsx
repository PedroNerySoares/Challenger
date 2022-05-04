import React, { useEffect, useState } from "react";
import { Button, Row } from "react-bootstrap";
import Table from "react-bootstrap/Table";
import ImportacaoDetalhe from "../../pages/ImportacaoDetalhe/Importacao";
import { busca } from "../../services/RecuperarUsuarios";

export default function GridImportacao({ url }) {
  const [post, setPost] = useState([]);
  useEffect(() => {
    busca(url, setPost);
  }, []);
  console.log(post.data);
  return (
    <>
      <Table striped bordered hover>
        <thead>
          <tr className=" tr_head">
            <th>Data Transações</th>
            <th>Data Importação</th>
            <th>Opções</th>
          </tr>
          {/* {Keys.map((Key) => (
              <th key={Key}>{Key} </th>
            ))} */}
        </thead>
        <tbody>
          {post.map((post) => (
            <tr>
              <td key={post.id}>{post.dataTransacao}</td>
              <td key={post.id}>{post.dataImportacao}</td>
              <Button 
                variant="primary" 
                size="sm" 
                value={post.id} 
                href={"/detalhe"}
                >
                Detalhar
                </Button>
            </tr>
          ))}

          {/* <tr>
            <td>1</td>
            <td>2</td>
            <td>3</td>
          </tr> */}
        </tbody>
        {/* <tbody>
  {
    data.map(record=><Row record={})
  }
</tbody> */}
      </Table>
    </>
  );
}
