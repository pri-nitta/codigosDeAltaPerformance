package ordenacao;

import java.util.Scanner;

public class BubbleSort {
	public static int N = 8;

// define o tamanho do vetor a ser ordenado
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		/* gera vetor fora de ordem */
		int i;
		int vetor[] = new int[N];
		System.out.println("Digite " + N + " números inteiros: ");

		for (i = 0; i < N; i++)
			vetor[i] = entrada.nextInt();

		System.out.println("Ordenando o vetor com Bubblesort mais eficiente ");
		boolean troca = true; /* supõe realizar troca */
		for (i = 0; i < N - 1 && troca == true; i++) {
			int aux;
			troca = false; /* supõe não realizar troca */
			for (int j = 0; j < N - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					troca = true;
					/* registra que houve troca na iteração */
				}
			}
		}
		for (i = 0; i < N; i++)
			System.out.println(i + "	" + vetor[i]);
		entrada.close();
	}
}
