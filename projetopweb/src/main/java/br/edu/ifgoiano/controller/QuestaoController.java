package br.edu.ifgoiano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifgoiano.servico.QuestaoService;
import br.edu.ifgoiano.servico.QuestaoServiceImpl;

@Controller
public class QuestaoController {

	private final QuestaoService questaoServiceImpl;

	public QuestaoController(QuestaoServiceImpl questaoServiceImpl) {
		this.questaoServiceImpl = questaoServiceImpl;
	}

	@GetMapping("/prova")
	public String listarQuestao(Model model) {
		model.addAttribute("questao", questaoServiceImpl.listarQuestao());
		return "prova";
	}
}
