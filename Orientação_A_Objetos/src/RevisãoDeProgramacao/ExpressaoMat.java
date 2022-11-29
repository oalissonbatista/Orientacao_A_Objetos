package RevisãoDeProgramacao;
import javax.swing.JOptionPane;

public class ExpressaoMat {
	public static void main(String[] args) {
		String strA = JOptionPane.showInputDialog("Digite o valor de (a): ");
		float a = Float.parseFloat(strA);
		String strB = JOptionPane.showInputDialog("Digite o valor de (b): ");
		float b = Float.parseFloat(strB);
		String strC = JOptionPane.showInputDialog("Digite o valor de (c): ");
		float c = Float.parseFloat(strC);
		boolean expressao = (a*a == ((b*b) + (c*c)));
		
		JOptionPane.showMessageDialog(null, "A expressao é = " + expressao);
	
	}
}
