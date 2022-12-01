package br.edu.ifgoiano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifgoiano.entidade.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String > {

}
