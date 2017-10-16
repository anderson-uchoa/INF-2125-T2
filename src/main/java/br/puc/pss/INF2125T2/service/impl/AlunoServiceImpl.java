package br.puc.pss.INF2125T2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Aluno;
import br.puc.pss.INF2125T2.repository.AlunoRepository;
import br.puc.pss.INF2125T2.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public void adicionarAluno(Aluno aluno) {
		alunoRepository.saveAluno(aluno);
	}

	@Override
	public Aluno getAlunoById(int idAluno) {
		Aluno aluno = alunoRepository.findAlunoById(idAluno);
		return aluno;
	}

	@Override
	public List<Aluno> getAllAlunos() {
		return alunoRepository.getAllAlunos();

	}

}