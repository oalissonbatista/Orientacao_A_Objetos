package Animal;

public class Principal {
	
	public static void main(String[] args) {
	Mamifero urso = new Mamifero();
	Ave periquito = new Ave(0, 0, 0, null);
	periquito.membros= 4;
	Reptil r = new Reptil();
	Peixe p = new Peixe();
	
	urso.peso = 180;
	urso.idade = 12;
	urso.membros = 4;
	urso.alimentar();
	urso.locomover();
	urso.emitirSom();
	
	periquito.idade = 3;
	periquito.membros = 4;
	periquito.peso = (float) 0.100;
	periquito.alimentar();
	periquito.emitirSom();
	periquito.fazerNinho();
	periquito.locomover();
	
	Canguru Alisson = new Canguru();
	Alisson.locomover();
	Alisson.usarBolsa();
	Alisson.idade = 12;
	Alisson.membros = 4;
	Alisson.peso = 74;
	Alisson.alimentar();
	Alisson.emitirSom();
	Alisson.setCorPelo("Marrom");
	Alisson.getCorPelo();
	
	
	}

}
