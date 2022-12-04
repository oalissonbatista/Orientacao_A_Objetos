package Universidade;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoAcadêmica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Bem vindo a UNB-------");
		
		
		
		int escolhaClasse;
		do {
			System.out.println("Digite a opção desejada:"
				         + "\n[1] para acessar a classe Aluno"
				         + "\n[2] para acessar a classe Curso"
				         + "\n[3] para acessar a classe Disciplina");
			escolhaClasse = sc.nextInt();
		} while (escolhaClasse < 1 || escolhaClasse >3);
		
		if (escolhaClasse == 1) {
			int escolhaAluno;
			do {
				System.out.println("Digite a opção desejada:"
						         + "\n[1] Matricular aluno"
						         + "\n[2] Emitir Relatorio do aluno");
				escolhaAluno = sc.nextInt();
				}while (escolhaAluno < 1|| escolhaAluno > 2);
			if (escolhaAluno == 1) {
				Aluno.matricularAluno();
			}else {
				Aluno.emitirRelatorioAluno();
			}
			
			
		}else if(escolhaClasse == 2) {
			System.out.println("escolheu Curso");
			int escolhaCurso;
			do {
				System.out.println("Digite a opcao desejada:"
						         + "[1] para criar Curso"
						         + "[2] para pesquisar alunos");
				escolhaCurso = sc.nextInt();
			}while (escolhaCurso < 1 || escolhaCurso > 2);
			if (escolhaCurso ==1) {
				Curso.criarCurso();
			}else {
				Curso.pesquisarAlunos();
			}
			
		}else {
			System.out.println("escolheu Disciplina");
			int escolhaDisciplina;
			do {
				System.out.println("Digite a opcao desejada:"
						         + "[1] para Cadastrar Disciplina"
						         + "[2] para pesquisar Alunos");
				escolhaDisciplina = sc.nextInt();
			} while ( escolhaDisciplina <1 || escolhaDisciplina >2);
			if (escolhaDisciplina ==1) {
				
				
			}else {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ArrayList<String> disciplinas = new ArrayList<String>();	
		
		
		
		Disciplina Matematica = new Disciplina(null, null, null, 0);
		Matematica.cargaDisciplina = 60;
		Matematica.codigoDisciplina = "FGA-1234";
		Matematica.professor = "Glauco";
		Matematica.nomeDisciplina = "Matematica";
		//Matematica.status();
		disciplinas.add(Matematica.nomeDisciplina);
		
		System.out.println("------------------------------");
		
		Disciplina Metodos = new Disciplina(null, null, null, 0);
		Metodos.cargaDisciplina = 60;
		Metodos.codigoDisciplina= "FGA-034";
		Metodos.professor = "Luciano";
		Metodos.nomeDisciplina = "Métodos Numéricos";
		//Metodos.status();
		disciplinas.add(Metodos.nomeDisciplina);
		
		Disciplina OO = new Disciplina(null, null, null, 0);
		//OO.setNomeDisciplina(null);
		//OO.status();
		//disciplinas.add(OO.nomeDisciplina);

		
		System.out.println(disciplinas);
	}


}
