import { getValue } from "@testing-library/user-event/dist/utils";
import { get } from "http";
import React, { Children, useEffect, useState } from "react";
import { Button, Form, Modal, Table } from "react-bootstrap";
import Deletar from "../../services/DeletarUsuario";
import { busca } from "../../services/RecuperarUsuarios";
import "./Usuarios.css";

const GridUsuarios = ({ url }) => {
  const [post, setPost] = useState([]);
  useEffect(() => {
    busca(url, setPost);
  }, []);
  const [showEdit, setShowEdit] = useState(false);
  const [showExc, setShowExc] = useState(false);

  const [index, setIndex] = useState(0);
  

  const handleCloseEdit = () => setShowEdit(false);
  const handleShowEdit = () => setShowEdit(true);

  const handleCloseExc = () => setShowExc(false);
  const handleShowExc = () => setShowExc(true);

  // const id=0;
  // const valueIndex=()=> setIndex(id)

  const Head = () => {
    return (
      <tr className=" tr_head">
        <th>id</th>
        <th>Usuario</th>
        <th>Email</th>
        <th>Opções</th>
      </tr>
    );
  };

  return (
    <div className="container_login">
      <div className="containerUsuario">
        <Table striped bordered hover size="sm">
          <Head />
          {post.map((post) => (

            <tr className="tr_usuario">
              <td >{post.id}</td>
              <td>{post.usuario}</td>
              <td>{post.email}</td>

              <Button onClick={handleShowEdit } variant="primary" >
                Editar
              </Button>
              <Button onClick={handleShowExc} variant="danger"  >
                Deletar
              </Button>
            </tr>
          ))}
        </Table>

        <Modal show={showEdit} onHide={handleCloseEdit} id={(1)} >
          <Modal.Header closeButton>
            <Modal.Title>Alteração</Modal.Title>
          </Modal.Header>
          <Modal.Body>
            <Form>
              <Form.Group
                className="mb-3"
                controlId="exampleForm.ControlInput1"
              >
                <Form.Label>Email address</Form.Label>
                <Form.Control type="email" placeholder="name@example.com" />
              </Form.Group>
              <Form.Group
                className="mb-3"
                controlId="exampleForm.ControlTextarea1"
              >
                <Form.Label>Example textarea</Form.Label>
                <Form.Control as="textarea" rows={3} />
              </Form.Group>
            </Form>
          </Modal.Body>
          <Modal.Footer>
            <Button variant="secondary" onClick={handleCloseEdit}>
              Close
            </Button>
            <Button variant="primary" onClick={handleCloseEdit}>
              Save Changes
            </Button>
          </Modal.Footer>
        </Modal>

        <Modal show={(showExc)} onHide={handleCloseExc}  >
            
          <Modal.Header closeButton>
            <Modal.Title>Excluir usuario + </Modal.Title>
          </Modal.Header>

          <Modal.Body>Tem Certeza que deseja Excluir? </Modal.Body>
          <Modal.Footer>
            <Button variant="secondary" onClick={handleCloseExc}>
              Close
            
            </Button>
            <Button variant="primary"  onClick={Deletar(2)} >
              Excluir
         
            </Button>
          </Modal.Footer>
        </Modal>
      </div>
    </div>
  );
};
export default GridUsuarios;
