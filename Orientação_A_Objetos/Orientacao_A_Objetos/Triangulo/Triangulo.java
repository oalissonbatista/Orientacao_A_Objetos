package Triangulo;

import java.util.Scanner;

public class Triangulo {
	Scanner sc = new Scanner (System.in);
	private float perimetro,area;
	private Lado l1,l2,l3;
	
	public Triangulo(float a, float b, float c) {
		l1 = new Lado(a);
		l2 = new Lado(b);
		l3 = new Lado(c);
	}
	
	public float getPerimetro() {
		return perimetro;
	}
	public float getArea() {
		return area;
	}
	public float CalcularPerimetro() {
		perimetro = l1.getMedida()+l2.getMedida()+l3.getMedida();
		return perimetro;
	}
	public float CalcularArea() {
		area = (l1.getMedida() + l2.getMedida()) /2;
		return area;
	}
	public boolean EhTriangulo() {
		boolean simNao = false;
		if ((l2.getMedida()-l3.getMedida()) < l1.getMedida() && l1.getMedida() < (l2.getMedida()+l3.getMedida()) && (l1.getMedida()-l3.getMedida())
				<l2.getMedida() && l2.getMedida() <(l1.getMedida()+l3.getMedida()) && (l1.getMedida()-l2.getMedida())< l3.getMedida() && l3.getMedida() <(l1.getMedida()+l2.getMedida()) ) {
			simNao = true;
		}
		return simNao;
	}
	

}
