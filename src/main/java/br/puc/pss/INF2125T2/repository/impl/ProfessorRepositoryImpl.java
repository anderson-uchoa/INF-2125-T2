package br.puc.pss.INF2125T2.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.Utils;
import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Professor;
import br.puc.pss.INF2125T2.repository.ProfessorRepository;

@Repository
public class ProfessorRepositoryImpl implements ProfessorRepository {

	@Override
	public void saveProfessor(Professor professor) {

		if (professor.getId() == 0) {
			professor.setId(Utils.generateUniqueId());
		}
	
		Memoria.getInstance().getProfessores().add(professor);
		Memoria.getInstance().getColaboradores().add(professor);

	}

	@Override
	public Professor getProfessorPorId(int idProfessor) {
		List<Professor> professors = Memoria.getInstance().getProfessores();
		for (Professor professor : professors) {
			if (professor.getId() == idProfessor) {
				return professor;
			}
		}

		return null;
	}

	@Override
	public List<Professor> getAllProfessores() {
		List<Professor> professors = Memoria.getInstance().getProfessores();
		return professors;
	}

}
