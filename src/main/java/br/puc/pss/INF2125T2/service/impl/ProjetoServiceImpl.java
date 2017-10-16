package br.puc.pss.INF2125T2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.pss.INF2125T2.memoria.Memoria;
import br.puc.pss.INF2125T2.model.Projeto;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.repository.ProjetoRepository;
import br.puc.pss.INF2125T2.service.ProjetoService;

@Service
public class ProjetoServiceImpl implements ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;

	@Override
	public void cadastrar(Projeto projeto) {
		projetoRepository.saveProjeto(projeto);
	}

	@Override
	public List<Projeto> listarProjetoEmAndamento() {
		List<Projeto> projetos = projetoRepository.getAllProjetosEmAndamento();
		return projetos;
	}

	@Override
	public List<Projeto> listarProjetoConcluidos() {
		List<Projeto> projetosConcluidos = projetoRepository.getAllProjetoConcluidos();
		return projetosConcluidos;
	}

	@Override
	public List<Projeto> listarProjetoEmElaboracao() {
		List<Projeto> projetosEmElaboracao = projetoRepository.getAllProjetoEmElaboracao();
		return projetosEmElaboracao;
	}

	@Override
	public Projeto getProjetoPorId(int id) {
		return projetoRepository.getProjetoPorId(id);
	}

	@Override
	public List<Projeto> getAllProjetos() {
		List<Projeto> projetos = projetoRepository.getAllProjetos();
		return projetos;
	}

	@Override
	public List<Publicacao> getPublicacoesPorProjetoOrdemDescAno(int idProjeto) {
		Projeto projeto = getProjetoPorId(idProjeto);
		List<Publicacao> publicacoes = projeto.getPublicacoes();
		publicacoes.sort(
				(Object o1, Object o2) -> ((Publicacao) o2).getAnoPublicacao() - ((Publicacao) o1).getAnoPublicacao());
		return publicacoes;
	}

	@Override
	public void AlterarStatusParaAndamento(int id) {
		projetoRepository.darAndamento(id);
	}

	@Override
	public void AlterarStatusParaConcluido(int id) {
		projetoRepository.darComoConcluido(id);

	}

	@Override
	public void vincularColaborador(int idColaborador, int idProjeto) {
		projetoRepository.vincularColaborador(idColaborador, idProjeto);

	}
}
