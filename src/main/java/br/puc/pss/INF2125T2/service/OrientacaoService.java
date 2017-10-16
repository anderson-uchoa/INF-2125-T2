package br.puc.pss.INF2125T2.service;

import java.util.List;


import br.puc.pss.INF2125T2.model.Orientacao;


public interface OrientacaoService {

	public List<Orientacao> listarTodasOrientacoes();

	public List<Orientacao> buscarOrientacaoPorProfessor(int idProfessor);

	public void addOrientacao(Orientacao orientacao);


}
