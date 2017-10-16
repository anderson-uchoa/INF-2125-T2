package br.puc.pss.INF2125T2.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.ParticipacaoProjeto;
import br.puc.pss.INF2125T2.model.enumeration.StatusDoProjeto;
import br.puc.pss.INF2125T2.repository.ColaboradorRepository;

@Repository
public class ColaboradorRepositoryImpl implements ColaboradorRepository {

	@Override
	public List<Colaborador> getAllColaboradores() {
		List<Colaborador> colaboradores = Memoria.getInstance().getColaboradores();
		return colaboradores;
	}

	@Override
	public Colaborador getColaboradorPorId(int idColaborador) {
		List<Colaborador> colaboradores = Memoria.getInstance().getColaboradores();
		for (Colaborador colaborador : colaboradores) {
			if (colaborador.getId() == idColaborador) {
				return colaborador;
			}
		}
		return null;
	}

	@Override
	public int getQuantidadeParticipacaoEmProjetoAndamento(Colaborador colaborador) {

		int contador = 0;
		Colaborador colaborador2 = getColaboradorPorId(colaborador.getId());
		List<ParticipacaoProjeto> participacaoProjetos = null;

		if (colaborador2.getParticipacaoProjetos().isEmpty()) {
			return contador;
		} else {
			participacaoProjetos = colaborador2.getParticipacaoProjetos();
			for (ParticipacaoProjeto participacaoProjeto : participacaoProjetos) {
				if (participacaoProjeto.getProjeto().getStatusDoProjeto().equals(StatusDoProjeto.EM_ANDAMENTO)) {
					contador++;
				}
			}
		}

		return contador;
	}

}
