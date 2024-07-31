import java.util.Scanner;

public class InversaoVetor {
	public static void main(String[] args) {
		
		//Declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		int [] vetorOriginal = new int [5];
		int [] vetorInvertido = new int [5];
		
		//Entrada de dados
		
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			System.out.print("vetorOriginal [" + i + " ] = ");
			vetorOriginal [i] = leitor.nextInt();
			
		}
		
		leitor.close();
		
		
		// Processamento
		
		for (int i = 0 ; i < vetorOriginal.length ; i++ ) {
			vetorInvertido [vetorOriginal.length - 1 - i] = vetorOriginal [i];
			
		}
		
		// Saída de dados
		for( int i = 0 ; i < vetorInvertido.length ; i++ ) {
			System.out.println("vetorInvertido[" + i + " ] = " + vetorInvertido[i]);
		}
	}
	
}
