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
		
		System.out.println("A função executada dentro da empresa é de: " + funcionarioA.getCargo());
		System.out.println("O salario do funcionario é de: " + funcionarioA.getSalario());
		System.out.println("Os dias trabalhados do funcionario são: " + funcionarioA.getDiasTrab());
		funcionarioA.TrabalhouBem();
		
		System.out.println("\nA função executada dentro da empresa é de: " + funcionarioB.getCargo());
		System.out.println("O salario do funcionario é de: " + funcionarioB.getSalario());
		System.out.println("Os dias trabalhados do funcionario são: " + funcionarioB.getDiasTrab());
        funcionarioB.TrabalhouMau();
		
		System.out.println("\nA função executada dentro da empresa é de: " + funcionarioC.getCargo());
		System.out.println("O salario do funcionario é de: " + funcionarioC.getSalario());
		System.out.println("Os dias trabalhados do funcionario são: " + funcionarioC.getDiasTrab());
        funcionarioC.TrabalhouBem();        

	}

}
