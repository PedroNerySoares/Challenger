package br.com.alura.challenger.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
import br.com.alura.challenger.repositories.ArquivoRepository;

@RestController
@RequestMapping("/arquivo")
public class ArquivoController {
	
	@Autowired
	ArquivoRepository arquivoRepository;
	
	
	
	@GetMapping
	private List<Arquivo> Arquivos () {
		return  arquivoRepository.findAll();
		
	}
	
	@GetMapping("{id}")
	private ResponseEntity<Arquivo>  DetalheArquivo(@PathVariable Long id) {
		Optional<Arquivo> arquivo = arquivoRepository.findById(id);
		if (arquivo.isPresent()) {
			return ResponseEntity.ok(arquivo.get());
			
		}
		
		return ResponseEntity.notFound().build();
	}
	@PostMapping
	private void GravarAquivo(@RequestBody Arquivo arquivo) {
		arquivo.setDataImportacao(LocalDateTime.now());
		arquivoRepository.save(arquivo);
	}
		@DeleteMapping
	private void DeletarArquivo() {
		arquivoRepository.deleteAll();
	}

}
