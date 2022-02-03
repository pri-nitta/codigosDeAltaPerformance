package arvoresBinarias;

public class BinaryTree {
	
	private static class ARVORE{
		  public int dado;
		  public ARVORE dir;
		  public ARVORE esq;
		  }
	
	public static ARVORE init()  {
		return null;
	}
	
	private static ARVORE inserir(ARVORE p, int info) {
		if (p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}
		else if (info < p.dado) 
				p.esq= inserir (p.esq, info);
			else
				p.dir=inserir(p.dir, info);	
		return p;
		}
	
	private static ARVORE remove_valor (ARVORE p, int info) {
		if (p!=null){
			if(info == p.dado){
				if (p.esq == null && p.dir==null)
					return null;
				if (p.esq==null)
					return  p.dir;		
				else{
					if (p.dir==null)	
	 					return p.esq; 	     
					else {
						ARVORE aux, ref;
						ref = p.dir;
						aux = p.dir;
						while (aux.esq != null)
							aux = aux.esq;
						aux.esq = p.esq;
						return ref;
						}
					}
				}
			else{		
				if(info < p.dado)
					p.esq = remove_valor(p.esq,info);
				else
					p.dir = remove_valor(p.dir,info);
				}
			}
		return p;
	}
	

	public static void main(String[] args) {
		

	}

}
