package br.com.alura.challenger.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transacao")
public class Transacao {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String bancoOrigem;
	private String agenciaOrigem;
	private String ContaOrigem;
	
	private String bancoDestino;
	private String agenciaDestino;
	private String ContaDestino;
	
	private Double valorTransacao;
	private LocalDateTime dataHoraTransacao;
	
	public Transacao(String bancoOrigem, String agenciaOrigem, String contaOrigem, String bancoDestino,
			String agenciaDestino, String contaDestino, Double valorTransacao,LocalDateTime dataHoraTransacao) {
	
		this.bancoOrigem = bancoOrigem;
		this.agenciaOrigem = agenciaOrigem;
		ContaOrigem = contaOrigem;
		this.bancoDestino = bancoDestino;
		this.agenciaDestino = agenciaDestino;
		ContaDestino = contaDestino;
		this.valorTransacao = valorTransacao;
		this.dataHoraTransacao = dataHoraTransacao;
	}
	
	public Transacao(Transacao transacao) {
		
		this.bancoOrigem = transacao.getBancoOrigem();
		this.agenciaOrigem = transacao.getAgenciaOrigem();
		ContaOrigem = transacao.getContaOrigem();
		this.bancoDestino = transacao.getBancoDestino();
		this.agenciaDestino = transacao.getAgenciaDestino();
		ContaDestino = transacao.getContaDestino();
		this.valorTransacao =  transacao.getValorTransacao();
		this.dataHoraTransacao = transacao.getDataHoraTransacao();
	}
	public String getBancoOrigem() {
		return bancoOrigem;
	}
	public void setBancoOrigem(String bancoOrigem) {
		this.bancoOrigem = bancoOrigem;
	}
	public String getAgenciaOrigem() {
		return agenciaOrigem;
	}
	public void setAgenciaOrigem(String agenciaOrigem) {
		this.agenciaOrigem = agenciaOrigem;
	}
	public String getContaOrigem() {
		return ContaOrigem;
	}
	public void setContaOrigem(String contaOrigem) {
		ContaOrigem = contaOrigem;
	}
	public String getBancoDestino() {
		return bancoDestino;
	}
	public void setBancoDestino(String bancoDestino) {
		this.bancoDestino = bancoDestino;
	}
	public String getAgenciaDestino() {
		return agenciaDestino;
	}
	public void setAgenciaDestino(String agenciaDestino) {
		this.agenciaDestino = agenciaDestino;
	}
	public String getContaDestino() {
		return ContaDestino;
	}
	public void setContaDestino(String contaDestino) {
		ContaDestino = contaDestino;
	}
	public Double getValorTransacao() {
		return valorTransacao;
	}
	public void setValorTransacao(Double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}
	public LocalDateTime getDataHoraTransacao() {
		return dataHoraTransacao;
	}
	public void setDataHoraTransacao(LocalDateTime dataHoraTransacao) {
		this.dataHoraTransacao = dataHoraTransacao;
	}
	
	
	
	
	
	
}
