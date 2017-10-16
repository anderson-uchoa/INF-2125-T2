package br.puc.pss.INF2125T2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Professor;
import br.puc.pss.INF2125T2.repository.ProfessorRepository;
import br.puc.pss.INF2125T2.service.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;

	@Override
	public List<Professor> listarTodosProfessores() {
		return professorRepository.getAllProfessores();
	}

	@Override
	public Professor buscarProfessorPorId(int id) {
		Professor professor = professorRepository.getProfessorPorId(id);
		return professor;
	}

	@Override
	public void addProfessor(Professor professor) {

		professorRepository.saveProfessor(professor);
	}

}
