package RevisãoDeProgramacao;
import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		float soma = 0; 
		int par = 0, impar =0,positivo =0, negativo =0, zeros=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int x = sc.nextInt();
		int[] vetor = new int[x];
		
		for (int c = 0; c < x; c++) {
			System.out.println("Digite os termos: ");
			int valor = sc.nextInt();
			vetor[c] = valor; // adicionando o valor lido ao vetor 	
			soma += valor;
			if (valor > 0){
				positivo += 1;
			}else if (valor < 0){
				negativo += 1;				
			}else if (valor == 0){
				zeros += 1;
			}if(valor % 2 == 0){
				par += 1;
			}else{
				impar += 1;
			}
		}
		float media = soma / x; 
		System.out.println("A média dos valores lidos é = " + media);
		System.out.println("Possui " + positivo + " numeros positivos.");
		System.out.println("Possui " + negativo + " numeros negativos.");
		System.out.println("Possui " + zeros + " zeros." );
		System.out.println("Possui " + par + " numeros pares." );
		System.out.println("Possui " + impar + " numeros impares.");
	}
	
}
