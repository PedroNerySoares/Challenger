package br.com.alura.challenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.challenger.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
