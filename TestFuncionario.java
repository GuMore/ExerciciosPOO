package ExePOO1211;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionarioA = new Funcionario();
		Funcionario funcionarioB = new Funcionario();
		Funcionario funcionarioC = new Funcionario(); 
		
		funcionarioA.setCargo("Pintor");
		funcionarioA.setSalario(1600.00);
		funcionarioA.setDiasTrab(60); 
		
		funcionarioB.setCargo("Administrador");
		funcionarioB.setSalario(2100.00);
		funcionarioB.setDiasTrab(90); 
		
		funcionarioC.setCargo("Gerente");
		funcionarioC.setSalario(4200.00);
		funcionarioC.setDiasTrab(120);
		
		System.out.println("A fun��o executada dentro da empresa � de: " + funcionarioA.getCargo());
		System.out.println("O salario do funcionario � de: " + funcionarioA.getSalario());
		System.out.println("Os dias trabalhados do funcionario s�o: " + funcionarioA.getDiasTrab());
		funcionarioA.TrabalhouBem();
		
		System.out.println("\nA fun��o executada dentro da empresa � de: " + funcionarioB.getCargo());
		System.out.println("O salario do funcionario � de: " + funcionarioB.getSalario());
		System.out.println("Os dias trabalhados do funcionario s�o: " + funcionarioB.getDiasTrab());
        funcionarioB.TrabalhouMau();
		
		System.out.println("\nA fun��o executada dentro da empresa � de: " + funcionarioC.getCargo());
		System.out.println("O salario do funcionario � de: " + funcionarioC.getSalario());
		System.out.println("Os dias trabalhados do funcionario s�o: " + funcionarioC.getDiasTrab());
        funcionarioC.TrabalhouBem();        

	}

}
