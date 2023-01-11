package Veiculos;

public class Caminhao extends Veiculo {
	
	protected int capacidadeCarga;
	protected boolean bau;
	
	
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public boolean isBau() {
		return bau;
	}
	public void setBau(boolean bau) {
		this.bau = bau;
	}
	
	public String imprimir() {
		String resposta = "";
		resposta += "Ano Marca: " + anoMarca + "\n";
		resposta += "Ano Veiculo: " + anoVeiculo + "\n";
		resposta += "Marca: " + marca + "\n";
		resposta += "Modelo : " + modelo + "\n";
		resposta += "Capacidade de Carga : " + capacidadeCarga + "\n";
		resposta += "Tem bau? : " + bau + "\n";
		return resposta;
		
	}
	

}
