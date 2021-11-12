package ExePOO1211;

public class Patinete { 
	
	private String tipo;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	private String modalidade;
	private double preço; 
	
	
	void TemQualidade() { 
	System.out.println("O produto é de qualidade. Faça bom proveito!!! ");	
	}
    void SemQualidade() {
    System.out.println("O produto não é de qualidade.");	
    	
    }
}
