package ExePOO1211;

public class TestCliente {

	public static void main(String[] args) {
		
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente1.setNome("Sergio Moreira");
		cliente1.setIdade(54); 
		cliente1.setCorpref("Verde"); 
		
		cliente2.setNome("Sandra Regina");
		cliente2.setIdade(58);
		cliente2.setCorpref("Azul");
		
		cliente3.setNome("Cristiane Pereira");
		cliente3.setIdade(40);
		cliente3.setCorpref("lil�s");
			
		
		System.out.println("O nome do primeiro cliente �: " + cliente1.getNome());
		System.out.println("A idade do primeiro cliente �: " + cliente1.getIdade());
		System.out.println("A cor preferida do primeiro cliente �: " + cliente1.getCorpref());
		cliente1.comprar();
		cliente1.preferencia();
		
		System.out.println("\nO nome da segunda cliente �: " + cliente2.getNome());
		System.out.println("A idade da segunda cliente �: " + cliente2.getIdade());
		System.out.println("A cor preferida da segunda cliente �: " + cliente2.getCorpref());
		cliente2.comprar();
		cliente2.preferencia();
		
		System.out.println("\nO nome da segunda cliente �: " + cliente3.getNome());
		System.out.println("A idade da segunda cliente �: " + cliente3.getIdade());
		System.out.println("A cor preferida da segunda cliente �: " + cliente3.getCorpref()); 
		cliente3.comprar();
		cliente3.preferencia();
	}
	}
    
