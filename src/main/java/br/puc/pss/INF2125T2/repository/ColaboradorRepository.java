package br.puc.pss.INF2125T2.repository;

import java.util.List;

import br.puc.pss.INF2125T2.model.Colaborador;

public interface ColaboradorRepository {

	public List<Colaborador> getAllColaboradores();

	public Colaborador getColaboradorPorId(int idColaborador);

	public int getQuantidadeParticipacaoEmProjetoAndamento(Colaborador colaborador);

}
