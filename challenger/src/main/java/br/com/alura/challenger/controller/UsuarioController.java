package br.com.alura.challenger.controller;

import java.io.Console;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.challenger.dto.LoginDto;
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
		
			Optional<Usuario> user =usuarioRepository.findByEmail(usuarioDto.getEmail());
			if(user.isEmpty()) {
			Random aleatorio = new Random();
			int  valor= aleatorio.nextInt(999999) + 1;
			String password = Integer.toString(valor);
			
//			String senhaCriptografada = crip.GerarHash(password);
			
//			System.out.println(password);
//			System.out.println(senhaCriptografada);
			
			Usuario us1 = new Usuario(usuarioDto.getUsuario(),usuarioDto.getEmail(),crip.GerarHash(password));
			usuarioRepository.saveAndFlush(us1);
			enviar.enviar(usuarioDto.getUsuario(),usuarioDto.getEmail(),password);
			return ResponseEntity.status(201).build();
			}
			System.out.println("ja existe email cadastrado");
			return ResponseEntity.status(404).build();
		}
	
		@GetMapping
		private ResponseEntity <List<Usuario>> listarUsuarios() {
			List<Usuario> lista = usuarioRepository.findAll();
			return ResponseEntity.status(200).body(lista);
		}
		
		@GetMapping("/{id}")
		private ResponseEntity<Optional<Usuario>> listarUsuarioDetalhe(@PathVariable Long id){
			Optional<Usuario> usuario = usuarioRepository.findById(id);
			if(usuario.isPresent()) {
				return ResponseEntity.status(200).body(usuario);
			}
			return ResponseEntity.status(400).build();
		
			
		}
		
		@DeleteMapping("/{id}")
		private ResponseEntity<Optional<Usuario>> deletarUsuario(@PathVariable Long id){
			Optional<Usuario> usuario = usuarioRepository.findById(id);
			if(usuario.isPresent()) {
				usuarioRepository.deleteById(id);
				return ResponseEntity.status(200).build();
			}
				
			return null;
		}
		

}