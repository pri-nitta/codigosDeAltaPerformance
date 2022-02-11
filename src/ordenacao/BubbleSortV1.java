package ordenacao;

import java.util.Scanner;

public class BubbleSortV1 {

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

		System.out.println("Ordenando o vetor com Bubblesort");
		for (i = 0; i < N - 1; i++) {
			int aux;
			for (int j = 0; j < N - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		for (i = 0; i < N; i++)
			System.out.println(i + "	" + vetor[i]);
		entrada.close();
	}
}
