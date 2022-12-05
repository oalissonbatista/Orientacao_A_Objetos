package Universidade;

import java.util.Scanner;

public class Disciplina {
	Scanner sc = new Scanner (System.in);
	String nomeDisciplina,
	       professor,
	       codigoDisciplina;
	int cargaDisciplina;
	Aluno aluno;
	Curso curso;
	
	public Disciplina (String nomeDisciplina, String professor, String codigoDisciplina, int cargaDisciplina) {
		System.out.println("Digite o nome da Disciplina: ");
		this.nomeDisciplina = sc.next();
		System.out.println("Digite o nome do professor: ");
		this.professor = sc.next();
		System.out.println("Digite o codigo da Disciplina: ");
		this.codigoDisciplina = sc.next();
		System.out.println("Digite a carga horaria da Disciplina: ");
		this.cargaDisciplina = sc.nextInt();
	}
	void status() {
		System.out.println("Disciplina: " + this.nomeDisciplina + "\nCodigo: " + this.codigoDisciplina
				+ "\nCarga horaria de: " + this.cargaDisciplina + "h" + "\nProfessor: " + this.professor);
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public int getCargaDisciplina() {
		return cargaDisciplina;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		String nomeDisciplina1 = sc.next();
		this.nomeDisciplina = nomeDisciplina1;
	}
	public String getNomeDisciplina() {
		System.out.println("Nome da Disciplina: " + this.nomeDisciplina);
		return nomeDisciplina; 
	}
	
	public void getProfessor() {
		System.out.println(this.professor);
	}
	public void setProfessor() {
		this.professor = sc.next();
	}
	public void setCargaDisciplina() {
		this.cargaDisciplina = sc.nextInt();
	}
	//public void setConstrutor(String nomeDisciplina, String professor, String codigoDisciplina, int cargaDisciplina) {
		////setProfessor(); 
	//}
}
