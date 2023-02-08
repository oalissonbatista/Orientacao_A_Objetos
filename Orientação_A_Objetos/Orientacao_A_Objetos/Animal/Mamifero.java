package Animal;

public class Mamifero extends Animal{
	private String corPelo;
	
	//getters e setters
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	public String getCorPelo() {
		System.out.println(this.corPelo);
		return this.corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mam�fero");
		
	}

}
