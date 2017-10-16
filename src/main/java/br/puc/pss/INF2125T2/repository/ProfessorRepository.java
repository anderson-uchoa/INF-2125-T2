package br.puc.pss.INF2125T2.repository;

import java.util.List;

import br.puc.pss.INF2125T2.model.Professor;

public interface ProfessorRepository {

	public void saveProfessor(Professor professor);

	public Professor getProfessorPorId(int idProfessor);

	public List<Professor> getAllProfessores();

}
