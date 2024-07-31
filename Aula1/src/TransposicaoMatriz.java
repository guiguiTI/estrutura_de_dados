import java.util.Iterator;
import java.util.Scanner;

public class TransposicaoMatriz {
	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int[][] matrizOriginal = new int [2][3];
		int[][] matrizTransposta = new int [3][2];
		
		//Entrada de dados
		
		for(int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
				System.out.print("matrizOriginal [" + i + " , " + j + "] = ");
				matrizOriginal[i][j] = leitor.nextInt();
				
			}
		}
		leitor.close();
		
		
		// Processamento
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
				matrizTransposta[j][i] = matrizOriginal [i][j];
				
			}
		}
		
		//Saída de dados
		System.out.println("===== Matriz Original ======");
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
				System.out.print(matrizOriginal[i][j] + "\t");
				
			}
			System.out.println();
			
		}
	}
}
