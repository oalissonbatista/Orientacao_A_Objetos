package FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
	protected double raio;
	protected float pi = (float) 3.14;
	
	System.out.println();
	
	public Circulo (double r) {
		raio = r;
	}
	
	@Override
	public float CalcularArea() {
		float area = (float) (2 * pi * (Math.pow(raio,2)));
		return area;
	}
	@Override
	public float CalcularPerimetro() {
		float perimetro = (float) (pi * Math.pow(raio,2));
		return perimetro;
	}
	
}


