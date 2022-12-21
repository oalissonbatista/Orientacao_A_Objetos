package Pedido;

import java.util.Scanner;

public class Produto {

	String descricao;
	float valorUnitario;
	
	public Produto(String descricao,float valorUnitario) {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String desc) {
		this.descricao = desc;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float vU) {
		this.valorUnitario = vU;
	}
	
}
