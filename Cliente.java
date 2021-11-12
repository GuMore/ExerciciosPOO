package ExePOO1211;

//Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente,
// defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Cliente {
	
	

	//atributos-->variaveis
	private String nome;
	private String corpref;  
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorpref() {
		return corpref;
	}
	public void setCorpref(String corpref) {
		this.corpref = corpref;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//
	void comprar() { 
		System.out.println("\nO/a cliente irá comprou o produto. ");
	}
    void preferencia() {
    	System.out.println("O/a cliente amou a COR!!! ");
    }
	}
    
