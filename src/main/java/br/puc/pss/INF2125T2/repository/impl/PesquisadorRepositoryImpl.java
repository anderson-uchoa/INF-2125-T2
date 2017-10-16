package br.puc.pss.INF2125T2.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.Utils;
import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Pesquisador;
import br.puc.pss.INF2125T2.repository.PesquisadorRepository;

@Repository
public class PesquisadorRepositoryImpl implements PesquisadorRepository {

	@Override
	public void savePesquisador(Pesquisador pesquisador) {
	
		if (pesquisador.getId() == 0) {
			pesquisador.setId(Utils.generateUniqueId());
		}
		
		Memoria.getInstance().getPesquisadores().add(pesquisador);
		Memoria.getInstance().getColaboradores().add(pesquisador);

	}

	@Override
	public List<Pesquisador> getAllPesquisadores() {
		List<Pesquisador> pesquisadores = Memoria.getInstance().getPesquisadores();

		return pesquisadores;
	}

	@Override
	public Pesquisador getPesquisadorById(int idPesquisador) {
		List<Pesquisador> pesquisadors = Memoria.getInstance().getPesquisadores();
		for (Pesquisador pesquisador : pesquisadors) {
			if (pesquisador.getId() == idPesquisador) {
				return pesquisador;
			}
		}

		return null;
	}

}
