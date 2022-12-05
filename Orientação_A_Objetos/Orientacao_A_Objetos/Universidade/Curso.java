package Universidade;

public class Curso {
	//definição dos atributos
	String nomeCurso,
	       cargaHCurso,
	       turno;
	Aluno aluno;
	Disciplina disciplina;
	// metodo construtor alternativo
	public Curso(String nomeCurso, String cargaHCurso, String turno) {
		this.nomeCurso = nomeCurso;
		this.cargaHCurso = cargaHCurso;
		this.turno = turno;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getCargaHCurso() {
		return cargaHCurso;
	}

	public void setCargaHCurso(String cargaHCurso) {
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
