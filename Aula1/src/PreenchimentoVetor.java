import java.util.Scanner;

public class PreenchimentoVetor {
	public static void main(String[] args) {
		
		// Declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		int[] vetor = new int [10];
		
		
		// Entrada de dados
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("Digite o valor da posição " + i + " : " );
			vetor [i] = leitor.nextInt();
			
		}
		
		leitor.close();
		
		
		
		// Saída de dados
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("vetor [" + i + "]  = " + vetor [i]);
		}
	}
}
