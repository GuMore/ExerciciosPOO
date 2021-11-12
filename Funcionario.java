package ExePOO1211;

public class Funcionario {
	
	private String cargo;
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getDiasTrab() {
		return diasTrab;
	}
	public void setDiasTrab(int diasTrab) {
		this.diasTrab = diasTrab;
	}
	private double salario;
	private int diasTrab; 
	
	void TrabalhouBem() {
	System.out.println("Parabéns vocé é um exelente funcionario!!! ");	
	}
	
	void TrabalhouMau() {
		System.out.println("Você não concretizou as tarefas que lhe foram propostas. ");
}
}
