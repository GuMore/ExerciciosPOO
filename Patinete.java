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
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	private String modalidade;
	private double pre�o; 
	
	
	void TemQualidade() { 
	System.out.println("O produto � de qualidade. Fa�a bom proveito!!! ");	
	}
    void SemQualidade() {
    System.out.println("O produto n�o � de qualidade.");	
    	
    }
}
