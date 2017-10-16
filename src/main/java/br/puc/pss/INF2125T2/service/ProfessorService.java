package br.puc.pss.INF2125T2.service;

import java.util.List;

import br.puc.pss.INF2125T2.model.Professor;

public interface ProfessorService {

	public List<Professor> listarTodosProfessores();

	public void addProfessor(Professor professor);

	public Professor buscarProfessorPorId(int id);

}
