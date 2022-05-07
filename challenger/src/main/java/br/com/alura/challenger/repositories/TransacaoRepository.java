package br.com.alura.challenger.repositories;

import java.util.List;
import java.util.Optional;

import org.flywaydb.core.internal.jdbc.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.alura.challenger.model.Transacao;


@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

	
	@Query(value = "SELECT * FROM TRANSACAO WHERE  valorTransacao>?1",nativeQuery = true)
	Optional<List<Transacao>> findByValor(Double vrsuspeito);
	
	
//	
//	public default List<ContasSuspeitasDto> listaContasSuspeita() throws SQLException{
//		
//		
//		
//		
//		
//	}
//


	
	
	
}
