package br.com.alura.challenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.challenger.model.Arquivo;

public interface ArquivoRepository extends JpaRepository<Arquivo, Long> {

}
