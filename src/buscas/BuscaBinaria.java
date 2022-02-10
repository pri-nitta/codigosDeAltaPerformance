package buscas;

import java.util.Scanner;
import java.util.Random;

public class BuscaBinaria {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		int N = 100;
		int i;

		/* cria a estrutura de dados (vetor) com N elementos */
		int basededados[] = new int[N];
		System.out.println("Criando vetor com 100 elementos: ");
		for (i = 0; i < N; i++)
			basededados[i] = (int) gerador.nextInt() / 1000;

		System.out.println("Ordenando o vetor criado...");
		boolean troca = true;
		for (i = 0; i < N - 1 && troca == true; i++) {
			int aux;
			troca = false;
			for (int j = 0; j < N - i - 1; j++) {
				if (basededados[j] > basededados[j + 1]) {
					aux = basededados[j];
					basededados[j] = basededados[j + 1];
					basededados[j + 1] = aux;
					troca = true;
				}
			}
		}

		for (i = 0; i < N; i++)
			System.out.println(i + "\t" + basededados[i]);

		System.out.println("Digite chave procurada: ");
		int chaveproc = entrada.nextInt();

		/* Pesquisa na estrutura de dados o valor solicitado */
		System.out.println("Procurando o chave solicitada...");
		int i_baixo = 0;
		int i_medio = 0;
		int i_alto = N - 1;
		int achou = 0;
		int posicao = -1;
		while (achou != 1 && i_baixo <= i_alto) {
			i_medio = (i_baixo + i_alto) / 2;
			if (chaveproc == basededados[i_medio]) {
				posicao = i_medio;
				achou = 1;
			} else {
				if (chaveproc < basededados[i_medio])
					i_alto = i_medio - 1;
				else
					i_baixo = i_medio + 1;
			}
		}
		if (posicao == -1)
			System.out.println("Chave não encontrada");
		else
			System.out.println("Chave encontrada posicao " + posicao);
		entrada.close();
	}
}