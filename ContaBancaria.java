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
	
	void condição() { 
		System.out.println("Você está no vermelho...");
	}
    void condição2() {
    	System.out.println("Você está com as contas em dia! ");
    }
}
