package ExePOO1211;

public class TestPaciente {

	public static void main(String[] args) {
		
		
		Paciente P1 = new Paciente();
		Paciente P2 = new Paciente();
		Paciente P3 = new Paciente();
		
		P1.setNome("Renato dos Santos");
		P1.setIdade(28);
		P1.setCondição("Dor nos joelhos");
		
		P2.setNome("Nicolas Calixto");
		P2.setIdade(37);
		P2.setCondição("Gripe forte");
		
		P3.setNome("Ana Claudia");
		P3.setIdade(22);
		P3.setCondição("Braço Quebrado ");
		
		System.out.println("O nome do/a paciente é: " + P1.getNome());
		System.out.println("A idade do/a paciente é de: " + P1.getIdade());
        System.out.println("A condição do paciente é: " + P1.getCondição()); 
        P1.obrigado(); 
        
        System.out.println("\nO nome do/a paciente é: " + P2.getNome());
		System.out.println("A idade do/a paciente é de: " + P2.getIdade());
        System.out.println("A condição do paciente é: " + P2.getCondição()); 
        P2.obrigado(); 
        
        System.out.println("\nO nome do/a paciente é: " + P3.getNome());
		System.out.println("A idade do/a paciente é de: " + P3.getIdade());
        System.out.println("A condição do paciente é: " + P3.getCondição()); 
        P3.obrigado(); 
        
	}

}
