package br.puc.pss.INF2125T2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Orientacao;
import br.puc.pss.INF2125T2.repository.OrientacaoRepository;
import br.puc.pss.INF2125T2.service.OrientacaoService;

@Service
public class OrientacaoServiceImpl implements OrientacaoService {

	@Autowired
	private OrientacaoRepository orientacaoRepository;

	@Override
	public List<Orientacao> listarTodasOrientacoes() {
		List<Orientacao> orientacoes = orientacaoRepository.getAllOrientacoes();
		return orientacoes;
	}

	
	@Override
	public List<Orientacao> buscarOrientacaoPorProfessor(int idProfessor) {
	List<Orientacao> orientacoes = orientacaoRepository.getOrientacoesByProfessor(idProfessor);
		
		return orientacoes;
	}

	@Override
	public void addOrientacao(Orientacao orientacao) {
		orientacaoRepository.saveOrientacao(orientacao);
		
	}

}
