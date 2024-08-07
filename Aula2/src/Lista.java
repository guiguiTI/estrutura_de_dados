
public class Lista {
	//Propriedades da classe
	private No Cabeca = null;
	
	//Método da classe
	public void Inserir (int Numero) {
		//Cenário Fácil: Lista Vazia
		if(Cabeca == null) {
			Cabeca = new No(Numero, null);
			return;
		}
		//Cenário Difícil: Lista não está vazia
		No novoNo = new No(Numero, Cabeca);
		Cabeca = novoNo;
		
		
	}
	
	
	public void imprimir() {
		No ponteiro = Cabeca;
		
		while (ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
			
		}
	}
	
	public void remover(int Numero) {
		// Cenário muito fácil: lista vazia
		if (Cabeca == null) {
			return;
			
		}
		
		//Cenário meio fácil: excluir o primeiro 
		if(Cabeca.getNumero() == Numero) {
			Cabeca = Cabeca.getProximo();
			return;
		}
		
		//Cenário difícil: excluir um nó no meio
		No ponteiro = Cabeca;
		
		while((ponteiro.getProximo() != null ) &&
				(ponteiro.getProximo().getNumero() != Numero)) {
			ponteiro = ponteiro.getProximo();	
			
			}
		
		if (ponteiro.getProximo() != null) {
			ponteiro.setProximo(ponteiro.getProximo().getProximo());
			
		}
		}
	
	
	
}
