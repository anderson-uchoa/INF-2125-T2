package br.puc.pss.INF2125T2.repository;

public interface RelatorioRepository {

	public int totalColaboradores();

	public int totalProjetos();

	public int totalProjetoEmElaboracao();

	public int totalProjetoEmAndamento();

	public int totalProjetoConcluidos();

	public int totalOrientacoes();

	public int totalPublicacoes();

}
