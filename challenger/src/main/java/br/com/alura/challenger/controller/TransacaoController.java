package br.com.alura.challenger.controller;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.challenger.model.Arquivo;
import br.com.alura.challenger.model.Transacao;
import br.com.alura.challenger.repositories.TransacaoRepository;
import br.com.alura.challenger.services.TransacaoServices;


@RestController
@RequestMapping(value = "/transacao")
public class TransacaoController {
	
		@Autowired
		private TransacaoServices transacao;
		
		@Autowired
		private TransacaoRepository transacaoRepository;
	
		@GetMapping
		private ResponseEntity<List<Transacao>> list(@RequestBody Arquivo arquivo) {
			List<Transacao> lista = transacao.lerArquivo(arquivo.getNomeArquivo());
			return ResponseEntity.status(200).body(lista);
		
		}



	@GetMapping("/{id}")
	private ResponseEntity<Transacao> detalhar(@PathVariable Long id ){
				Optional<Transacao>  trans = transacaoRepository.findById(id);
				
				if(trans.isPresent()) {
//					return ResponseEntity.ok(new Transa(topico.get()));
					return ResponseEntity.ok(new Transacao(trans.get()));
					
				}
				
				return ResponseEntity.notFound().build();
		
	}

	

	@PostMapping
	private ResponseEntity<Transacao> Gravar(@RequestBody Arquivo arquivo) {
		
		List<Transacao> lista = transacao.lerArquivo(arquivo.getNomeArquivo());
		transacaoRepository.saveAll(lista);
		return ResponseEntity.status(201).build();
}
	
	@DeleteMapping
	private void DeletarArquivo() {
		transacaoRepository.deleteAll();
	}
	
}
//
//@PostMapping
//public ResponseEntity<TopicoDto> cadastrar(@RequestBody  @Valid TopicoForm form,UriComponentsBuilder uriBuilder) {
//	Topico topico = form.converter(cursoRepository);
//	topicoRepository.saveAndFlush(topico);
//	URI uri = uriBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
//	return ResponseEntity.created(uri).body(new TopicoDto(topico));
//}