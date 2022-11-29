package Calculadora;

public class Principal {

	public static void main(String[] args) {
		// Definição das referências
		
		Calculos c1,
		            c2;
		c1 = new Calculos(2,3); //objeto
		c1.somar();
		
		c2 = new Calculos(0, 0);
		c2.setOp1(2);
		c2.setOp2(10);
		c2.somar();
		
		System.out.println(c2.getOp1() + " + " + c2.getOp2()+ " = " + c2.getResultado() );

	}

}
