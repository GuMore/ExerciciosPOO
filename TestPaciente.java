package ExePOO1211;

public class TestPaciente {

	public static void main(String[] args) {
		
		
		Paciente P1 = new Paciente();
		Paciente P2 = new Paciente();
		Paciente P3 = new Paciente();
		
		P1.setNome("Renato dos Santos");
		P1.setIdade(28);
		P1.setCondi��o("Dor nos joelhos");
		
		P2.setNome("Nicolas Calixto");
		P2.setIdade(37);
		P2.setCondi��o("Gripe forte");
		
		P3.setNome("Ana Claudia");
		P3.setIdade(22);
		P3.setCondi��o("Bra�o Quebrado ");
		
		System.out.println("O nome do/a paciente �: " + P1.getNome());
		System.out.println("A idade do/a paciente � de: " + P1.getIdade());
        System.out.println("A condi��o do paciente �: " + P1.getCondi��o()); 
        P1.obrigado(); 
        
        System.out.println("\nO nome do/a paciente �: " + P2.getNome());
		System.out.println("A idade do/a paciente � de: " + P2.getIdade());
        System.out.println("A condi��o do paciente �: " + P2.getCondi��o()); 
        P2.obrigado(); 
        
        System.out.println("\nO nome do/a paciente �: " + P3.getNome());
		System.out.println("A idade do/a paciente � de: " + P3.getIdade());
        System.out.println("A condi��o do paciente �: " + P3.getCondi��o()); 
        P3.obrigado(); 
        
	}

}
