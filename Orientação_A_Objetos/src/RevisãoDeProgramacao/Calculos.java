package RevisãoDeProgramacao;
import java.util.Scanner;

public class Calculos {
	public static void main(String[] args) {
		int a,b,escolha,soma, subtracao, multiplicacao,divisao;
		double fatoracao;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de (a): ");
		a = sc.nextInt();
		System.out.print("Digite o valor de (b): ");
		b = sc.nextInt();
		System.out.println("Digite: "
				+ "\n[1] para Adição"
				+ "\n[2] para Subtração"
				+ "\n[3] para Multiplicação"
				+ "\n[4] para Divisão"
				+ "\n[5] para Fatoração");
		escolha = sc.nextInt();
		soma = a+b;
		subtracao = a-b;
		multiplicacao = a*b;
		divisao = a/b;
		fatoracao = Math.pow(a,b);
		
		if (escolha == 1) {
			System.out.println(a + "+" + b + "=" + soma);}
		if (escolha == 2) {
			System.out.println(a + "-" + b + "=" + subtracao);}
		if (escolha == 3) {
			System.out.println(a + "x" + b + "=" + multiplicacao);}
		if (escolha == 4) {
			System.out.println(a + "/" + b + "=" + divisao);}
		if (escolha == 5) {
			System.out.println(a + "^" + b + "=" + fatoracao);}
	}
}
