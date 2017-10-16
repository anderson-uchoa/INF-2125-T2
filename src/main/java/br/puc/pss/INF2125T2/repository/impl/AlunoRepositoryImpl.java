package br.puc.pss.INF2125T2.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.Utils;
import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Aluno;
import br.puc.pss.INF2125T2.repository.AlunoRepository;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

	@Override
	public void saveAluno(Aluno aluno) {
		
		if (aluno.getId() == 0) {
			aluno.setId(Utils.generateUniqueId());
		}

		Memoria.getInstance().getAlunos().add(aluno);
		Memoria.getInstance().getColaboradores().add(aluno);
	}

	@Override
	public Aluno findAlunoById(int id) {
		List<Aluno> alunos = Memoria.getInstance().getAlunos();
		for (Aluno aluno : alunos) {
			if (aluno.getId() == id) {
				return aluno;
			}
		}

		return null;
	}

	@Override
	public List<Aluno> getAllAlunos() {
		List<Aluno> alunos = Memoria.getInstance().getAlunos();
		return alunos;
	}


}
