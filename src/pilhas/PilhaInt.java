package pilhas;

import java.util.Scanner;

public class PilhaInt {
	
	private static class NO{
		public int dado;
		public NO prox;
	}
	
	private static NO topo;
	
	public void INIT() {
		topo = null;
	}
	
	public boolean IsEmpty() {
		return topo == null;
	}
	
	public void PUSH (int item) {
		NO novo = new NO();
		novo.dado = item;
		novo.prox = topo;
		topo = novo;
	}
	
	private static class Retorno{
		public int item;
		public boolean ok;
	}
	
	public Retorno TOP() {
		Retorno saida = new Retorno();
		if(!IsEmpty()) {
			saida.item = topo.dado;
			saida.ok = true;
		}else
			saida.ok = false;
		return saida;
	}
	
	public Retorno POP() {
		Retorno saida = new Retorno();
		if(!IsEmpty()) {
			saida.item = topo.dado;
			topo = topo.prox;
			saida.ok = true;
		}else
			saida.ok = false;
		return saida;
	}
	
	public static void main(String[] args) {
		
		
		PilhaInt s = new PilhaInt();
		Retorno resultado = new Retorno();
		
		int item;
		int opcao;
		
		s.INIT();
		
		Scanner entrada = new Scanner(System.in);
		resultado = s.TOP();
		if (resultado.ok)
			System.out.println("Execução do TOP: "+ resultado.item);
		else
			System.out.println("Execução do TOP: pilha Vazia" );
		
		do {
			System.out.println("Digite valor inteiro para inserir na pilha: ");
			item = entrada.nextInt();
			s.PUSH(item);
			System.out.println("Digite 0 para encerrar empilhamento de dados ");
			opcao= entrada.nextInt();
		} while (opcao !=0);
		
		
		resultado = s.TOP();
		if(resultado.ok)
			System.out.println("Execução do TOP: " +resultado.item);
		
		do {
			resultado = s.POP();
			if(resultado.ok)
				System.out.println("Dado retirado: "+ resultado.item);
		}while (resultado.ok);
	}

}
