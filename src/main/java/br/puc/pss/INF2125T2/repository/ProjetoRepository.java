package br.puc.pss.INF2125T2.repository;

import java.util.List;

import br.puc.pss.INF2125T2.model.Projeto;
import br.puc.pss.INF2125T2.model.enumeration.StatusDoProjeto;

public interface ProjetoRepository {

	public void saveProjeto(Projeto projeto);

	public Projeto getProjetoPorId(int idProjeto);

	public void vincularColaborador(int idColaborador, int idProjeto);

	public void darAndamento(int idProjeto);

	public void darComoConcluido(int idProjeto);

	public List<Projeto> getAllProjetosEmAndamento();

	public List<Projeto> getAllProjetos();

	public List<Projeto> getAllProjetoConcluidos();

	public List<Projeto> getAllProjetoEmElaboracao();

}