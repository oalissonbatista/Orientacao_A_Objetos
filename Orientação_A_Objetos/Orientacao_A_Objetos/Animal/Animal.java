package Animal;

public abstract class Animal {             //abstrato � escrito em It�lico.
	//atributos de animal
	protected float peso;
	protected int idade; 
	protected String membros;
	//metodos de animal
	public abstract void locomover();
	public abstract void alimentar();  //coloca abstrato para que cada um que usar, implemente o m�todo.
	public abstract void emitirSom();  //se a classe tem m�todos abstratos, ent�o ela � abstrata.
	
	// getters e setters
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
}
