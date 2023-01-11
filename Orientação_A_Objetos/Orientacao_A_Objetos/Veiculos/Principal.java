package Veiculos;

public class Principal {
	public static void main(String[] args) {   
		
		
		Carro v = new Carro();
		v.anoMarca = 2019;
		v.anoVeiculo = 2020;
		v.marca = "Chevrolet";
		v.modelo = "Golf";
		
		System.out.println(v.imprimir());
		
		Carro c = new Carro();
		c.setNumOcupantes(5);
		
		
		Caminhao bau = new Caminhao();
		bau.anoMarca = 2012;
		bau.anoVeiculo = 2013;
		bau.marca = "Volvo";
		bau.modelo = "Volvo 5607";
		bau.capacidadeCarga = 1200;
		bau.bau = true;
		
		System.out.println(bau.imprimir());
	}

}
