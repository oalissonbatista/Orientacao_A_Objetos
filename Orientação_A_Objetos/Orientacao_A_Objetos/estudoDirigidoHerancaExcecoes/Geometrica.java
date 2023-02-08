package estudoDirigidoHerancaExcecoes;
import exceptions.Excecao1;
import exceptions.Excecao2;

public class Geometrica extends Progressao{
	public Geometrica(int a0, int r, int n) throws Excecao1 {
		super(a0, r, n);
		if (r == 0) {
			throw new Excecao1(); 
		} 
		if (r <= 0) {
			throw new Excecao2();
		} 
	}

	public void computarProgressao() {
		for (int i=0; i<n; i++) {
			this.termos[i] = (int)(a0*(Math.pow(r, (i-1))));
		}
	}
	
	public String imprimirProgressao() {
		String resposta = "Prog. Geom. = " + super.imprimirProgressao();
		return resposta;
	}
}