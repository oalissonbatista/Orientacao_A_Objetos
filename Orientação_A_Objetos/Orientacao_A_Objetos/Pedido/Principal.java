package Pedido;

public class Principal {

	private static Pedido pedido1;

	public static void main(String[] args) {
		pedido1 = new Pedido(3, 2);
		pedido1.setCliente("Alisson");
		pedido1.setData("21/03/2002");
		
		pedido1.Status();
		
	}

}
