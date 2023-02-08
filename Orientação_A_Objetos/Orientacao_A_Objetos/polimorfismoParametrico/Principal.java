package polimorfismoParametrico;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Cadastro c = new Cadastro<Aluno>();
		Aluno a1 = new Aluno("Andre", 13); 
		Aluno a2 = new Aluno("Maria", 14);
		Aluno a3 = new Aluno("Joao", 15);
		Aluno a4 = new Aluno("Alisson", 16);
		
		c.adicionar(a1);
		c.adicionar(a2);
		c.adicionar(a3);
		c.adicionar(a4);
		
		JOptionPane.showMessageDialog(null, c.imprimirCadastro());
		
		c = new Cadastro<Mesa>();
		Mesa m1 = new Mesa(50, 50, 80, "Branca");
		Mesa m2 = new Mesa(70, 80, 80, "Preta");
		Mesa mesinha = new Mesa(50,20,30, "Azul");
		
		c.adicionar(m1);
		c.adicionar(m2);
		c.adicionar(mesinha);
		
		JOptionPane.showMessageDialog(null, c.imprimirCadastro());
	}
}

