package Calculadora;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char escolha = 0;
		System.out.println("Usuário desejar realizar um cálculo? (s/n)");
		escolha = sc.next().charAt(0);
		while (escolha == 's' || escolha == 'S') {
			Calculos calculo = new Calculos(0, 0);	
			System.out.println("Informe a operação desejada: (+, -, *, /)");
			int operacao = sc.nextInt();
			if (operacao == 1) {
				calculo.somar();
			}else if (operacao == 2) {
				calculo.subtrair();
			}else if (operacao == 3) {
				calculo.multiplicar();
			}else if (operacao == 4){
				calculo.dividir();
			}
			System.out.println("Usuário desejar realizar um cálculo? (s/n)");
			escolha = sc.next().charAt(0);
		}
		
		System.out.println("Encerrando...");
	
	}

}
