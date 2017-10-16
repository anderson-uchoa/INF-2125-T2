package br.puc.pss.INF2125T2.repository;

import java.util.List;

import br.puc.pss.INF2125T2.model.Aluno;
import br.puc.pss.INF2125T2.model.enumeration.TipoDeAluno;

public interface AlunoRepository {

	public void saveAluno(Aluno aluno);

	public Aluno findAlunoById(int id);

	public List<Aluno> getAllAlunos();

}