package Triangulo;

import java.util.Scanner;

public class Lado {
	Scanner sc = new Scanner(System.in);
	private float medida;
	
	public Lado (float l) {
		this.medida = l;
	}
	
	public float getMedida() {
		return medida;
	}
	public void setMedida(float medida) {
		this.medida = medida;
	}
}
