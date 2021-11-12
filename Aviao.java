package ExePOO1211;

//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Aviao {  
	
	private int numPessoas;
	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCargaSup() {
		return cargaSup;
	}

	public void setCargaSup(double cargaSup) {
		this.cargaSup = cargaSup;
	}


	private String tipo;
	private double cargaSup;


    void aviao() { 
    	System.out.println("\nO avião está proximo ao seu destino final... ");    	   
    	
    }
}
