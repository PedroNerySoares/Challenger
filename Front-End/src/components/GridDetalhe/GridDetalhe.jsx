import React, { useEffect, useState } from "react";
import { Table } from "react-bootstrap";
import { busca } from "../../services/RecuperarUsuarios";
export default function GridDetalhe({ url }) {
  const [post, setPost] = useState([]);
  useEffect(() => {
    busca(url, setPost);
  }, []);
  console.log(post.data);

  return (
    <Table striped bordered hover>
      <thead>
        <tr>
          <th colspan="3">ORIGEM</th>
          <th colspan="3">DESTINO</th>
          <th rowspan="2">VALOR</th>
        </tr>
        <tr>
          <td>BANCO</td>
          <td>AGÊNCIA</td>
          <td>CONTA</td>
          <td>BANCO</td>
          <td>AGÊNCIA</td>
          <td>CONTA</td>
          <td></td>
        </tr>
      </thead>
      <tbody>
        { post.map((post) => (
          <tr>
            <td>{post.bancoOrigem}</td>
            <td>{post.agenciaOrigem}</td>
            <td>{post.contaOrigem}</td>

            <td>{post.bancoDestino}</td>
            <td>{post.agenciaDestino}</td>
            <td>{post.contaDestino}</td>
            <td>R${post.valorTransacao}</td>
            
          </tr>
        ))
        }
      </tbody>
    </Table>
  );
}
