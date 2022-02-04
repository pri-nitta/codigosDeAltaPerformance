package buscas;

import java.lang.reflect.Array;
import java.util.List;

public class BuscaSequencial {

	public static void main(String[] args) {
		
		BaseDeDados basededados[] = new BaseDeDados[3];
		
		basededados[1].nome = "Aline";
		basededados[1].ano = 2020;
		basededados[1].curso = "SI";
		basededados[1].RM = 1234;
		
		basededados[2].nome = "Amanda";
		basededados[2].ano = 2021;
		basededados[2].curso = "ADS";
		basededados[2].RM = 7412;
		
		basededados[3].nome = "Adriana";
		basededados[3].ano = 2019;
		basededados[3].curso = "SI";
		basededados[3].RM = 9638;
		
		basededados[4].nome = "Alice";
		basededados[4].ano = 2020;
		basededados[4].curso = "Comp";
		basededados[4].RM = 8529;
		
		int cont = 0;
		int encontrados[] = new int[3];
		for (int i = 0; i< basededados.length; i++) {
			if (basededados[i].curso == "SI") {
				encontrados[cont] = i;
				cont++;
			}
		}
		
		System.out.println("Posições onde chave foram encontradas: ");
		for(int i = 0; i < cont; i++)
			System.out.println(encontrados[i]);
		
		int x = 0;
		int RMproc = 1234;
		while (x < basededados.length &&(basededados[x].RM != RMproc))
			x++;
		int posicao = -1;
		if(x < basededados.length)
			posicao = x;
		if (posicao >= 0)
			System.out.println("chave encontrada na posição" + posicao);
		else
			System.out.println("chave não encontrada");
	}

}
