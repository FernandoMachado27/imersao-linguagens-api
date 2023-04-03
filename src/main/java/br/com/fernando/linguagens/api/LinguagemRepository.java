package br.com.fernando.linguagens.api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String>{ // spring implementa, nosso extrator do Banco de dados
	
	List<Linguagem> findByOrderByRanking(); // só passar este nome de metodo que o spring sozinho ordena
	
}
