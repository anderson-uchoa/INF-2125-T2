package br.puc.pss.INF2125T2.service;

import java.util.List;

import br.puc.pss.INF2125T2.model.Colaborador;

public interface ColaboradorService {

	public List<Colaborador> getAllColaboradores();

	public Colaborador getColaboradorPorId(int idColaborador);

	public int getQuantidadeParticipacaoEmProjetoAndamento(Colaborador colaborador);

}
