package br.com.alura.challenger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "arquivo")
public class Arquivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idarq")
	private Long id;
	@Column(name = "nmarq")
	private String nomeArquivo;
	@Column(name = "nrtamarq")
	private Double tamanho;
	
	

	public Arquivo() {
		
	}
	public Arquivo(Long id, String nomeArquivo, Double tamanho) {
		
		this.id = id;
		this.nomeArquivo = nomeArquivo;
		this.tamanho = tamanho;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	public Double getTamanho() {
		return tamanho;
	}
	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	

}
