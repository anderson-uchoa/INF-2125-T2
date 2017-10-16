package br.puc.pss.INF2125T2.memoria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.puc.pss.INF2125T2.model.Aluno;
import br.puc.pss.INF2125T2.model.Colaborador;
import br.puc.pss.INF2125T2.model.Orientacao;
import br.puc.pss.INF2125T2.model.ParticipacaoProjeto;
import br.puc.pss.INF2125T2.model.Pesquisador;
import br.puc.pss.INF2125T2.model.Professor;
import br.puc.pss.INF2125T2.model.Projeto;
import br.puc.pss.INF2125T2.model.Publicacao;
import br.puc.pss.INF2125T2.model.Usuario;
import br.puc.pss.INF2125T2.model.enumeration.StatusDoProjeto;
import br.puc.pss.INF2125T2.model.enumeration.TipoDeAluno;
import br.puc.pss.INF2125T2.model.enumeration.TipoDeColaborador;
import br.puc.pss.INF2125T2.model.enumeration.TipoDeOrientacao;
import br.puc.pss.INF2125T2.model.enumeration.TipoDePapel;
import br.puc.pss.INF2125T2.model.enumeration.TipoRegimeCurso;

public class Memoria {

	private List<Aluno> alunos;
	private List<Colaborador> colaboradores;
	private List<Professor> professores;
	private List<Pesquisador> pesquisadores;
	private List<Projeto> projetos;
	private List<Usuario> usuarios;
	private List<Publicacao> publicacoes;
	private List<Orientacao> orientacoes;

	public static Memoria instanciaUnica;

