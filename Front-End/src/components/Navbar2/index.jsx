import React from "react";
import { Link } from "react-router-dom";
import { ReactComponent as GitHubIcon } from "../../assets/github.svg";
import "./styles.css";

function Navbar2() {
  return (
    <div className="container_navbar">
      <div className="Container_link">
        <Link to={"/transacao"}>Importações</Link>
        <Link to={"/usuarios"}>Usuários</Link>
        <Link to={"/detalhe"}>detalhe</Link>
        <Link to={"/transacaoSuspeita"}>Transação Suspeita</Link>
        <Link to={"/"}>Sair</Link>
      </div>
      <a href="https://github.com/PedroNerySoares">
        <div id="container_git">
          <GitHubIcon />
          <p className="nav-contact-link">/Pedro Soares</p>
        </div>
      </a>
    </div>
  );
}
export default Navbar2;
