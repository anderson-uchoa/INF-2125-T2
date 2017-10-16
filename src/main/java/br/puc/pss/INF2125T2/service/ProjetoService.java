package br.puc.pss.INF2125T2.service;

import java.util.List;

import br.puc.pss.INF2125T2.model.Projeto;
import br.puc.pss.INF2125T2.model.Publicacao;

public interface ProjetoService {

	void cadastrar(Projeto projeto);

	public List<Projeto> listarProjetoEmAndamento();

	public List<Projeto> listarProjetoConcluidos();

	public List<Projeto> listarProjetoEmElaboracao();

	List<Publicacao> getPublicacoesPorProjetoOrdemDescAno(int idProjeto);

	Projeto getProjetoPorId(int id);

	List<Projeto> getAllProjetos();

	public void AlterarStatusParaAndamento(int id);

	public void AlterarStatusParaConcluido(int id);

	public void vincularColaborador(int idColaborador, int idProjeto);

}
