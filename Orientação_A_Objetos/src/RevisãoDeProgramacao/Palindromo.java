package RevisãoDeProgramacao;
import java.util.Arrays;
import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args){
		String frase,invertido;
		System.out.println("Digite uma frase: ");
		Scanner sc = new Scanner(System.in);
		frase = sc.nextLine();
		frase.split(frase);
		String[] separado = frase.replaceAll(" ","").toUpperCase().split(";"); 	// retira os espaços e separa a String
		invertido = new StringBuilder(frase).reverse().toString();   // inverte a String
		String[] invert = invertido.replaceAll(" ","").toUpperCase().split(";");
		if (Arrays.equals(invert,separado)){  //compara os arrays
			System.out.println("Eh um palindromo.");
		}else {
			System.out.println("Nao eh um palindromo");
		}
		System.out.println(Arrays.toString(separado));
		System.out.println(Arrays.toString(invert));
		}
}
