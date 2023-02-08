package Triangulo;

import javax.swing.JOptionPane;

public class Principal {
	
	private static Triangulo t1;
	private static Triangulo t2;
	private static Triangulo t3;

	public static void main(String[] args) {
		
		t1 = new Triangulo(3, 4, 5);
		t2 = new Triangulo(10, 1, 2);
		t3 = new Triangulo(2, 4, 8);
		
		System.out.println(t1.CalcularPerimetro());
		
		JOptionPane.showInputDialog("Ola");
		
		
	}

}
