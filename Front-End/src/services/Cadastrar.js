const axios = require('axios').default

export default function Cadastrar(){
   
    const usuario = document.getElementById("user").value;
    const email = document.getElementById("email").value;
    console.log(usuario + email);

    
    axios.post('http://localhost:8080/usuario',{
        usuario : usuario,
        email:email

    }) .then(function (response) {
        console.log(response);
        
      })
      .catch(function (error) {
        console.error(error);
      });
}