
const axios  = require('axios').default

export const api=axios.create({
  baseURL:'http://localhost:8080/'
})
export const busca = async(url,setDados)=>{
  const resposta = await api.get(url)
  setDados(resposta.data)
}