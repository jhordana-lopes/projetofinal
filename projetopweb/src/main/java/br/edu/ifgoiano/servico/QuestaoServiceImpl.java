package br.edu.ifgoiano.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifgoiano.entidade.Questao;
import br.edu.ifgoiano.repository.QuestaoRepository;

@Service
public class QuestaoServiceImpl implements QuestaoService {
	
	static List<Questao> questao = new ArrayList<Questao>();

	@Autowired
	private QuestaoRepository questaoRepository;
	
	@Override
	public List<Questao> listarQuestao() {
		
		return questaoRepository.findAll();
	}

	@Override
	public Object obterAluno() {
		// TODO Auto-generated method stub
		return null;
	}

}
