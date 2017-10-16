package br.puc.pss.INF2125T2.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.Utils;
import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.repository.PublicacaoRepository;
import br.puc.pss.INF2125T2.service.ColaboradorService;

@Repository
public class PublicacaoRepositoryImpl implements PublicacaoRepository {

	@Autowired
	private ColaboradorService colaboradorService;

	@Override
	public void savePublicacao(Publicacao publicacao) {
		if (publicacao.getId() == 0) {
			publicacao.setId(Utils.generateUniqueId());
		}

		Memoria.getInstance().getPublicacoes().add(publicacao);

	}

	@Override
	public List<Publicacao> getAllPublicacoes() {
		List<Publicacao> publicacaos = Memoria.getInstance().getPublicacoes();
		return publicacaos;
	}

	@Override
	public List<Publicacao> getPublicacoesPorColaborador(int idColaborador) {
		Colaborador colaborador = colaboradorService.getColaboradorPorId(idColaborador);
		List<Publicacao> publicacoes = getAllPublicacoes();
		List<Publicacao> publicacoesColaborador = new ArrayList<>();
		for (Publicacao publicacao : publicacoes) {
			if (publicacao.getAutores().contains(colaborador)) {
				publicacoesColaborador.add(publicacao);
			}
		}

		return publicacoesColaborador;
	}

}
