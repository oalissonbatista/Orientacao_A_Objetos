package Calculadora;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char escolha = 0;
		System.out.println("Usu�rio desejar realizar um c�lculo? (s/n)");
		escolha = sc.next().charAt(0);         
		while (escolha == 's' || escolha == 'S') {
			Calculos calculo = new Calculos(0, 0);	
			System.out.println("Informe a opera��o desejada: (+, -, *, /)");
			char operacao = sc.next().charAt(0);
			if (operacao == '+') {           // importando da tabela ASCII
				calculo.somar();
			}else if (operacao == '-') {
				calculo.subtrair();
			}else if (operacao == '*') {
				calculo.multiplicar();
			}else if (operacao == '/'){
				calculo.dividir();
			}
			System.out.println("Usu�rio desejar realizar mais um c�lculo? (s/n)");
			escolha = sc.next().charAt(0);
		}
		
		System.out.println("Encerrando...");
		
	
	}

}
