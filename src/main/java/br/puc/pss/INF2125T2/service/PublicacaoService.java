package br.puc.pss.INF2125T2.service;

import java.util.List;

import br.puc.pss.INF2125T2.model.Publicacao;

public interface PublicacaoService {

	public void cadastrarPublicacao(Publicacao publicacao);

	List<Publicacao> getPublicacaosPorColaborador(int idColaborador);

	public List<Publicacao> listarPublicacoes();

}
