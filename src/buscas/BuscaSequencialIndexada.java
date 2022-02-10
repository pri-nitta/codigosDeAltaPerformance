package buscas;

import java.util.Scanner;
import java.util.Random;

public class BuscaSequencialIndexada {

	public static void main(String[] args)  {
			
			Scanner entrada = new Scanner(System.in);
			Random gerador = new Random();
			int N = 100;
			int i;

		/*cria a estrutura de dados (vetor) com N elementos*/
			int basededados[] = new int[N];
			System.out.println("Criando vetor com 100 elementos: ");
			for(i = 0; i <N; i++) 
				basededados[i] = (int)gerador.nextInt()/1000;
				
				
			System.out.println("Ordenando o vetor criado...");
			boolean troca= true; 
			for (i=0;i<N-1 && troca==true; i++){
				int aux;
				troca= false; 
				for (int j=0;j<N-i-1;j++){
					if (basededados[j]>basededados[j+1]){
						aux=basededados[j];
						basededados[j]=basededados[j+1];
						basededados[j+1]=aux;
						troca=true; 
						}
				}
			}
			
			for(i = 0; i <N; i++) 
				System.out.println(i +"\t"+basededados[i]);
		
	/*gera tabela de índice especificando o tamanho do sub-conjunto*/	
		int n,j;
		System.out.println("Digite tamanho de cada sub-conjunto ");
		int Tamanho_Subconj = entrada.nextInt();
			
		j=Tamanho_Subconj; 
	/*j é o valor do índice armazenado em k_indice sendo, Tamanho_Subconj é o numero de registros que cada subconjunto tem*/

		n= N/Tamanho_Subconj; 
	/*n guarda o número de linhas na tabela índice*/
			
		int k_indice[] = new int[100]; 
	//guarda o valor da chave do início do conjunto
		
	    int p_indice[] = new int[100]; 
	//guarda o índice do início do conjunto

		for (i=0;i<n;i++) {
			k_indice[i]=basededados[j-1];
			p_indice[i]=j-1;
			j+=Tamanho_Subconj;
			}

		System.out.println("Digite chave procurada: ");
		int chaveproc = entrada.nextInt();
			
	/*Procura na tabela de índice o conjunto onde pode estar a chave procurada*/
			System.out.println("Tabela de Índices: " );
			System.out.println("\t p \t k");
			for (i=0;i<n;i++) 
				System.out.println("\t"+p_indice[i]+ "\t" + k_indice[i]);

						
	/*Procura na tabela de índice o conjunto onde pode estar a chave procurada*/
			int low,hi;
			for (i=0; i<n && k_indice[i] < chaveproc; i++);
			if (k_indice[i] != chaveproc) {
				if (i==0)
					low=0;
				else
					low=p_indice[i-1];
				if (i==n)
					hi= qtd-1;
				else
					hi=p_indice[i];
			/*Procura na base de dados no intervalo do conjunto 
			onde pode estar a chave procurada*/

				for (j=low; j<hi && basededados[j] != chaveproc; j++) ;
				if (j< hi)
	  				System.out.println(" chave encontrada na posição " + j);
				else
					System.out.println(" chave não foi encontrada " );
	}
				
			else {
				System.out.println(" chave encontrada na posição " + p_indice[i]);
			}
		entrada.close();
		}

}
