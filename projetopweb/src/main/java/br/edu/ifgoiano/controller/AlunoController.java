
package br.edu.ifgoiano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifgoiano.entidade.Aluno;
import br.edu.ifgoiano.servico.AlunoService;
import br.edu.ifgoiano.servico.AlunoServiceImpl;

@Controller
public class AlunoController {

	private final AlunoService alunoServiceImpl;

	public AlunoController(AlunoServiceImpl alunoServiceImpl) {
		this.alunoServiceImpl = alunoServiceImpl;
	}

	@GetMapping("/index")
	public String indexAluno(Model model) {
		return "index";

	}

	@GetMapping("/painel")
	public String listarAluno(Model model) {
		model.addAttribute("aluno", alunoServiceImpl.listarAluno());
		return "painel";
	}

	@GetMapping("/cadastro")
	public String abrirNovoLivro(Model model) {
		Aluno aluno = new Aluno();
		model.addAttribute("aluno", aluno);
		return "cadastro";
	}

	@PostMapping("/cadastro")
	public String inserirAluno(Aluno aluno) {
		this.alunoServiceImpl.inserir(aluno);
		return "redirect:/index";
	}

	@GetMapping("/home")
	public String painelAluno(Model model) {
		return "homealunohtml";
	}

	@GetMapping("/gabarito")
	public String gabaritoAluno(Model model) {
		return "gabarito";
	}

	@GetMapping("/aluno/alterar/{id}")
	public String abrirAlterarAluno(@PathVariable Long id, Model model) {
		Aluno aluno = this.alunoServiceImpl.obterAluno(id);

		model.addAttribute("aluno", aluno);

		return "alterar";
	}

	@PostMapping("/aluno/alterar")
	public String alterarAluno(Aluno aluno) {
		this.alunoServiceImpl.alterarAluno(aluno);
		return "redirect:/painel";
	}

	 @GetMapping ("/aluno/excluir/{id}")
	    public String excluirLivro(@PathVariable Long id) {
	    	this.alunoServiceImpl.excluirAluno(id);
	    	
	    	return "redirect:/index";

	 }
}
