package MegaSena;

public class Principal {
	
	private static MegaSena jogo1;
	private static MegaSena jogo2;
	
	public static void main (String[] args) {
		int resultado[] = {10,20,54,26,34,54};
		jogo1 = new MegaSena(10,20,54,26,34,54);
		jogo2 = new MegaSena(1,26,14,25,29,36);
		jogo1.setPremio(null);
		jogo1.setValorAposta(0);
		jogo1.setNumeroSorteio(0);
		
		System.out.println(jogo1.getValorAposta());
		
	}

}
