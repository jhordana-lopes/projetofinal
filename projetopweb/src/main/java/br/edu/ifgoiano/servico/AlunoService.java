package br.edu.ifgoiano.servico;

import java.util.List;

import br.edu.ifgoiano.entidade.Aluno;

public interface AlunoService {

	public List<Aluno> listarAluno();

	void inserir(Aluno aluno);

	public Object listarLivros();

	void alterarAluno(Aluno aluno);

	public Object obterAluno();

}
