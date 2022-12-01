package br.edu.ifgoiano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifgoiano.entidade.Questao;
import br.edu.ifgoiano.repository.AlunoRepository;
import br.edu.ifgoiano.repository.QuestaoRepository;

@SpringBootApplication
public class ProjetopwebApplication implements CommandLineRunner {

	@Autowired
	private QuestaoRepository questaoRepository;
	@Autowired
	private AlunoRepository alunoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetopwebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Questao quest1 = new Questao();
		quest1.setPort("(INAZ do Pará - 2017 - Prefeitura de Rolim de Moura - RO - Agente Comunitário de Saúde) -"
				+ " Na frase “O estudo do cérebro e do sistema nervoso é chamado de neurociência ou neurobiologia”,"
			+ " são respectivamente:");

		questaoRepository.save(quest1);
		

		
	}


}
