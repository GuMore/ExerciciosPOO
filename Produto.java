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
	
	
	void opini�o() { 
	    System.out.println("O cliente gostou do produto ");
}
    void opni�o2() {
    	System.out.println("O cliente n�o gostou do produto");
    }
    
}