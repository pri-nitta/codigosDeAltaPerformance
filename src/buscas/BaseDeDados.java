package buscas;

public class BaseDeDados {
	
	String nome = "";
	int RM = 0;
	String curso = "";
	int ano = 0;
	
	public BaseDeDados(String nome, int rM, String curso, int ano) {
		super();
		this.nome = nome;
		RM = rM;
		this.curso = curso;
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRM() {
		return RM;
	}
	public void setRM(int rM) {
		RM = rM;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
			

}
