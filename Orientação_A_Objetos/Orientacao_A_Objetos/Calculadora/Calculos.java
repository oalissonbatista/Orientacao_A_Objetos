package Calculadora;

import java.util.Scanner;

public class Calculos {	
	Scanner sc = new Scanner (System.in);
	//definição dos atributos
	int op1,
	    op2,
	    resultado;
	
	//método construtor alternativo
	public Calculos(int op1, int op2) {
		System.out.println("Informe o valor do operando1: ");
		this.op1  = sc.nextInt();
		System.out.println("Informe o valor do operando2: ");
		this.op2 = sc.nextInt();		
	}
	// métodos 
	 public void somar() {
		 this.resultado = this.op1 + this.op2;
		 System.out.println("O resultado de " + this.op1 + " + " + this.op2 + " é " + this.resultado + "\n");
	 }
	 public void subtrair() {
		 this.resultado = this.op1 - this.op2;
		 System.out.println("O resultado de " + this.op1 + " - " + this.op2 + " é " + this.resultado + "\n");
	 }
	 public void multiplicar() {
		 this.resultado = this.op1 * this.op2;
		 System.out.println("O resultado de " + this.op1 + " * " + this.op2 + " é " + this.resultado + "\n");
	 }
	 public void dividir() {
		 this.resultado = this.op1 / this.op2;
		 System.out.println("O resultado de " + this.op1 + " / " + this.op2 + " é " + this.resultado + "\n");
	 } 
}