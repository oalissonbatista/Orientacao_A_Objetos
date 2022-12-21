package Animal;

public class Canguru extends Mamifero{
	public void locomover() {
		System.out.println("Saltando");  // sobrepoe o "correndo" da classe Mamifero
	}
	
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}
}
