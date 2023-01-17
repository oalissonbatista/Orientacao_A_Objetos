package Universidade;
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
				System.out.println("Digite os dados do aluno a ser matriculado: ");
				Aluno aluno1 = new Aluno(null, null, 0);
				System.out.println("Aluno -"+ aluno1.getNomeCompleto() +"- Matriculado!");
				
			}else if(escolhaAluno == 2){
				System.out.println();
				
			}
			
			
		}else if(escolhaClasse == 2) {
			System.out.println("escolheu Curso");
			int escolhaCurso;
			do {
				System.out.println("Digite a opcao desejada:"
						         + "\n[1] para criar Curso"
						         + "\n[2] para pesquisar alunos");
				escolhaCurso = sc.nextInt();
			}while (escolhaCurso < 1 || escolhaCurso > 2);
			if (escolhaCurso ==1) {
				Curso curso1 = new Curso(null, 0, null);
				System.out.println("Curso - " + curso1.getNomeCurso()+ " - criado");
				
			}else {
				
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
				Disciplina disciplina1 = new Disciplina(null, null, null, 0);
				System.out.println("Disciplina -" + disciplina1.getNomeDisciplina() + "- cadastrado(a)");
			}else {
				
			}
		}
		
		
	}


}
