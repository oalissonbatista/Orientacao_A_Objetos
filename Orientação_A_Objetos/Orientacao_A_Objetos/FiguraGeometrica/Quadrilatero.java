package FiguraGeometrica;

public class Quadrilatero extends FiguraGeometrica {
	private int base;
	
	public Quadrilatero() {
		
	}

	public Quadrilatero(int b) {
		this();
		base = b;
	}

	@Override
	public float CalcularArea() {
		float area = base * base;
		return area;
		// TODO Auto-generated method stub
		
	}
	@Override
	public float CalcularPerimetro() {
		float perimetro = 4*base;
		return perimetro;
		// TODO Auto-generated method stub
		
	}

	public int getBase() {
		return base;
	}


}
