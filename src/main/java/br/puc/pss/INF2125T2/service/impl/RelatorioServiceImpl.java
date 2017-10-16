package br.puc.pss.INF2125T2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.RelatorioProducaoAcademica;
import br.puc.pss.INF2125T2.repository.RelatorioRepository;
import br.puc.pss.INF2125T2.service.RelatorioService;

@Service
public class RelatorioServiceImpl implements RelatorioService {

	@Autowired
	private RelatorioRepository relatorioRepository;

	@Override
	public RelatorioProducaoAcademica getRelatorio() {

		RelatorioProducaoAcademica relatorio = new RelatorioProducaoAcademica();

		relatorio.setTotalColaboradores(relatorioRepository.totalColaboradores());
		relatorio.setTotalProjetoEmElaboracao(relatorioRepository.totalProjetoEmElaboracao());
		relatorio.setTotalProjetoEmAndamento(relatorioRepository.totalProjetoEmAndamento());
		relatorio.setTotalProjetoConcluidos(relatorioRepository.totalProjetoConcluidos());
		relatorio.setTotalProjetos(relatorioRepository.totalProjetos());
		relatorio.setTotalPublicacoes(relatorioRepository.totalPublicacoes());
		relatorio.setTotalOrientacoes(relatorioRepository.totalOrientacoes());
		return relatorio;
	}

}
