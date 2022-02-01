package recursividade;

public class Somatorio {
	
	public static int soma (int n) {
		if (n != 0)
			return (n+ soma (n-1));
		else 
			return 0;
	}

	public static void main(String[] args) {
		int x =  soma(31);
		System.out.println("Somatório de 31 = " +x);

	}

}
