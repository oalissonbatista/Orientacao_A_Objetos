package RevisãoDeProgramacao;

public class PalindromoTeste {
	public static void main (String [] args) {
		int i = 0;
		String []x;
		x = new String[5];
		x[0] = "a";
		x[1] = "r";
		x[2] = "a";
		x[3] = "r";
		x[4] = "a";
		boolean resposta = true;
		for(i=0; i<3;i++) {
			if (x[i] == x[6-i]) {
				resposta = true;
				
			
			}else {
				resposta = false;
				break;
			}
		}
		System.out.println(resposta);
	}

}
