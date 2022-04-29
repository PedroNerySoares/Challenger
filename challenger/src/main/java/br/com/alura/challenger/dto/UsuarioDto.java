package br.com.alura.challenger.dto;

public class UsuarioDto {
	private String usuario;
	private String email;
	
	public UsuarioDto(String usuario, String email) {
		super();
		this.usuario = usuario;
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
