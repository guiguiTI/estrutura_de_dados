import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Lista objLista = new Lista();
		
		for(int i = 0 ; i < 100 ; i++) {
			objLista.Inserir(i);
		}
		
		
		System.out.print("Digite o numero a ser excluido: ");
		objLista.remover(leitor.nextInt());
		
		leitor.close();
		
		objLista.imprimir();
	}
	
}
