package Calculadora;

import java.util.Scanner;

public class Calculos {	
	Scanner sc = new Scanner (System.in);
	//definição dos atributos
	private int op1,
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
	 
	 public void dividir() throws ArithmeticException {
		 if (this.op2 == 0) {
			 throw new DivisaoPorZeroException();
		 } else {
			 this.resultado = this.op1 / this.op2;
			 System.out.println("O resultado de " + this.op1 + " / " + this.op2 + " é " + this.resultado + "\n");
		 } 
	 }
	 
	 //public void dividir() {
	//	 try {
    //	 this.resultado = this.op1 / this.op2;
	 //	 }catch(ArithmeticException e) {
		//	 if (this.op1 > 0) {
		//		 resultado = Integer.MAX_VALUE;
			// }else {
				// resultado = Integer.MIN_VALUE;
			// }
	//	 }
		 
		 //System.out.println("O resultado de " + this.op1 + " / " + this.op2 + " é " + this.resultado + "\n");
	 //} 
}