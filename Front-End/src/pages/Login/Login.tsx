import React, { useState } from "react";
import "./Login.css";
import { Form, Button, Card, Container } from "react-bootstrap";
import { Navigate, useNavigate } from "react-router-dom";

export default function Login() {
  const navigate = useNavigate();
  const [usuario, setEmail] = useState("");
  const [password, setPassWord] = useState("");

  // const handleSubmit = (e) => {
  //   e.preventDefault();
  //   console.log("Submit", { usuario, password });
  // };

  return (
    <div className="container">
      <form className="login-form" >
        <div className="login center">
          <h3>Login</h3>
        </div>

        <div>
          <input
            placeholder="Nome"
            type="text"
            className="text-center form-control"
            autoFocus
            id="user"
          />
        </div>

        <div>
          <input
            placeholder="Senha"
            type="password"
            className="text-center form-control"
            autoFocus
            id="password"
          />
        </div>

        <br />

        <button 
          type="submit"
          className="btn"
          onClick={() => navigate("/transacao")}  
        >
          Login
        </button>
        <button
          type="submit"
          className="btn"
          onClick={() => navigate("/singup")}
        >
          Resigstra-se
        </button>
      </form>
    </div>
  );
}
