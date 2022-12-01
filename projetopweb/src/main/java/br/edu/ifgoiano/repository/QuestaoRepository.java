package br.edu.ifgoiano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifgoiano.entidade.Questao;

public interface QuestaoRepository extends JpaRepository<Questao, String> {

}
