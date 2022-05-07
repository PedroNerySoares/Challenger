export default function Importar(nomeArquivo,tamanho) {
 
const axios = require('axios').default

console.log()


axios.post('http://localhost:8080/transacao',{
    nomeArquivo : "C:/Users/pedro/Downloads/"+nomeArquivo,
	  tamanho:tamanho
}) .then(function (response) {
    console.log(response);
    
  })
  .catch(function (error) {
    console.error(error);
  });
  
     
}

