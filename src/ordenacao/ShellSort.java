package ordenacao;
import java.util.Scanner;
import java.util.Random;

public class ShellSort {
public static int N = 10; 

public static void main(String[] args)  {
	
	Scanner entrada = new Scanner(System.in);
	Random gerador = new Random();
	
	int i;

	int vetor[] = new int[N];
	System.out.println("Criando vetor com " + N + " elementos: ");
	for(i = 0; i<N; i++) 
		vetor[i] = (int)gerador.nextInt()/10000;
		
		
	System.out.println("Ordenando o vetor criado...");
	int cont1, cont2, cont3, dist, elem, n_incre=2; 
	int incre[] = new int[2];
	incre[0] = 3;
	incre[1] = 1;
	
	for(cont1 = 0; cont1<n_incre; cont1++)   { 
		dist = incre[cont1];  
		for(cont2 = dist; cont2<N; cont2++)   {     
			elem = vetor[cont2];   
			for(cont3 = cont2-dist;(cont3>= 0) && (elem<vetor[cont3]); cont3 = cont3 - dist) {    
				vetor[cont3+dist] = vetor[cont3];    
				}   
			vetor[cont3+dist] = elem;   
			}  
		}		
	for(i = 0; i<N; i++) 
		System.out.println(i +"	"+vetor[i]);
	entrada.close();
	}
}
