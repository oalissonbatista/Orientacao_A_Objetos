package Universidade;

public class Curso {
	//definição dos atributos
	String nomeCurso,
	       cargaHCurso,
	       turno;
	// metodo construtor alternativo
	public Curso(String nomeCurso, String cargaHCurso, String turno) {
		this.nomeCurso = nomeCurso;
		this.cargaHCurso = cargaHCurso;
		this.turno = turno;
	}
	
	void criarCurso() {
		System.out.println("Curso criado:" + nomeCurso);
		
	}
	void pesquisarAlunos() {
		System.out.println("Lista de alunos ns Disciplina");
		
		
	}
	


}
