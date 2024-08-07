
public class No {
	//Propriedades da classe
	private int Numero = 0;
	private No Proximo = null;
	
	
	public No() {
		super();
	}
	
	
	public No(int numero, No proximo) {
		super();
		Numero = numero;
		Proximo = proximo;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public No getProximo() {
		return Proximo;
	}

	public void setProximo(No proximo) {
		Proximo = proximo;
	}

	
	
	
	
	
}
