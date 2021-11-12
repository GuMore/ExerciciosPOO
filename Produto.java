package ExePOO1211;

public class Produto {
	
	private String tipo;
	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getDataVal() {
		return dataVal;
	}
	public void setDataVal(String string) {
		this.dataVal = string;
	}
	private String fabricante;
	private String dataVal; 
	
	
	void opinião() { 
	    System.out.println("O cliente gostou do produto ");
}
    void opnião2() {
    	System.out.println("O cliente não gostou do produto");
    }
    
}