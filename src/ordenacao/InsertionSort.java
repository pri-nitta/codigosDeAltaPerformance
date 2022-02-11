package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
	public static int N = 10;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();

		int i;

		int vetor[] = new int[N];
		System.out.println("Criando vetor com " + N + " elementos:");
		for (i = 0; i < N; i++)
			vetor[i] = (int) gerador.nextInt() / 10000;

		System.out.println("Ordenando o vetor criado...");
		int eleito = 0, j;
		for (i = 1; i < N; i++) {
			eleito = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > eleito) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = eleito;
		}

		for (i = 0; i < N; i++)
			System.out.println(i + "	" + vetor[i]);
		entrada.close();
	}
}