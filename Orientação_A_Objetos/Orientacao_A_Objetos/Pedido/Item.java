package Pedido;

public class Item {
	int qtd,desconto;
	float subtotal;
	Produto produto;
	// metodo construtor
	public Item(int qtd){
		
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int q) {
		this.qtd = q;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subt) {
		this.subtotal = subt;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto prod) {
		this.produto = prod;
	}
	
	
	
	

}
