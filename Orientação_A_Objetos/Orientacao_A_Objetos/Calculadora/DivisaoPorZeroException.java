package Calculadora;

public class DivisaoPorZeroException extends ArithmeticException { // Criando uma objeto de exceção
	
	public DivisaoPorZeroException() {
		super("Houve uma divisão por Zero");
	}
	

}
