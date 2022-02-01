package recursividade;

public class Fatorial {
	
	public static int fatorialFunc(int n) {
		if (n!= 0)
			return (n* fatorialFunc(n-1));
		else
			return (1);
	}

	public static void main(String[] args) {
		int fat;
		fat = fatorialFunc(4);
		System.out.println("Fatorial de 4 = " + fat);
	}
}
