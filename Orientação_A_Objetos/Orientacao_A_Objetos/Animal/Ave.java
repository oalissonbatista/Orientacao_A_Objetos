package Animal;

public class Ave extends Animal {
	private String corPena;
	
	
	public Ave(float p,int i, int m, String cp) {
		membros = m;
		peso = p;
		idade = i;
		corPena = cp;
		
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
		
	}
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
}
