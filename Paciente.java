package ExePOO1211;

public class Paciente {
	
	private String nome;
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCondi��o() {
		return condi��o;
	}


	public void setCondi��o(String condi��o) {
		this.condi��o = condi��o;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	private String condi��o;
	private int idade;
	
	
	void obrigado() {
		System.out.println("Siga as minhas recomenda��es e volte em breve! ");
	}

}
