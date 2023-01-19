package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
	private int altura,base;
	
	public Triangulo(int b, int a) {
		base = b;
		altura = a;
	}

	@Override
	public float CalcularArea() {
		float area = (base * altura) /2;
		return area;
	}
	
	@Override
	public float CalcularPerimetro() {
		float perimetro = 3*base;
		return perimetro;
	}

}
