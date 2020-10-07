package com.minhaescola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.minhaescola.model.Aluno;

//Extender do repositório

@Repository
@EnableJpaRepositories
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
//	public List<Aluno> findAllByTituloContainingIgnoreCase(String nome);

}
