package Universidade;

import java.util.Scanner;

public class Aluno {
	Scanner sc = new Scanner(System.in);
	String nomeCompleto,
	       email;
	int matricula;
	Curso curso;
	Disciplina disciplina;
	
	public Aluno(String nomeCompleto, String email, int matricula) {
		System.out.println("Digite o nome completo do aluno: ");
		this.nomeCompleto = sc.next();
		System.out.println("Digite o email: ");
		this.email = sc.next();
		System.out.println("Digite a matrícula: ");
		this.matricula = sc.nextInt();
	}
	
	
	public void statusAluno() {
		System.out.println("Aluno: " + this.nomeCompleto + "\ne-mail: " 
	                                       + this.email + "\nMatrícula: " + this.matricula);
	}
	
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
