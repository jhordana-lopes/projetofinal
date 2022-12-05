package br.edu.ifgoiano.servico;

import java.util.List;

import br.edu.ifgoiano.entidade.Aluno;

public interface AlunoService {

	public List<Aluno> listarAluno();

	public void inserir(Aluno aluno);

	public Aluno obterAluno(Long id);

	public void alterarAluno(Aluno aluno);

	public void excluirAluno(Long id);

}
