import React, { useState } from "react";
import "./SingUp.css";
import { Form, Button, Card, Container } from "react-bootstrap";
import Cadastrar from "../../services/Cadastrar";


export default function SingUp() {
  return (
   
    <div className="container">
    
      <form className="login-form2">
        <div className="login center">
          <h3>Registre-se</h3>
        </div>
        <div>
          <input
            placeholder="usuario"
            type="text"
            className="text-center form-control"
            autoFocus
            id="user"
          />
        </div>

        <div>
          <input
            placeholder="email"
            type="email"
            className="text-center form-control"
            autoFocus
            id="email"
          />
        </div>
        <br />

        <button type="submit" className="btn" onClick={Cadastrar}>
          Cadastrar
        </button>
      </form>
    </div>
  );
}
