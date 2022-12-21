package MegaSena;

<<<<<<< HEAD
=======
import java.awt.geom.IllegalPathStateException;
>>>>>>> 065ca8e (Atualização de código)
import java.util.Random;

public class MegaSena {
	
	private String premio;
<<<<<<< HEAD
	private float valorAposta;
=======
	private double valorAposta;
>>>>>>> 065ca8e (Atualização de código)
	private int numeroSorteio;
	private Numero n1,n2,n3,n4,n5,n6;
	
	
	public MegaSena(int a, int b, int c, int d, int e,int f) {
		n1 = new Numero(a);
		n2 = new Numero(b);
		n3 = new Numero(c);
		n4 = new Numero(d);
		n5 = new Numero(e);
		n6 = new Numero(f);
<<<<<<< HEAD
	}
	
	public void aposta() {
		Numero aposta[] = {this.n1,this.n2,this.n3,this.n4,this.n5,this.n6};
		for(int i =0; i < 6;i++) {
			System.out.println(aposta[i]);
		}
	}



=======
		
		Numero aposta[] = {this.n1,this.n2,this.n3,this.n4,this.n5,this.n6};
	}
	public void aposta() {
		Numero aposta[] = {this.n1,this.n2,this.n3,this.n4,this.n5,this.n6};
		for (int i =0; i< 6; i++) {
			System.out.println(aposta[i]);
		}
	
	}
	
	public void Status() {
		System.out.println("Premio: " + this.premio + "\nValor da aposta: " + this.valorAposta + "\nNumero do sorteio: "
				+ this.numeroSorteio + "Aposta: " );
		
	}
	
>>>>>>> 065ca8e (Atualização de código)
	public String getPremio() {
		return premio;
	}

<<<<<<< HEAD
	public void setPremio(String premio) {
		this.premio = "R$ 1.000.000,00";
		premio = this.premio;
	}

	public void setValorAposta(float valorAposta) {
		valorAposta = (float) 4.50;
		this.valorAposta = valorAposta;
	}

	public float getValorAposta() {
		return this.valorAposta;
	}
	
	
	Random r = new Random();
	public void setNumeroSorteio(int numeroSorteio) {
		
		this.numeroSorteio = numeroSorteio;
	}
	public float getNumeroSorteio() {
		this.numeroSorteio =  r.nextInt();
=======
	public void setPremio(String p) {
		this.premio = p;
	}

	public void setValorAposta(double vApo) {
		this.valorAposta = vApo;
	}

	public double getValorAposta() {
		return this.valorAposta;
	}
	
	public void setNumeroSorteio(int nSorteio) {
		this.numeroSorteio = nSorteio;
	}
	public float getNumeroSorteio() {
>>>>>>> 065ca8e (Atualização de código)
		return numeroSorteio;
	}
}