	private Memoria() {

		alunos = new ArrayList<>();
		usuarios = new ArrayList<>();
		professores = new ArrayList<>();
		pesquisadores = new ArrayList<>();
		projetos = new ArrayList<>();
		publicacoes = new ArrayList<>();
		orientacoes = new ArrayList<>();
		colaboradores = new ArrayList<>();

		/* Administrador Inicial */
		Usuario usuarioAdmin = new Usuario();
		usuarioAdmin.setId(1);
		usuarioAdmin.setEmail("anderson@gmail.com");
		usuarioAdmin.setLogin("anderson");
		usuarioAdmin.setSenha("anderson");
		usuarioAdmin.setTipoDePapel(TipoDePapel.ADMINISTRADOR);
		usuarios.add(usuarioAdmin);

		
		/* Professores */
		Professor professor1 = new Professor();
		professor1.setId(100);
		professor1.setNome("Prof. Carlos");
		professor1.setEmail("carlos@email.br");
		professor1.setTipoDeColaborador(TipoDeColaborador.PROFESSOR);
		professores.add(professor1);
		colaboradores.add(professor1);

		Professor professor2 = new Professor();
		professor2.setId(101);
		professor2.setNome("Prof. Arnaldo");
		professor2.setEmail("arnaldo@email.br");
		professor2.setTipoDeColaborador(TipoDeColaborador.PROFESSOR);
		professores.add(professor2);
		colaboradores.add(professor2);

		Professor professor3 = new Professor();
		professor3.setId(102);
		professor3.setNome("Prof. Paulo");
		professor3.setEmail("paulo@email.br");
		professor2.setTipoDeColaborador(TipoDeColaborador.PROFESSOR);
		professores.add(professor3);
		colaboradores.add(professor3);

		/* Alunos */
		Aluno aluno1 = new Aluno();
		aluno1.setId(1001);
		aluno1.setNome("Maria");
		aluno1.setEmail("maria@email.br");
		aluno1.setDataDeIngresso(new Date(2006 - 1900, 03, 01));
		aluno1.setTipoAluno(TipoDeAluno.GRADUACAO);
		aluno1.setTipoRegimeCurso(TipoRegimeCurso.NAO_SE_APLICA);
		aluno1.setTipoDeColaborador(TipoDeColaborador.ALUNO);
		aluno1.setProfessorOrientador(professor1);
		alunos.add(aluno1);
		colaboradores.add(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.setId(1002);
		aluno2.setNome("João");
		aluno2.setEmail("joao@email.br");
		aluno2.setDataDeIngresso(new Date(2005 - 1900, 03, 01));
		aluno2.setTipoAluno(TipoDeAluno.GRADUACAO);
		aluno2.setTipoRegimeCurso(TipoRegimeCurso.NAO_SE_APLICA);
		aluno2.setProfessorOrientador(professor2);
		alunos.add(aluno2);
		colaboradores.add(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.setId(1003);
		aluno3.setNome("Mário");
		aluno3.setEmail("mario@email.br");
		aluno3.setDataDeIngresso(new Date(2007 - 1900, 03, 01));
		aluno3.setTipoAluno(TipoDeAluno.GRADUACAO);
		aluno3.setTipoRegimeCurso(TipoRegimeCurso.NAO_SE_APLICA);
		aluno3.setProfessorOrientador(professor2);
		alunos.add(aluno3);
		colaboradores.add(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.setId(1004);
		aluno4.setNome("Soraia");
		aluno4.setEmail("soraia@email.br");
		aluno4.setDataDeIngresso(new Date(2006 - 1900, 03, 01));
		aluno4.setTipoAluno(TipoDeAluno.MESTRADO);
		aluno4.setTipoRegimeCurso(TipoRegimeCurso.PARCIAL);
		aluno4.setProfessorOrientador((Professor) professor1);
		alunos.add(aluno4);
		colaboradores.add(aluno4);

		Aluno aluno5 = new Aluno();
		aluno5.setId(1005);
		aluno5.setNome("Rafael");
		aluno5.setEmail("rafael@email.br");
		aluno5.setDataDeIngresso(new Date(2007 - 1900, 06, 01));
		aluno5.setTipoAluno(TipoDeAluno.MESTRADO);
		aluno5.setTipoRegimeCurso(TipoRegimeCurso.PARCIAL);
		aluno5.setProfessorOrientador(professor3);
		alunos.add(aluno5);
		colaboradores.add(aluno5);

		Aluno aluno6 = new Aluno();
		aluno6.setId(1006);
		aluno6.setNome("Marta");
		aluno6.setEmail("marta@email.br");
		aluno6.setDataDeIngresso(new Date(2007 - 1900, 06, 01));
		aluno6.setTipoAluno(TipoDeAluno.MESTRADO);
		aluno6.setTipoRegimeCurso(TipoRegimeCurso.INTEGRAL);
		aluno6.setProfessorOrientador(professor3);
		alunos.add(aluno6);
		colaboradores.add(aluno6);

		Aluno aluno7 = new Aluno();
		aluno7.setId(1007);
		aluno7.setNome("Daniel");
		aluno7.setEmail("daniel@email.br");
		aluno7.setDataDeIngresso(new Date(2006 - 1900, 03, 01));
		aluno7.setTipoAluno(TipoDeAluno.MESTRADO);
		aluno7.setTipoRegimeCurso(TipoRegimeCurso.INTEGRAL);
		aluno7.setProfessorOrientador(professor3);
		alunos.add(aluno7);
		colaboradores.add(aluno7);

		Aluno aluno8 = new Aluno();
		aluno8.setId(1008);
		aluno8.setNome("Michael");
		aluno8.setEmail("michael@email.br");
		aluno8.setDataDeIngresso(new Date(2005 - 1900, 03, 01));
		aluno8.setTipoAluno(TipoDeAluno.DOUTORADO);
		aluno8.setTipoRegimeCurso(TipoRegimeCurso.INTEGRAL);
		aluno8.setProfessorOrientador(professor1);
		alunos.add(aluno8);
		colaboradores.add(aluno8);

		Aluno aluno9 = new Aluno();
		aluno9.setId(1009);
		aluno9.setNome("Bia");
		aluno9.setEmail("bia@mail.br");
		aluno9.setDataDeIngresso(new Date(2004 - 1900, 06, 01));
		aluno9.setTipoAluno(TipoDeAluno.DOUTORADO);
		aluno9.setTipoRegimeCurso(TipoRegimeCurso.INTEGRAL);
		aluno9.setProfessorOrientador(professor1);
		alunos.add(aluno9);
		colaboradores.add(aluno9);


		/* Projetos */
		Projeto projeto1 = new Projeto();
		projeto1.setId(20);
		projeto1.setTitulo("Engenharia de Software para Sistemas Multi-Agentes (ESMA)");
		projeto1.setDataInicio(new Date(2003 - 1900, 2, 2));
		projeto1.setDataTermino(new Date(2010 - 1900, 2, 2));
		projeto1.setAgenciaFinanciadora("FPCL");
		projeto1.setValorFinanciado(300000);
		projeto1.setObjetivo("O objetivo geral deste projeto é desenvolver os fundamentos e as tecnologias da ESSMA.");
		projeto1.setDescricao(
				"Pesquisar, aplicar e avaliar técnicas de desenvolvimento de software para sistemas multi-agentes..");
		projeto1.setStatusDoProjeto(StatusDoProjeto.EM_ANDAMENTO);
	
		
	    ParticipacaoProjeto partiProj1Prof1 = new ParticipacaoProjeto(professor1, projeto1);
	    ParticipacaoProjeto partiProj1Prof2 = new ParticipacaoProjeto(professor2, projeto1);
	    ParticipacaoProjeto partiProj1Alu2 = new ParticipacaoProjeto(aluno2, projeto1);
	    ParticipacaoProjeto partiProj1Alu3 = new ParticipacaoProjeto(aluno3, projeto1);
	    
	    ParticipacaoProjeto partiProj1Alu5 = new ParticipacaoProjeto(aluno5, projeto1);
	    ParticipacaoProjeto partiProj1Alu6 = new ParticipacaoProjeto(aluno6, projeto1);
	    ParticipacaoProjeto partiProj1Alu7 = new ParticipacaoProjeto(aluno7, projeto1);
	    ParticipacaoProjeto partiProj1Alu8 = new ParticipacaoProjeto(aluno8, projeto1);
	    ParticipacaoProjeto partiProj1Alu9 = new ParticipacaoProjeto(aluno9, projeto1);
	 	
		
		professor1.getParticipacaoProjetos().add(partiProj1Prof1);
		professor2.getParticipacaoProjetos().add(partiProj1Prof2);
		
		aluno2.getParticipacaoProjetos().add(partiProj1Alu2);
		aluno3.getParticipacaoProjetos().add(partiProj1Alu3);
		aluno5.getParticipacaoProjetos().add(partiProj1Alu5);
		aluno6.getParticipacaoProjetos().add(partiProj1Alu6);
		aluno7.getParticipacaoProjetos().add(partiProj1Alu7);
		aluno8.getParticipacaoProjetos().add(partiProj1Alu8);
		aluno9.getParticipacaoProjetos().add(partiProj1Alu9);
		
		projeto1.getParticipacaoProjetos().add(partiProj1Prof1);
		projeto1.getParticipacaoProjetos().add(partiProj1Prof2);
		projeto1.getParticipacaoProjetos().add(partiProj1Alu2);
		projeto1.getParticipacaoProjetos().add(partiProj1Alu3);
		projeto1.getParticipacaoProjetos().add(partiProj1Alu5);
		projeto1.getParticipacaoProjetos().add(partiProj1Alu6);
		projeto1.getParticipacaoProjetos().add(partiProj1Alu7);
		projeto1.getParticipacaoProjetos().add(partiProj1Alu8);
		projeto1.getParticipacaoProjetos().add(partiProj1Alu9);
		
		
		
		projetos.add(projeto1);
		
		for (ParticipacaoProjeto participacaoProjeto: projeto1.getParticipacaoProjetos()){
			System.out.println(participacaoProjeto.getColaborador().getNome());
		}

		/* Projetos */
		Projeto projeto2 = new Projeto();
		projeto2.setId(30);
		projeto2.setTitulo("Engenharia de Software Orientada a Aspectos (ESOA)");
		projeto2.setDataInicio(new Date(2017, 07, 02));
		projeto2.setDataTermino(new Date(2017, 07, 02));
		projeto2.setAgenciaFinanciadora("FPCL");
		projeto2.setValorFinanciado(190000);
		projeto2.setObjetivo("O objetivo geral deste projeto é desenvolver os fundamentos e as tecnologias da ESOA");
		projeto2.setDescricao(
				" Pesquisar, aplicar e avaliar técnicas de desenvolvimento de software orientado à aspectos..");
		projeto2.setStatusDoProjeto(StatusDoProjeto.CONCLUIDO);

		
		    ParticipacaoProjeto partiProj2Prof1 = new ParticipacaoProjeto(professor1, projeto2);
		    ParticipacaoProjeto partiProj2Prof2 = new ParticipacaoProjeto(professor2, projeto2);
		    ParticipacaoProjeto partiProj2Alu1 = new ParticipacaoProjeto(aluno1, projeto2);
		    ParticipacaoProjeto partiProj2Alu2 = new ParticipacaoProjeto(aluno2, projeto2);
		    
		    ParticipacaoProjeto partiProj2Alu4 = new ParticipacaoProjeto(aluno4, projeto2);
		    ParticipacaoProjeto partiProj2Alu7 = new ParticipacaoProjeto(aluno7, projeto2);
		    ParticipacaoProjeto partiProj2Alu8 = new ParticipacaoProjeto(aluno8, projeto2);
		   
			
			professor1.getParticipacaoProjetos().add(partiProj2Prof1);
			professor2.getParticipacaoProjetos().add(partiProj2Prof2);
			
			aluno1.getParticipacaoProjetos().add(partiProj2Alu1);
			aluno2.getParticipacaoProjetos().add(partiProj2Alu2);
			aluno4.getParticipacaoProjetos().add(partiProj2Alu4);
			aluno7.getParticipacaoProjetos().add(partiProj2Alu7);
			aluno8.getParticipacaoProjetos().add(partiProj2Alu8);
			
			
			projeto2.getParticipacaoProjetos().add(partiProj2Prof1);
			projeto2.getParticipacaoProjetos().add(partiProj2Prof2);
			projeto2.getParticipacaoProjetos().add(partiProj2Alu1);
			projeto2.getParticipacaoProjetos().add(partiProj2Alu2);
			projeto2.getParticipacaoProjetos().add(partiProj2Alu4);
			projeto2.getParticipacaoProjetos().add(partiProj2Alu7);
			projeto2.getParticipacaoProjetos().add(partiProj2Alu8);
			
			projetos.add(projeto2);

		/* Projetos */
		Projeto projeto3 = new Projeto();
		projeto3.setId(40);
		projeto3.setTitulo("Qualidade de Software");
		projeto3.setDataInicio(new Date(2017, 07, 02));
		projeto3.setDataTermino(new Date(2017, 07, 02));
		projeto3.setAgenciaFinanciadora("FPCL");
		projeto3.setValorFinanciado(100000);
		projeto3.setObjetivo("O objetivo deste projeto é desenvolver os fundamentos e as tecnologias para desenvolvimento de software com qualidade.");
		projeto3.setDescricao(" Pesquisar, aplicar e avaliar técnicas para qualidade em desenvolvimento de software.");
		projeto3.setStatusDoProjeto(StatusDoProjeto.EM_ELABORACAO);

		    ParticipacaoProjeto partiProj3Prof2 = new ParticipacaoProjeto(professor2, projeto3);
		    ParticipacaoProjeto partiProj3Prof3 = new ParticipacaoProjeto(professor3, projeto3);
		    ParticipacaoProjeto partiProj3Alu1 = new ParticipacaoProjeto(aluno1, projeto3);
		    ParticipacaoProjeto partiProj3Alu3 = new ParticipacaoProjeto(aluno3, projeto3);
		    
		    ParticipacaoProjeto partiProj3Alu5 = new ParticipacaoProjeto(aluno5, projeto3);
		    ParticipacaoProjeto partiProj3Alu6 = new ParticipacaoProjeto(aluno6, projeto3);
		    ParticipacaoProjeto partiProj3Alu7 = new ParticipacaoProjeto(aluno7, projeto3);
		    ParticipacaoProjeto partiProj3Alu9 = new ParticipacaoProjeto(aluno9, projeto3);
			   
			
			professor3.getParticipacaoProjetos().add(partiProj3Prof2);
			professor2.getParticipacaoProjetos().add(partiProj3Prof3);
			
			aluno1.getParticipacaoProjetos().add(partiProj3Alu1);
			aluno3.getParticipacaoProjetos().add(partiProj3Alu3);
			aluno5.getParticipacaoProjetos().add(partiProj3Alu5);
			aluno6.getParticipacaoProjetos().add(partiProj3Alu6);
			aluno7.getParticipacaoProjetos().add(partiProj3Alu7);
			aluno9.getParticipacaoProjetos().add(partiProj3Alu9);
			
			
			projeto3.getParticipacaoProjetos().add(partiProj3Prof2);
			projeto3.getParticipacaoProjetos().add(partiProj3Prof3);
			projeto3.getParticipacaoProjetos().add(partiProj3Alu1);
			projeto3.getParticipacaoProjetos().add(partiProj3Alu3);
			projeto3.getParticipacaoProjetos().add(partiProj3Alu5);
			projeto3.getParticipacaoProjetos().add(partiProj3Alu6);
			projeto3.getParticipacaoProjetos().add(partiProj3Alu7);
			projeto3.getParticipacaoProjetos().add(partiProj3Alu9);

			projetos.add(projeto3);

		Projeto projeto4 = new Projeto();
		projeto4.setId(50);
		projeto4.setTitulo("Model-driven Software Product Lines Development");
		projeto4.setDataInicio(new Date(2017, 07, 02));
		projeto4.setDataTermino(new Date(2017, 07, 02));
		projeto4.setAgenciaFinanciadora("FPCL");
		projeto4.setValorFinanciado(500000);
		projeto4.setObjetivo("O objetivo deste projeto é elaborar técnicas de engenharia de software dirigadas a modelos para o desenvolvimento de linhas de produtos de software. ");
		projeto4.setDescricao("Pesquisar, aplicar e avaliar técnicas para o desenvolvimento de linhas de produtos de software.");
		projeto4.setStatusDoProjeto(StatusDoProjeto.EM_ELABORACAO);
	
	     	ParticipacaoProjeto partiProj4Prof2 = new ParticipacaoProjeto(professor2, projeto4);
		    ParticipacaoProjeto partiProj4Prof3 = new ParticipacaoProjeto(professor3, projeto4);
		    ParticipacaoProjeto partiProj4Alu1 = new ParticipacaoProjeto(aluno1, projeto4);
		    ParticipacaoProjeto partiProj4Alu3 = new ParticipacaoProjeto(aluno3, projeto4);
		    
		    ParticipacaoProjeto partiProj4Alu5 = new ParticipacaoProjeto(aluno5, projeto4);
		    ParticipacaoProjeto partiProj4Alu6 = new ParticipacaoProjeto(aluno6, projeto4);
		    ParticipacaoProjeto partiProj4Alu7 = new ParticipacaoProjeto(aluno7, projeto4);
		    ParticipacaoProjeto partiProj4Alu9 = new ParticipacaoProjeto(aluno9, projeto4);
			   
			
			professor3.getParticipacaoProjetos().add(partiProj4Prof2);
			professor2.getParticipacaoProjetos().add(partiProj4Prof3);
			
			aluno1.getParticipacaoProjetos().add(partiProj4Alu1);
			aluno3.getParticipacaoProjetos().add(partiProj4Alu3);
			aluno5.getParticipacaoProjetos().add(partiProj4Alu5);
			aluno6.getParticipacaoProjetos().add(partiProj4Alu6);
			aluno7.getParticipacaoProjetos().add(partiProj4Alu7);
			aluno9.getParticipacaoProjetos().add(partiProj4Alu9);
			
			
			projeto4.getParticipacaoProjetos().add(partiProj4Prof2);
			projeto4.getParticipacaoProjetos().add(partiProj4Prof3);
			projeto4.getParticipacaoProjetos().add(partiProj4Alu1);
			projeto4.getParticipacaoProjetos().add(partiProj4Alu3);
			projeto4.getParticipacaoProjetos().add(partiProj4Alu5);
			projeto4.getParticipacaoProjetos().add(partiProj4Alu6);
			projeto4.getParticipacaoProjetos().add(partiProj4Alu7);
			projeto4.getParticipacaoProjetos().add(partiProj4Alu9);

		
			projetos.add(projeto4);

		Projeto projeto5 = new Projeto();
		projeto5.setId(60);
		projeto5.setTitulo("Self-organizing Multi-agent Systems");
		projeto5.setDataInicio(new Date(2017, 07, 02));
		projeto5.setDataTermino(new Date(2017, 07, 02));
		projeto5.setAgenciaFinanciadora("FPCL");
		projeto5.setValorFinanciado(150000);
		projeto5.setObjetivo("O objetivo deste projeto é desenvolver sistemas multi-agentes autoorganizáveis");
		projeto5.setDescricao("Pesquisar, aplicar e avaliar técnicas para o desenvolvimento de sistemas multi-agentes auto-organizáveis");
		projeto5.setStatusDoProjeto(StatusDoProjeto.EM_ELABORACAO);

		

     	
		ParticipacaoProjeto partiProj5Alu1 = new ParticipacaoProjeto(aluno1, projeto5);
	    ParticipacaoProjeto partiProj5Alu3 = new ParticipacaoProjeto(aluno3, projeto5);
	    
	    ParticipacaoProjeto partiProj5Alu5 = new ParticipacaoProjeto(aluno5, projeto5);
	    ParticipacaoProjeto partiProj5Alu6 = new ParticipacaoProjeto(aluno6, projeto5);
	    ParticipacaoProjeto partiProj5Alu7 = new ParticipacaoProjeto(aluno7, projeto5);
	    ParticipacaoProjeto partiProj5Alu9 = new ParticipacaoProjeto(aluno9, projeto5);
		   
		
		aluno1.getParticipacaoProjetos().add(partiProj5Alu1);
		aluno3.getParticipacaoProjetos().add(partiProj5Alu3);
		aluno5.getParticipacaoProjetos().add(partiProj5Alu5);
		aluno6.getParticipacaoProjetos().add(partiProj5Alu6);
		aluno7.getParticipacaoProjetos().add(partiProj5Alu7);
		aluno9.getParticipacaoProjetos().add(partiProj5Alu9);
		
		
		projeto5.getParticipacaoProjetos().add(partiProj5Alu1);
		projeto5.getParticipacaoProjetos().add(partiProj5Alu3);
		projeto5.getParticipacaoProjetos().add(partiProj5Alu5);
		projeto5.getParticipacaoProjetos().add(partiProj5Alu6);
		projeto5.getParticipacaoProjetos().add(partiProj5Alu7);
		projeto5.getParticipacaoProjetos().add(partiProj5Alu9);

		projetos.add(projeto5);

		
		/* Publicações */
		Publicacao publicacao1 = new Publicacao();
		publicacao1.setId(1);
		publicacao1.setTitulo("Abordage Quantitativa para Desenvolvimento de Software Orientado a Aspectos");
		publicacao1.setNomeConferencia("SBQS");
		publicacao1.setAnoPublicacao(2006);
		publicacao1.getAutores().add(aluno4);
		publicacao1.getAutores().add(aluno8);
		publicacao1.getAutores().add(professor1);
		publicacao1.setProjeto(projeto2);
		
		aluno4.getProducaoAcademicas().add(publicacao1);
		aluno8.getProducaoAcademicas().add(publicacao1);
		professor1.getProducaoAcademicas().add(publicacao1);
		
		projeto2.getPublicacoes().add(publicacao1);
		
		publicacoes.add(publicacao1);
		
		Publicacao publicacao2 = new Publicacao();
		publicacao2.setId(2);
		publicacao2.setTitulo("Refactoring Product Lines");
		publicacao2.setNomeConferencia("GPCE");
		publicacao2.setAnoPublicacao(2007);
		publicacao2.getAutores().add(aluno1);
		publicacao2.getAutores().add(aluno9);
		publicacao2.getAutores().add(professor2);
		
		aluno1.getProducaoAcademicas().add(publicacao2);
		aluno9.getProducaoAcademicas().add(publicacao2);
		professor2.getProducaoAcademicas().add(publicacao2);
		
		publicacoes.add(publicacao2);
	
		
		Publicacao publicacao3 = new Publicacao();
		publicacao3.setId(3);
		publicacao3.setTitulo("Tratamento de Exceções Sensível ao Contexto");
		publicacao3.setNomeConferencia("SBES");
		publicacao3.setAnoPublicacao(2006);
		publicacao3.getAutores().add(aluno6);
		publicacao3.getAutores().add(professor3);
		
		aluno6.getProducaoAcademicas().add(publicacao3);
		professor3.getProducaoAcademicas().add(publicacao3);
		
		publicacoes.add(publicacao3);
		
		Publicacao publicacao4 = new Publicacao();
		publicacao4.setId(4);
		publicacao4.setTitulo("Integrating MAS in a component-based groupware environment");
		publicacao4.setNomeConferencia("AOSE");
		publicacao4.setAnoPublicacao(2006);
		publicacao4.getAutores().add(aluno6);
		publicacao4.getAutores().add(aluno7);
		publicacao4.getAutores().add(professor3);
		publicacao4.setProjeto(projeto1);
		
		aluno6.getProducaoAcademicas().add(publicacao4);
		aluno7.getProducaoAcademicas().add(publicacao4);
		professor3.getProducaoAcademicas().add(publicacao4);
		
		projeto1.getPublicacoes().add(publicacao4);
		
		
		publicacoes.add(publicacao4);
		
		
		Publicacao publicacao5 = new Publicacao();
		publicacao5.setId(5);
		publicacao5.setTitulo("Reputation Model Based on Testimonies");
		publicacao5.setNomeConferencia("AAMAS");
		publicacao5.setAnoPublicacao(2006);
		publicacao5.getAutores().add(aluno1);
		publicacao5.getAutores().add(aluno9);
		publicacao5.getAutores().add(professor1);
		publicacao5.setProjeto(projeto1);
		
		
		aluno1.getProducaoAcademicas().add(publicacao5);
		aluno9.getProducaoAcademicas().add(publicacao5);
		professor1.getProducaoAcademicas().add(publicacao5);
	
		projeto1.getPublicacoes().add(publicacao5);
		
		
		publicacoes.add(publicacao5);
		
		
		Publicacao publicacao6 = new Publicacao();
		publicacao6.setId(6);
		publicacao6.setTitulo("Extensions on Interaction Laws in Open Multi-Agent Systems");
		publicacao6.setNomeConferencia("SEAS");
		publicacao6.setAnoPublicacao(2005);
		publicacao6.getAutores().add(aluno8);
		
		aluno8.getProducaoAcademicas().add(publicacao6);
		
		publicacoes.add(publicacao6);
		
	

		Publicacao publicacao7 = new Publicacao();
		publicacao7.setId(7);
		publicacao7.setTitulo("Aspect-oriented Patterns");
		publicacao7.setNomeConferencia("FLOP");
		publicacao7.setAnoPublicacao(2006);
		publicacao7.getAutores().add(aluno4);
		publicacao7.getAutores().add(professor1);
		publicacao7.setProjeto(projeto2);
		
		aluno4.getProducaoAcademicas().add(publicacao7);
		professor1.getProducaoAcademicas().add(publicacao7);
		projeto2.getPublicacoes().add(publicacao7);
		
		publicacoes.add(publicacao7);
		
	
		Publicacao publicacao8 = new Publicacao();
		publicacao8.setId(8);
		publicacao8.setTitulo("Classifying and Describing Agent Contracts and Norms");
		publicacao8.setNomeConferencia("AAMAS");
		publicacao8.setAnoPublicacao(2005);
		publicacao8.getAutores().add(aluno2);
		publicacao8.getAutores().add(aluno7);
		publicacao8.setProjeto(projeto1);
		
		aluno2.getProducaoAcademicas().add(publicacao8);
		aluno7.getProducaoAcademicas().add(publicacao8);
		projeto1.getPublicacoes().add(publicacao8);
		
		publicacoes.add(publicacao8);
	
		
		/* Orientações */
		
		Orientacao orientacao1 = new Orientacao();
		orientacao1.setId(1);
		orientacao1.setTitulo("Usabilidade no Portal do Banco do Brasil");
		orientacao1.setTipoDeOrientacao(TipoDeOrientacao.TRABALHO_CONCLUSAO_CURSO);
		orientacao1.setAno(2005);
		orientacao1.setAluno(aluno1);
		orientacao1.setProfessor(professor1);
		orientacoes.add(orientacao1);
		professor1.getProducaoAcademicas().add(orientacao1);
		
		
		Orientacao orientacao2 = new Orientacao();
		orientacao2.setId(2);
		orientacao2.setTitulo("Framework para o Cálculo de Reputação de Agentes");
		orientacao2.setTipoDeOrientacao(TipoDeOrientacao.DISSERTACAO);
		orientacao2.setAno(2005);
		orientacao2.setAluno(aluno4);
		orientacao2.setProfessor(professor1);
		orientacoes.add(orientacao2);
		professor1.getProducaoAcademicas().add(orientacao2);
		
		
		Orientacao orientacao3 = new Orientacao();
		orientacao3.setId(3);
		orientacao3.setTitulo("Arquitetura para Catálogos de Objetos baseado em Ontologias");
		orientacao3.setTipoDeOrientacao(TipoDeOrientacao.DISSERTACAO);
		orientacao3.setAno(2005);
		orientacao3.setAluno(aluno5);
		orientacao3.setProfessor(professor2);
		orientacoes.add(orientacao3);
		professor2.getProducaoAcademicas().add(orientacao3);
		
		
		Orientacao orientacao4 = new Orientacao();
		orientacao4.setId(4);
		orientacao4.setTitulo("Framework para Smart Cards");
		orientacao4.setTipoDeOrientacao(TipoDeOrientacao.DISSERTACAO);
		orientacao4.setAno(2005);
		orientacao4.setAluno(aluno7);
		orientacao4.setProfessor(professor2);
		orientacoes.add(orientacao4);
		professor2.getProducaoAcademicas().add(orientacao4);
		
		Orientacao orientacao5 = new Orientacao();
		orientacao4.setId(5);
		orientacao4.setTitulo("Linguagem de Modelagem para Sistemas baseados em Agentes");
		orientacao4.setTipoDeOrientacao(TipoDeOrientacao.TESE);
		orientacao4.setAno(2005);
		orientacao4.setAluno(aluno9);
		orientacao4.setProfessor(professor2);
		orientacoes.add(orientacao1);
		professor2.getProducaoAcademicas().add(orientacao5);
		

		
		
	}

	/**
	 * Pega uma instancia Singleton de Memoria.
	 * 
	 * @return
	 */
	public static synchronized Memoria getInstance() {
		if (instanciaUnica == null) {
			instanciaUnica = new Memoria();
		}
		return instanciaUnica;
	}

	/**
	 * @return the alunos
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * @param alunos
	 *            the alunos to set
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	/**
	 * @return the professores
	 */
	public List<Professor> getProfessores() {
		return professores;
	}

	/**
	 * @param professores
	 *            the professores to set
	 */
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	/**
	 * @return the pesquisadores
	 */
	public List<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}

	/**
	 * @param pesquisadores
	 *            the pesquisadores to set
	 */
	public void setPesquisadores(List<Pesquisador> pesquisadores) {
		this.pesquisadores = pesquisadores;
	}

	/**
	 * @return the projetos
	 */
	public List<Projeto> getProjetos() {
		return projetos;
	}

	/**
	 * @param projetos
	 *            the projetos to set
	 */
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	/**
	 * @return the publicacoes
	 */
	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	/**
	 * @param publicacoes
	 *            the publicacoes to set
	 */
	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

	/**
	 * @return the orientacoes
	 */
	public List<Orientacao> getOrientacoes() {
		return orientacoes;
	}

	/**
	 * @param orientacoes
	 *            the orientacoes to set
	 */
	public void setOrientacoes(List<Orientacao> orientacoes) {
		this.orientacoes = orientacoes;
	}

	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(List<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
