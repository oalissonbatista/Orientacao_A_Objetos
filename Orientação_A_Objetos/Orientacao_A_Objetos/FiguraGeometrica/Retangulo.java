package FiguraGeometrica;

public class Retangulo extends Quadrilatero {
	private int altura;
	
	public Retangulo(int b, int a) {
		super(b);
		altura = a;
		
	}
	@Override
	public float CalcularArea() {
		float area = altura * getBase();
		return area;
	}
	@Override
	public float CalcularPerimetro() {
		float perimetro = 2*getBase() + 2*altura;
		return perimetro;
		// TODO Auto-generated method stub
		
	}
	
	

}
