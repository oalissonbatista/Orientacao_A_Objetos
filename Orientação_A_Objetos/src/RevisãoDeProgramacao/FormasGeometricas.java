package RevisãoDeProgramacao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FormasGeometricas {
	public static void main (String[] args) {
		int option;
		float raio;
		float pi = (float) 3.14159; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Escola a figura geométrica desejada"
				      + "\n[1] Circulo"
				      + "\n[2] Quadrado"
				      + "\n[3] Retangulo"
				      + "\n[4] Trapezio "
				      + "\n[5] Triângulo");
		option = sc.nextInt();
		
		switch(option) {
		case 1: // Círculo
			System.out.println("Informe o raio do Circulo:");
			DecimalFormat deci = new DecimalFormat("0.00"); // formato do float
			DecimalFormat deci1 = new DecimalFormat("0.0");
			raio = sc.nextFloat();
			float perimetroC = (raio * 2 * pi);
			float areaC =(float) (pi * Math.pow(raio, 2));
			System.out.println("O perimetro do círculo é " + deci1.format(perimetroC) + " e a area " + deci.format(areaC)+".");

		case 2: // Quadrado
			System.out.println("Digite o lado do Quadrado: ");
			float ladoQ = sc.nextFloat();
			float perimetroQ = ladoQ * 4;
			float areaQ = ladoQ * ladoQ;
			System.out.println("O perímetro do Quadrado é " + perimetroQ + " e a area " + areaQ + ".");
			
		case 3: // retangulo
			System.out.println("Informe a Base do retangulo: ");
			float baseR = sc.nextFloat();
			System.out.println("Informe a Altura do retangulo: ");
			float alturaR = sc.nextFloat();
			float areaR = baseR * alturaR;
			
		case 4: // Trapezio
			System.out.println("Digite o valor da Base maior: ");
			float baseMaior = sc.nextFloat();
			System.out.println("Digite o valor da Base menor: ");
			float baseMenor = sc.nextFloat();
			System.out.println("Digite o valor da Altura: ");
			float alturaTrap = sc.nextFloat();
			float areaTrap = 1/2* (alturaTrap*(baseMaior + baseMenor));
			
		case 5: // Triangulo
			System.out.println("Digite o valor do lado a: ");
			float A = sc.nextFloat();
			System.out.println("Digite o valor do lado b: ");
			float B = sc.nextFloat();
			System.out.println("Digite o valor do lado c: ");
			float C = sc.nextFloat();
			if ((B-C) < A && A < (B+C) && (A-C)<B && B <(A+C) && (A-B)< C && C <(A+B) ){
				System.out.println("Existe triangulo"); 
			}else {
				System.out.println("Nao e possivel formar um triangulo");
				 break;
			}
		}
	}
}
