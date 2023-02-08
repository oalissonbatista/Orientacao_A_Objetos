package estudoDirigidoHerancaExcecoes;

import exceptions.Excecao3;

public abstract class Progressao {
	
	int a0, 
	    r, 
	    n;
	int[] termos;
	
	public Progressao(int a0, int r, int n) {
		this.a0 = a0;
		this.r = r;
		this.n = n;
		
		termos = new int[n];
		
		try {
			if (n > 10) {
				System.out.println("Lancei excecao3 em Progressao.Progressao()");
				throw new Excecao3();
			}
		} catch (Excecao3 e) {
			System.out.println("Capturei excecao3 em Progressao.Progressao()");
			n = 10; 
			this.n = n;
			termos = new int[n];
			
		}
	}
	
	public abstract void computarProgressao();
	
	public String imprimirProgressao() {
		System.out.println("A");
		String resposta = ""; 
		resposta = "[";
		for (int n: termos) {
			resposta += " " + n; 
		}
		resposta += "]";
		return resposta;
	}
}