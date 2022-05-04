export default function Importar() {
 
const axios = require('axios').default


axios.post('http://localhost:8080/arquivo',{
    nomeArquivo : 'C:/Users/pedro/Downloads/transacoes-2022-01-01.csv',
	  tamanho:'45.5'
}) .then(function (response) {
    console.log(response);
    
  })
  .catch(function (error) {
    console.error(error);
  });
  
     
}

