package RevisãoDeProgramacao;
import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as dimensoes da Matriz M1: ");
		System.out.print("Colunas: ");
		int M  = sc.nextInt();
		System.out.print("Linhas: ");
		int N = sc.nextInt();
		System.out.println("Digite as dimensoes da Matriz M2: ");
		System.out.print("Colunas: ");
		int O = sc.nextInt();
		System.out.print("Linhas: ");
		int P = sc.nextInt();
		
		int M1[][] = new int[N][M];
		int M2[][]= new int [P][O];	
		
		System.out.println(M1.length);
		
		for (int c=0; c < M ; c++){
			for (int l = 0; l < N ; l++) {
			System.out.print("Digite os valores da Matriz M1(preenchida por linhas): ");
			int valorM1 = sc.nextInt();
			M1[l][c] = valorM1;
			}	
		}
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < O; i++) {
			for (int j = 0 ; j < P ; j++ ) {
				System.out.print("Digite os valores da matriz M2 (preenchida por linhas): ");
				int valorM2 = sc.nextInt();
				M2[j][i] = valorM2;			
			}		
		}
		for (int c=0; c < M ; c++){
			for (int l = 0; l < N ; l++) {      
			System.out.print(M1[l][c]+ " ");
			}
		}
		System.out.println("");
		for (int i = 0; i < O; i++) {
			for (int j = 0 ; j < P ; j++ ) {
				System.out.print(M2[j][i] + " ");			
			}		
		}
		System.out.println("");
		//System.out.println(Arrays.deepToString(M1));
		//System.out.println(Arrays.deepToString(M2));
		if (M == P){                             
			int M3 [][] = new int [P][M];
			for (int i = 0; i < N; i++) {          //Varre linha da Matriz 1
				for(int j = 0; j < O; j++) {       //Varre coluna da Matriz 2
					for (int k = 0; k < P; k++) {  // Varre Linha da Matriz 2
						M3[i][j] += M1[i][k] * M2[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(M3));			
		}else {
			System.out.print("Nao é possivel multiplicar");
		}
		if (N == O){                             
			int M4[][] = new int [N][O];
			for (int i = 0; i < N; i++) {          //Varre linha da Matriz 1
				for(int j = 0; j < O; j++) {       //Varre coluna da Matriz 2
					for (int k = 0; k < P; k++) {  // Varre Linha da Matriz 2
						M4[i][j] += M1[i][k] * M2[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(M4));			
		}else {
			System.out.print("Nao é possivel multiplicar");
		}
		
	 }   
}