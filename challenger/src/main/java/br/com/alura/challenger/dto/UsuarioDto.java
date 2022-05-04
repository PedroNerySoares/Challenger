package br.com.alura.challenger.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.challenger.model.Usuario;


public class UsuarioDto {
	private String usuario;
	private String email;
	

	public UsuarioDto(Usuario usuario) {
		super();
		this.usuario = usuario.getUsuario();
		this.email = usuario.getEmail();
	}
	
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
	
	
	public static List<UsuarioDto> converter(List<Usuario> usuario) {
		return usuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
		
	}
	
	
}
