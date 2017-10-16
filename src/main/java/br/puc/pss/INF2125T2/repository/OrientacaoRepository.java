package br.puc.pss.INF2125T2.repository;

import java.util.List;


import br.puc.pss.INF2125T2.model.Orientacao;

public interface OrientacaoRepository {

	public void saveOrientacao(Orientacao orientacao);

	public List<Orientacao> getAllOrientacoes();

	public List<Orientacao> getOrientacoesByProfessor(int idProfessor);


}
