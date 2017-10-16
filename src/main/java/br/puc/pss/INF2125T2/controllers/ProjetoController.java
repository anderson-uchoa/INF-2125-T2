package br.puc.pss.INF2125T2.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.puc.pss.INF2125T2.model.Aluno;
import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.ParticipacaoProjeto;
import br.puc.pss.INF2125T2.model.Professor;
import br.puc.pss.INF2125T2.model.Projeto;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.model.enumeration.StatusDoProjeto;
import br.puc.pss.INF2125T2.service.AlunoService;
import br.puc.pss.INF2125T2.service.ColaboradorService;
import br.puc.pss.INF2125T2.service.ProfessorService;
import br.puc.pss.INF2125T2.service.ProjetoService;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {

	@Autowired
	private ProjetoService projetoService;

	@Autowired
	private ColaboradorService colaboradorService;

	@Autowired
	private AlunoService alunoService;

	@Autowired
	private ProfessorService professorService;

	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	public String adicionarProjeto(Model model) {

		List<Professor> professores = professorService.listarTodosProfessores();

		model.addAttribute("professores", professores);
		model.addAttribute("projeto", new Projeto());

		return "form_add_projeto";
	}

	@RequestMapping(value = "/adicionarProjeto", method = RequestMethod.POST)
	public String adicionarNovoProjeto(Projeto projeto,
			@RequestParam(value = "idProfessor", required = true) int idProfessor) {

		Colaborador colaborador = colaboradorService.getColaboradorPorId(idProfessor);
		ParticipacaoProjeto participacaoProjeto = new ParticipacaoProjeto(colaborador, projeto);

		projeto.setStatusDoProjeto(StatusDoProjeto.EM_ELABORACAO);
		projeto.getParticipacaoProjetos().add(participacaoProjeto);

		projetoService.cadastrar(projeto);

		return "redirect:/dashboardProjeto";
	}

	@RequestMapping(value = "/adicionarColaboradores/{idProjeto}", method = RequestMethod.GET)
	public String adicionarColaboradores(@PathVariable int idProjeto, Model model) {

		List<Colaborador> colaboradores = colaboradorService.getAllColaboradores();
	
		List<Aluno> alunos = alunosGraduacaoIndispo(alunoService.getAllAlunos());
		
		List<Colaborador> colaboradoresValidos = getColaboradoresValidos(colaboradores, alunos);

	
		model.addAttribute("colaboradores", colaboradoresValidos);
		model.addAttribute("projeto", projetoService.getProjetoPorId(idProjeto));

		return "form_add_colaboradores_projeto";

	}

	@RequestMapping(value = "/adicionarColaboradores/{idProjeto}", method = RequestMethod.POST)
	public String adicionarColaboradoresNoProjeto(
			@RequestParam(value = "colaboradoresIds", required = true) Integer[] colaboradoresIds,
			@PathVariable int idProjeto, Model model) {

		if (colaboradoresIds != null) {
			for (int idColaborador : colaboradoresIds) {
				projetoService.vincularColaborador(idColaborador, idProjeto);
			}
		}

		return "redirect:/dashboardProjeto";

	}

	@RequestMapping(value = "/darAndamentoProjeto/{idProjeto}", method = RequestMethod.POST)
	public String alterarStatusParaAndamento(@PathVariable String idProjeto, Model model) {

		int projetoId = Integer.parseInt(idProjeto);

		Projeto projeto = projetoService.getProjetoPorId(projetoId);
		projetoService.AlterarStatusParaAndamento(projeto.getId());

		return "redirect:/dashboardProjeto";
	}

	@RequestMapping(value = "/darComoConcluidoProjeto/{idProjeto}", method = RequestMethod.POST)
	public String alterarStatusParaConcluido(@PathVariable String idProjeto, Model model) {

		int projetoId = Integer.parseInt(idProjeto);
		Projeto projeto = projetoService.getProjetoPorId(projetoId);

		Date data = new Date().from(Instant.now());
		DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		formatDate.format(data);
		projeto.setDataTermino(data);

		projetoService.AlterarStatusParaConcluido(projeto.getId());

		return "redirect:/dashboardProjeto";
	}

	@RequestMapping(value = "/publicacaoDoProjeto/{idProjeto}", method = RequestMethod.GET)
	public String verPublicacoesDoProjeto(@PathVariable int idProjeto, Model model) {

		List<Publicacao> publicacaos = projetoService.getPublicacoesPorProjetoOrdemDescAno(idProjeto);

		model.addAttribute("publicacoes", publicacaos);
		model.addAttribute("projeto", projetoService.getProjetoPorId(idProjeto));

		return "ver_publicacoes_projeto";

	}

	public List<Colaborador> getColaboradoresValidos(List<Colaborador> colaboradores, List<Aluno> alunos) {

		for (int i = 0; i < colaboradores.size(); i++) {
			for (int j = 0; j < alunos.size(); j++) {
				if (colaboradores.get(i).equals(alunos.get(j))) {
					colaboradores.remove(i);
				}
			}
		}
		return colaboradores;

	}

	public List<Aluno> alunosGraduacaoIndispo(List<Aluno> alunos) {
		List<Aluno> alunos2 = new ArrayList<>();

		for (Aluno aluno : alunos) {
			int quantidade = colaboradorService.getQuantidadeParticipacaoEmProjetoAndamento(aluno);
			if (quantidade > 2) {
				alunos2.add(aluno);
			}
		}
		return alunos2;
	}

}
