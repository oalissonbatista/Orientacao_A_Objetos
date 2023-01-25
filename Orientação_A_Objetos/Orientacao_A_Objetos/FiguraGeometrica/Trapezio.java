package FiguraGeometrica;

public class Trapezio extends Quadrilatero {
	private int baseMaior,altura;
	
	public Trapezio (int b, int  bM, int a) {
		super(b);
		baseMaior =bM;
		altura = a;
	}
	@Override
	public float CalcularArea() {
		float area = ((super.getBase()+ baseMaior) * altura) * 1/2;
		return area;
		// TODO Auto-generated method stub
		
	}
	//@Override
	//public float CalcularPerimetro() {
	//	float peri
		//return perimetro;
		// TODO Auto-generated method stub
		
	//}


}
