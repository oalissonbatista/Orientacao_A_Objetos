package Universidade;

import java.util.Scanner;

public class Curso {
	Scanner sc = new Scanner(System.in);
	//definição dos atributos
	String nomeCurso,
	       turno;
	int cargaHCurso;
	Aluno aluno;
	Disciplina disciplina;
	// metodo construtor alternativo
	public Curso(String nomeCurso, int cargaHCurso, String turno) {
		System.out.println("Digite o nome do curso: ");
		this.nomeCurso = sc.next();
		System.out.println("Digite a carga horária do curso: ");
		this.cargaHCurso = sc.nextInt();
		System.out.println("Digite o turno do Curso: ");
		this.turno = sc.next();
	}
	public String getNomeCurso() {
		return this.nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getCargaHCurso() {
		return cargaHCurso;
	}

	public void setCargaHCurso(int cargaHCurso) {
		this.cargaHCurso = cargaHCurso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	static void criarCurso() {
		
	}
	static void pesquisarAlunos() {
		System.out.println("Lista de alunos ns Disciplina");
	}
}
