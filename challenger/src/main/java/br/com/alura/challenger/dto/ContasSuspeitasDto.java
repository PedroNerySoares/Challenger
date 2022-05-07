package br.com.alura.challenger.dto;

import javax.persistence.Id;

public class ContasSuspeitasDto {
	
	private String banco;
	private String agencia;
	private String conta;
	private Double valor;
	private String operacao;
	
	
	
	public ContasSuspeitasDto() {};

	public ContasSuspeitasDto(String banco, String agencia, String conta, Double valor, String operacao) {
	
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.valor = valor;
		this.operacao = operacao;
	}

	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	
	
	
}
