package filas;

import java.util.Scanner;

public class FilaInt {
	
	private static class NO{
		public int dado;
		public NO prox;
	}
	
	private static NO ini;
	private static NO fim;
	
	public void INIT() {
		ini = null;
		fim = null;
	}
	
	public boolean IsEmpty() {
		return (ini == null && fim == null);
	}
	
	public void ENQUEUE(int item) {
		NO novo = new NO();
		novo.dado = item;
		novo.prox = null;
		if (IsEmpty())
			ini = novo;
		else 
			fim.prox = novo;
		fim = novo;
	}
	
	private static class Retorno{
		public int item;
		public boolean ok;
	}
	
	public Retorno DEQUEUE() {
		Retorno saida = new Retorno();
		if(!IsEmpty()) {
			saida.item = ini.dado;
			ini = ini.prox;
			if (ini == null) fim = null;
			saida.ok = true;
		}else
			saida.ok = false;
		return saida;
	}
	
	public Retorno FIRST() {
		Retorno primeiro = new Retorno();
		if(!IsEmpty()) {
			primeiro.item = ini.dado;
			primeiro.ok = true;
		}else
			primeiro.ok = false;
		return primeiro;
	}
	

	public static void main(String[] args) {
		
		FilaInt fila = new FilaInt();
		Retorno resultado = new Retorno();
		int item, opcao;
		Scanner entrada = new Scanner(System.in);
		
		fila.INIT();
		
		do {
			System.out.println("Digita valor inteiro para dado: ");
			item = entrada.nextInt();
			fila.ENQUEUE(item);
			System.out.println("Digite 0 para encerrar inserção de dados ");
			opcao = entrada.nextInt();
		}while (opcao !=0);
		
		resultado = fila.FIRST();
		if (resultado.ok)
			System.out.println("Execução do First: " + resultado.item);
		
		do {
			resultado = fila.DEQUEUE();
			if(resultado.ok)
				System.out.println("Dado retirado: "+ resultado.item);		
		} while (resultado.ok);
		entrada.close();
	}
}
