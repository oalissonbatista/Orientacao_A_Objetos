package Universidade;

import java.util.Scanner;

public class Disciplina {
	Scanner sc = new Scanner (System.in);
	String nomeDisciplina,
	       professor,
	       codigoDisciplina;
	int cargaDisciplina;
	
	public Disciplina (String nomeDisciplina, String professor, String codigoDisciplina, int cargaDisciplina) {
		this.cargaDisciplina = cargaDisciplina;
		this.codigoDisciplina = codigoDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.professor = professor;
	}
	
	void status() {
		System.out.println("Disciplina: " + this.nomeDisciplina + "\nCodigo: " + this.codigoDisciplina
				+ "\nCarga horaria de: " + this.cargaDisciplina + "h" + "\nProfessor: " + this.professor);
	}
	
	void cadastrarDisciplina() {
		
		
	}

	

	public void setNomeDisciplina(String nomeDisciplina) {
		String nomeDisciplina1 = sc.next();
		this.nomeDisciplina = nomeDisciplina1;
	}
	public String getNomeDisciplina() {
		System.out.println("Nome da Disciplina: " + this.nomeDisciplina);
		return nomeDisciplina; 
	}	
}
