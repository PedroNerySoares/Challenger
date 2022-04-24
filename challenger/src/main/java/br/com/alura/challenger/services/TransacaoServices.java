package br.com.alura.challenger.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.challenger.model.Transacao;

@Service
public class TransacaoServices {
	
	
	public List<Transacao> lerArquivo(String path) {
		
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

}
