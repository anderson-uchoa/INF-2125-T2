package br.puc.pss.INF2125T2.service;

import java.util.List;

import br.puc.pss.INF2125T2.model.Aluno;

public interface AlunoService {

	public void adicionarAluno(Aluno aluno);

	public Aluno getAlunoById(int idAluno);

	public List<Aluno> getAllAlunos();

}