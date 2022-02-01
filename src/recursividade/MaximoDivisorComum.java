package recursividade;

public class MaximoDivisorComum {
	
	public static int mdc(int n, int m) {
		if (n > m)
			return(mdc(m,n));
		else {
			if (n == 0)
				return (m);
			else
				return(mdc(n, m%n));
		}
		
	}

	public static void main(String[] args) {
		int x = mdc(8,4);
		System.out.println("MDC entre 8 e 4 = " +x);

	}

}
