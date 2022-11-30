package Calculadora;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Definição das referências
		int escolha = 0;
		Scanner sc = new Scanner(System.in);
		Calculos calc,                     // referencias para objetos do tipo Calculo      
		         c2;
		calc = new Calculos(2,3); //objeto (Quando recebe os valores)
		System.out.println("digite os valores: \n");
		while (escolha > 4 || escolha < 1) { 
			System.out.println("Digite:\n"
				             + "[1] para Somar\n"
				             + "[2] para Subtrair\n"
				             + "[3] para multiplicar\n"
				             + "[4] para dividir");
			escolha = sc.nextInt();
			if (escolha == 1) {
				calc.somar();
				System.out.println(calc.getOp1() + " + " + calc.getOp2()+ " = " + calc.getResultado());
			} else if (escolha == 2) {
				calc.subtrair();
				System.out.println(calc.getOp1() + " - " + calc.getOp2()+ " = " + calc.getResultado());
			} else if (escolha == 3) {
				calc.multiplicar();
				System.out.println(calc.getOp1() + " * " + calc.getOp2()+ " = " + calc.getResultado());
			}else if (escolha == 4) {
				calc.dividir();
				System.out.println(calc.getOp1() + " / " + calc.getOp2()+ " = " + calc.getResultado());
			}
	
        }
	}

}
