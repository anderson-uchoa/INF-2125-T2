package br.puc.pss.INF2125T2.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.repository.RelatorioRepository;
import br.puc.pss.INF2125T2.service.ColaboradorService;
import br.puc.pss.INF2125T2.service.OrientacaoService;
import br.puc.pss.INF2125T2.service.ProjetoService;
import br.puc.pss.INF2125T2.service.PublicacaoService;

@Repository
public class RelatorioRepositoryImpl implements RelatorioRepository {

	@Autowired
	private ColaboradorService colaboradorService;

	@Autowired
	private ProjetoService projetoService;

	@Autowired
	private OrientacaoService orientacaoService;

	@Autowired
	private PublicacaoService publicacaoService;

	@Override
	public int totalColaboradores() {
		int totalColaboradores = colaboradorService.getAllColaboradores().size();
		return totalColaboradores;
	}

	@Override
	public int totalProjetos() {
		int totalProjetos = projetoService.getAllProjetos().size();
		return totalProjetos;
	}

	@Override
	public int totalProjetoEmElaboracao() {
		int totalProjetoEmElaboracao = projetoService.listarProjetoEmElaboracao().size();
		return totalProjetoEmElaboracao;
	}

	@Override
	public int totalProjetoEmAndamento() {
		int totalProjetoEmAndamento = projetoService.listarProjetoEmAndamento().size();
		return totalProjetoEmAndamento;
	}

	@Override
	public int totalProjetoConcluidos() {
		int totalProjetoConcluidos = projetoService.listarProjetoConcluidos().size();
		return totalProjetoConcluidos;
	}

	@Override
	public int totalOrientacoes() {
		int totalOrientacoes = orientacaoService.listarTodasOrientacoes().size();
		return totalOrientacoes;
	}

	@Override
	public int totalPublicacoes() {
		int totalPublicacoes = publicacaoService.listarPublicacoes().size();
		return totalPublicacoes;
	}

}
