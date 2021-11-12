package ExePOO1211;

public class Paciente {
	
	private String nome;
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCondição() {
		return condição;
	}


	public void setCondição(String condição) {
		this.condição = condição;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	private String condição;
	private int idade;
	
	
	void obrigado() {
		System.out.println("Siga as minhas recomendações e volte em breve! ");
	}

}
