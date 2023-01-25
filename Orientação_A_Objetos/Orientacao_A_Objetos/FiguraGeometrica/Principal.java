package FiguraGeometrica;

public class Principal {

	public static void main(String[] args) {
		
		FiguraGeometrica vetor[] = new FiguraGeometrica[5]; //Inclusao 
		vetor[0] = new Quadrado(9);
		//((Quadrado)vetor[0]).getArea(); //Coercao
		vetor[1] = new Retangulo(10, 5);
		vetor[2] = new Trapezio(5, 10, 6);
		vetor[3] = new Triangulo(10, 5);
		vetor[4] = new Circulo(10.5);
		
		System.out.println("Imprimindo Areas: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].CalcularArea());  //sobrescrita de métodos
		}
		System.out.println("imprimindo Perimetros: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].CalcularPerimetro()); //sobrescrita de métodos
		}

		//Quadrado q = new Quadrado(9);
		//System.out.println(q.CalcularArea());
		//System.out.println(q.CalcularPerimetro());
		//System.out.println(q.getBase());
		
		
		
		
		
		
	}

}
