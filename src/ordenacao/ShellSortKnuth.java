package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class ShellSortKnuth {

public static int N = 10; 

public static int Knuth(int param) { 
	if(param == 1)         
		return(1);  
	else
		return(3*Knuth(param-1)+1);  
	}
	
public static void main(String[] args)  {
		
	Scanner entrada = new Scanner(System.in);
	Random gerador = new Random();
	int i;

	int vetor[] = new int[N];
	System.out.println("Criando vetor com"+N+" elementos: ");
	for(i = 0; i<N; i++) 
		vetor[i] = (int)gerador.nextInt()/10000;
		
	int limite = 1; 
	int cont; 
	while (Knuth(limite) <N) {             
		limite++;             
		}       
	limite = limite - 2;
	
	if (limite< 1)  {  
		limite = 1;  
		} 
	int incre[] = new int[limite+1];
	incre[limite] = 1; 
	for(cont = 0; cont<limite; cont++)  {  
		incre[cont] = Knuth(limite - cont + 1);  
		} 
	limite++; 	
	
	System.out.println("Ordenando o vetor criado...");
	int cont1, cont2, cont3, dist, elem; 
	
	for(cont1 = 0; cont1<limite; cont1++)   { 
		dist = incre[cont1];
		for(cont2 = dist; cont2<N; cont2++){     
			elem = vetor[cont2];   
			for(cont3 = cont2-dist;(cont3>= 0) && (elem<vetor[cont3]); 	cont3 = cont3 - dist)   
				vetor[cont3+dist] = vetor[cont3];    
				
				vetor[cont3+dist] = elem;   
			}  
		}
	
	for(i = 0; i<N; i++) 
		System.out.println(i +"	"+vetor[i]);
	entrada.close();
	}
}
