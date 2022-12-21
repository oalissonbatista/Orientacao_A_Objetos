package Pedido;

import java.util.Scanner;

public class Pedido {
	Scanner sc = new Scanner(System.in);
	
	private int numeroPedido;
	private String data,cliente;
	private float total;
	private Item camisetas,bermudas;
	
	public Pedido(int cam, int ber) {
		camisetas = new Item(cam);
		bermudas = new Item(ber);
	}
	
	public void Status() {
		System.out.println("Data: " + this.data + "\nCliente: " 
	                       + this.cliente + "\nTotal: " + this.total + "\nNumero do pedido: " + this.numeroPedido);
	}
	public void setData(String d) {
		this.data = d;
	}
	public String getData() {
		return this.data;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cli) {
		this.cliente = cli;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float t) {
		this.total = t;
	}

}
