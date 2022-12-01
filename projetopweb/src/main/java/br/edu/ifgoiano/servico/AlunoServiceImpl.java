package br.edu.ifgoiano.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifgoiano.entidade.Aluno;
import br.edu.ifgoiano.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements AlunoService {

	static List<Aluno> aluno = new ArrayList<Aluno>();

	@Autowired
	private AlunoRepository alunorepostitory;

	@Override
	public Object listarLivros() {
		// TODO Auto-generated method stub
		return alunorepostitory.findAll();
	}

	@Override
	public List<Aluno> listarAluno() {
		// TODO Auto-generated method stub
		return alunorepostitory.findAll();
	}

	@Override
	public void inserir(Aluno aluno) {
		this.alunorepostitory.save(aluno);

	}

	public Aluno obterAluno(String id) {

		return this.alunorepostitory.getReferenceById(id);
	}

	
	public void alterarAluno(Aluno aluno) {
		this.alunorepostitory.save(aluno);
	}

	@Override
	public Object obterAluno() {
		// TODO Auto-generated method stub
		return null;
	}

}