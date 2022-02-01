class No {
	public int dado;
	public No prox;


public static void main(String[] args) {
		
		No aux;
		No lista = null;
		System.out.println("valor ponteiro lista =" + lista);
		
		No novo1 = new No();
		novo1.dado = 2;
		novo1.prox = lista;
		lista = novo1;
		
		No novo2 = new No();
		novo2.dado = 7;
		novo2.prox = null;
		lista.prox = novo2;
		
		No novo3 = new No();
		novo3.dado = 5;
		novo3.prox = lista;
		lista = novo3;
		
		aux = lista;
		lista = aux.prox;
	}
}


