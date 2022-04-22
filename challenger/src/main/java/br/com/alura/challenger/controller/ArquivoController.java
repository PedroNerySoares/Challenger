package br.com.alura.challenger.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.event.ApplicationListenerMethodAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.challenger.model.Arquivo;
import br.com.alura.challenger.model.Transacao;
import ch.qos.logback.core.encoder.ByteArrayUtil;


@RestController
@RequestMapping(value = "/ler")
public class ArquivoController {
	
	
@GetMapping
	private List<Transacao> imprimirArquivo() throws IOException {
		String path = "C:\\Users\\pedro\\Downloads\\transacoes-2022-01-01.csv";
		
		List<Transacao> lista = new ArrayList<Transacao>();
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line!=null) {
				System.out.println(line);
				String vetor[] = line.split(",");
				String bancoOrigem = vetor[0];
				String agenciaOrigem = vetor[1];
				String contaOrigem = vetor[2];
				String bancoDestino= vetor[3];
				String agenciaDestino= vetor[4];
				String contaDestino= vetor[5];
				Double valorTransacao = Double.parseDouble(vetor[6]);
				LocalDateTime dataTransacao = LocalDateTime.parse(vetor[7]);

				Transacao t1 = new Transacao(bancoOrigem, agenciaOrigem, contaOrigem, bancoDestino, agenciaDestino, contaDestino, valorTransacao, dataTransacao);
				System.out.println(valorTransacao);
				lista.add(t1);
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	 return lista;
	}
	
	
	@PostMapping
	private void LerArquivo(@RequestBody Arquivo form) {
		
		
		
		Arquivo arquivo = form;
		System.out.println(arquivo.getNomeArquivo());
		System.out.println(arquivo.getTamanho());
		
		
		
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
