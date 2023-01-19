package FiguraGeometrica;

public class Quadrado extends Quadrilatero {

	public Quadrado(int b) {
		super(b);  //chama o construtor da superclasse (Quadrilatero), pois base é private.
	}

	public void getArea() {
		System.out.println("Area do Quadrado: " + CalcularArea());
	}
	
}
