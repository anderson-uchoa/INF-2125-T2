package br.puc.pss.INF2125T2.repository;

import java.util.List;

import br.puc.pss.INF2125T2.model.Publicacao;

public interface PublicacaoRepository {

	public void savePublicacao(Publicacao publicacao);

	public List<Publicacao> getAllPublicacoes();

	public List<Publicacao> getPublicacoesPorColaborador(int idColaborador);

}