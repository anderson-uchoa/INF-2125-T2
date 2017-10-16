package br.puc.pss.INF2125T2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.repository.ColaboradorRepository;
import br.puc.pss.INF2125T2.service.ColaboradorService;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

	@Autowired
	private ColaboradorRepository colaboradorRepository;

	@Override
	public List<Colaborador> getAllColaboradores() {
		List<Colaborador> colaboradores = colaboradorRepository.getAllColaboradores();
		return colaboradores;
	}

	@Override
	public Colaborador getColaboradorPorId(int idColaborador) {
		Colaborador colaborador = colaboradorRepository.getColaboradorPorId(idColaborador);
		return colaborador;
	}

	@Override
	public int getQuantidadeParticipacaoEmProjetoAndamento(Colaborador colaborador) {
		return colaboradorRepository.getQuantidadeParticipacaoEmProjetoAndamento(colaborador);
	}

}
