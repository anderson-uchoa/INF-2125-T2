package br.puc.pss.INF2125T2.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.puc.pss.INF2125T2.Utils;
import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.ParticipacaoProjeto;
import br.puc.pss.INF2125T2.model.Projeto;
import br.puc.pss.INF2125T2.model.enumeration.StatusDoProjeto;
import br.puc.pss.INF2125T2.repository.ProjetoRepository;
import br.puc.pss.INF2125T2.service.ColaboradorService;

@Repository
public class ProjetoRepositoryImpl implements ProjetoRepository {

	@Autowired
	private ColaboradorService colaboradorService;

	@Override
	public void saveProjeto(Projeto projeto) {

		if (projeto.getId() == 0) {
			projeto.setId(Utils.generateUniqueId());
		}

		Memoria.getInstance().getProjetos().add(projeto);
	}

	@Override
	public Projeto getProjetoPorId(int idProjeto) {

		List<Projeto> projetos = Memoria.getInstance().getProjetos();

		for (Projeto projeto : projetos) {
			if (projeto.getId() == idProjeto) {
				return projeto;
			}
		}
		return null;
	}

	@Override
	public List<Projeto> getAllProjetos() {
		List<Projeto> projetos = Memoria.getInstance().getProjetos();

		return projetos;
	}

	@Override
	public List<Projeto> getAllProjetosEmAndamento() {

		List<Projeto> projetos = getAllProjetos();
		List<Projeto> projetosEmAndamento = new ArrayList<Projeto>();
		for (Projeto projeto : projetos) {
			if (projeto.getStatusDoProjeto() == StatusDoProjeto.EM_ANDAMENTO) {
				projetosEmAndamento.add(projeto);
			}
		}
		return projetosEmAndamento;
	}

	@Override
	public void darAndamento(int idProjeto) {
		Projeto projeto = getProjetoPorId(idProjeto);
		for (Projeto proj : getAllProjetos()) {
			if (proj.getId() == idProjeto) {
				projeto.setStatusDoProjeto(StatusDoProjeto.EM_ANDAMENTO);
			}
		}
	}

	@Override
	public void darComoConcluido(int idProjeto) {
		Projeto projeto = getProjetoPorId(idProjeto);
		for (Projeto proj : getAllProjetos()) {
			if (proj.getId() == idProjeto) {
				projeto.setStatusDoProjeto(StatusDoProjeto.CONCLUIDO);
			}
		}
	}

	@Override
	public void vincularColaborador(int idColaborador, int idProjeto) {
		Projeto projeto = getProjetoPorId(idProjeto);
		Colaborador colaborador = colaboradorService.getColaboradorPorId(idColaborador);

		ParticipacaoProjeto participacaoProjeto = new ParticipacaoProjeto(colaborador, projeto);
		colaborador.getParticipacaoProjetos().add(participacaoProjeto);
		projeto.getParticipacaoProjetos().add(participacaoProjeto);

	}

	@Override
	public List<Projeto> getAllProjetoConcluidos() {
		List<Projeto> projetos = getAllProjetos();
		List<Projeto> projetosConcluidos = new ArrayList<Projeto>();

		for (Projeto projeto : projetos) {
			if (projeto.getStatusDoProjeto().equals(StatusDoProjeto.CONCLUIDO)) {
				projetosConcluidos.add(projeto);
			}
		}

		return projetosConcluidos;
	}

	@Override
	public List<Projeto> getAllProjetoEmElaboracao() {
		List<Projeto> projetos = getAllProjetos();
		List<Projeto> projetoElaboracao = new ArrayList<Projeto>();

		for (Projeto projeto : projetos) {
			if (projeto.getStatusDoProjeto().equals(StatusDoProjeto.EM_ELABORACAO)) {
				projetoElaboracao.add(projeto);
			}
		}

		return projetoElaboracao;
	}

}
