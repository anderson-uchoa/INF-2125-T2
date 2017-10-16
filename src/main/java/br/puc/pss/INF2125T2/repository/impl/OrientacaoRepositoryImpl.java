package br.puc.pss.INF2125T2.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Orientacao;
import br.puc.pss.INF2125T2.model.Professor;
import br.puc.pss.INF2125T2.repository.OrientacaoRepository;
import br.puc.pss.INF2125T2.repository.ProfessorRepository;

@Repository
public class OrientacaoRepositoryImpl implements OrientacaoRepository {

	@Autowired
	private ProfessorRepository professorRepository;

	@Override
	public List<Orientacao> getAllOrientacoes() {
		List<Orientacao> orientacoes = Memoria.getInstance().getOrientacoes();
		return orientacoes;
	}


	@Override
	public List<Orientacao> getOrientacoesByProfessor(int idProfessor) {
		
		Professor professor = professorRepository.getProfessorPorId(idProfessor);
		List<Orientacao> orientacoes = Memoria.getInstance().getOrientacoes();
		List<Orientacao> orientacoesDoProfessor = new ArrayList<Orientacao>();
		for(Orientacao orientacao : orientacoes){
			if (orientacao.getProfessor().equals(professor)){
				orientacoesDoProfessor.add(orientacao);
			}
		}
	
		return orientacoesDoProfessor;
	}


	@Override
	public void saveOrientacao(Orientacao orientacao) {
		Memoria.getInstance().getOrientacoes().add(orientacao);
		
	}

}
