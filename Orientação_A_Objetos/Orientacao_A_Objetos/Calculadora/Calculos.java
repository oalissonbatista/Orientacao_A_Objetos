package Calculadora;


public class Calculos {
	//definição dos atributos
	int op1,
	    op2,
	    resultado;
	
	//método construtor alternativo
	public Calculos(int op1, int op2) {
		this.op1  = op1;
		this.op2 = op2;
	}
	// gets e sets
	 void setOp1(int op1) { // atribui valores a op1
		this.op1 = op1;
	}
	 void setOp2(int op2) {
		 this.op2 = op2;
	 }
	 int getResultado() {
		 return resultado;
	 }
	 int somar() {
		 resultado = op1 + op2;
		 return resultado;
	 }
	 int subtrair() {
		 resultado = op1-op2;
		 return resultado;
	 }
	 int multiplicar() {
		 resultado = op1 * op2;
		 return resultado;
	 }
	 int dividir() {
		 resultado = op1 / op2;
		 return resultado;
	 }
	 int getOp1 () {
		 return op1;
	 }
	 int getOp2() {
		 return op2;
	 } 
}