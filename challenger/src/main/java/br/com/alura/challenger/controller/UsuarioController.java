package br.com.alura.challenger.controller;

import java.io.Console;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.challenger.dto.UsuarioDto;
import br.com.alura.challenger.model.Usuario;
import br.com.alura.challenger.repositories.UsuarioRepository;
import br.com.alura.challenger.services.CriptografiaService;
import br.com.alura.challenger.services.EnviarEmail;

@RequestMapping("/usuario")
@Controller
public class UsuarioController {
		
		@Autowired
		UsuarioRepository usuarioRepository;
		
		@Autowired
		private EnviarEmail enviar;
		
		
		CriptografiaService crip = new CriptografiaService();
	
		@PostMapping
		private ResponseEntity<UsuarioDto> CadastrarUsuario(@RequestBody UsuarioDto usuarioDto) {
		
			//crip.ckeckPass(usuarioDto.getUsuario());
			
			Random aleatorio = new Random();
			int  valor= aleatorio.nextInt(999999) + 1;
			String password = Integer.toString(valor);
			
			String senhaCriptografada = crip.GerarHash(password);
			
			System.out.println(password);
			System.out.println(senhaCriptografada);
			
			Usuario us1 = new Usuario(usuarioDto.getUsuario(),usuarioDto.getEmail(),senhaCriptografada);
			usuarioRepository.saveAndFlush(us1);
			enviar.enviar(usuarioDto.getUsuario(),usuarioDto.getEmail(),password);
			return ResponseEntity.status(201).build();
		}
	
		@GetMapping
		private ResponseEntity <List<Usuario>> listarUsuarios() {
			List<Usuario> lista = usuarioRepository.findAll();
			return ResponseEntity.status(200).body(lista);
		}
		
		
}
