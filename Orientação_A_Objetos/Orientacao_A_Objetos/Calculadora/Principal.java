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
			char operacao = sc.next().charAt(0);
			if (operacao == 43) {           // importando da tabela ASCII
				calculo.somar();
			}else if (operacao == 45) {
				calculo.subtrair();
			}else if (operacao == 42) {
				calculo.multiplicar();
			}else if (operacao == 47){
				calculo.dividir();
			}
			System.out.println("Usuário desejar realizar mais um cálculo? (s/n)");
			escolha = sc.next().charAt(0);
		}
		
		System.out.println("Encerrando...");
		
	
	}

}
