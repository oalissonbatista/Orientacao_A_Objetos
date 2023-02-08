package estudoDirigidoHerancaExcecoes;

import exceptions.Excecao1;

public class principal {

	public static void main(String[] args) throws Excecao1 {
		Progressao p8 = new Geometrica(1, 2, 15);
		p8.computarProgressao();
		System.out.println(p8.imprimirProgressao());

	}	


}
