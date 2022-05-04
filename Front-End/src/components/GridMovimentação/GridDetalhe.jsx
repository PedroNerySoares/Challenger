import React, { useEffect, useState } from "react";
import { Table } from "react-bootstrap";
import { busca } from "../../services/RecuperarUsuarios";
export default function Movimentaco({ url }) {
  const [post, setPost] = useState([]);
  useEffect(() => {
    busca(url, setPost);
  }, []);
  console.log(post.data);

  return (
    <Table striped bordered hover>
      <thead>
        <tr>
          <th>Banco</th>
          <th>Agência</th>
          <th>Conta</th>
          <th>Valor Movimentado</th>
          <th>Tipo Movimentação</th>
        </tr>
      </thead>
      <tbody>
        {post.map((post) => (
          <tr>
            <td>{post.bancoOrigem}</td>
            <td>{post.agenciaOrigem}</td>
            <td>{post.contaOrigem}</td>

            <td>{post.bancoDestino}</td>
            <td>{post.agenciaDestino}</td>
            <td>{post.contaDestino}</td>
            <td>R${post.valorTransacao}</td>
          </tr>
        ))}
      </tbody>
    </Table>
  );
}
