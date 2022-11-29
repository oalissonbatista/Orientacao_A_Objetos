package Calculadora;

public class Classes {
	public static void main (String[] args) {
		class Veiculo{
			String marca,modelo,cor;
			int capacidadeCarga;
			float velocidade;
		}
		
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		v1.marca ="ferrari";
		System.out.println(v1.cor);
		
	}
}
