package ExePOO1211;

public class ContaBancaria {
	
	private int numerCont;
	public int getNumerCont() {
		return numerCont;
	}
	public void setNumerCont(int numerCont) {
		this.numerCont = numerCont;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private String nomeDono;
	private double saldo;  
	
	void condi��o() { 
		System.out.println("Voc� est� no vermelho...");
	}
    void condi��o2() {
    	System.out.println("Voc� est� com as contas em dia! ");
    }
}
