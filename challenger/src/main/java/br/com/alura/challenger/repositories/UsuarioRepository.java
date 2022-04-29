package br.com.alura.challenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.challenger.model.Transacao;
import br.com.alura.challenger.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
