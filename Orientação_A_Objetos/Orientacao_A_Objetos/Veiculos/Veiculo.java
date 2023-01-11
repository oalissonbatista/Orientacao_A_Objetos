package Veiculos;

public abstract class Veiculo {     // Classe abstrata não instancia um objeto
	int anoMarca,anoVeiculo;
	String marca,modelo;
	private boolean ligado;
	public int velocidade;
	
	public boolean ligarDesligar() {
		if (!ligado) {
			ligado = true;
		}
		else {
			ligado = false;
		}
		return ligado;
	}
	
	public int acelerar() {
		velocidade ++;
		return velocidade;
	}
	
	public float frear() {
		if(velocidade != 0) {
			velocidade--;
		}
		return velocidade;
	}
	
	public String imprimir() {
		String resposta = "";
		resposta += "Ano Marca: " + anoMarca + "\n";
		resposta += "Ano Veiculo: " + anoVeiculo + "\n";
		resposta += "Marca: " + marca + "\n";
		resposta += "Modelo : " + modelo + "\n";
		return resposta;
		
	}

}
