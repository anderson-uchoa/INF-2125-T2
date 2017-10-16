package br.puc.pss.INF2125T2.repository;

import java.util.List;

import br.puc.pss.INF2125T2.model.Pesquisador;

public interface PesquisadorRepository {

	public void savePesquisador(Pesquisador pesquisador);

	public List<Pesquisador> getAllPesquisadores();
	
	public Pesquisador getPesquisadorById(int idPesquisador);

}