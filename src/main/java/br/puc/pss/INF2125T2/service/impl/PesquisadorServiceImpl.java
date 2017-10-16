package br.puc.pss.INF2125T2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Pesquisador;
import br.puc.pss.INF2125T2.repository.PesquisadorRepository;
import br.puc.pss.INF2125T2.service.PesquisadorService;

@Service
public class PesquisadorServiceImpl implements PesquisadorService {

	@Autowired
	private PesquisadorRepository pesquisadorRepository;

	@Override
	public void addPesquisador(Pesquisador pesquisador) {
		pesquisadorRepository.savePesquisador(pesquisador);

	}

	@Override
	public Pesquisador getPesquisadorById(int idPesquisador) {
		return pesquisadorRepository.getPesquisadorById(idPesquisador);

	}

}
