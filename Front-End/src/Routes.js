import React from "react";
import {
    Routes,
    Route
} from "react-router-dom";
import Importacao from "./pages/Importacao/Importacao";
import ImportacaoDetalhe from "./pages/ImportacaoDetalhe/Importacao";


import Login from "./pages/Login/Login";
import SingUp from "./pages/SingUp/SingUp";
import TransacaoSuspeita from "./pages/TransacaoSuspeita/TransacaoSuspeita";
import Usuarios from "./pages/Usuarios/Usuarios";

export default function MainRoutes(){
    return(
        <Routes>
           
            <Route path="/" element={<Login/>}></Route>
            <Route path="/singup" element={<SingUp />}></Route>
            <Route path="/transacao" element={<Importacao/>}></Route>
            <Route path="/usuarios" element={<Usuarios  />}></Route>
            <Route path="/detalhe" element={<ImportacaoDetalhe  />}></Route>
            <Route path="/transacaoSuspeita" element={<TransacaoSuspeita  />}></Route>
            
            <Route path="*" element={"Not Found"}></Route>

        </Routes>
    )
}