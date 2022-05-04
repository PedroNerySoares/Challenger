package br.com.alura.challenger.dto;

public class LoginDto {
	
	private String usuario;
	private String password;
	
	public LoginDto() {}
	public LoginDto(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
