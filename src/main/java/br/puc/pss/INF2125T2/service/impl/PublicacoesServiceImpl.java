package br.puc.pss.INF2125T2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.repository.PublicacaoRepository;
import br.puc.pss.INF2125T2.service.PublicacaoService;

@Service
public class PublicacoesServiceImpl implements PublicacaoService {

	@Autowired
	private PublicacaoRepository publicacaoRepository;

	@Override
	public List<Publicacao> listarPublicacoes() {
		List<Publicacao> publicacaos = publicacaoRepository.getAllPublicacoes();
		return publicacaos;
	}

	@Override
	public List<Publicacao> getPublicacaosPorColaborador(int idColaborador) {
		List<Publicacao> publicacaos = publicacaoRepository.getPublicacoesPorColaborador(idColaborador);
		return publicacaos;
	}

	@Override
	public void cadastrarPublicacao(Publicacao publicacao) {
		publicacaoRepository.savePublicacao(publicacao);
	}

}
