package ExePOO1211;

public class TestAviao {

	public static void main(String[] args) {  
		
		Aviao aviao1 = new Aviao(); 
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao(); 
		
		
		aviao1.setTipo("Piper PA-31");
		aviao1.setNumPessoas(7);
		aviao1.setCargaSup(599.65);
		
		aviao2.setTipo("sd 360");
		aviao2.setNumPessoas(20);
		aviao2.setCargaSup(3499.52);
		
		aviao3.setTipo("bandeirante");
		aviao3.setNumPessoas(200);
		aviao3.setCargaSup(1499.60); 
		
		System.out.println("O tipo do avi�o � --> " + aviao1.getTipo());
		System.out.println("A quantidade de pessoas que o avi�o supota � --> " + aviao1.getNumPessoas());
		System.out.println("O limite de carga suportada pelo avi�o � --> " + aviao1.getCargaSup());
		aviao1.aviao();
		
		System.out.println("\nO tipo do avi�o � --> " + aviao2.getTipo());
		System.out.println("A quantidade de pessoas que o avi�o supota � --> " + aviao2.getNumPessoas());
		System.out.println("O limite de carga suportada pelo avi�o � --> " + aviao2.getCargaSup());
		aviao1.aviao();
		
		System.out.println("\nO tipo do avi�o � --> " + aviao3.getTipo());
		System.out.println("A quantidade de pessoas que o avi�o supota � --> " + aviao3.getNumPessoas());
		System.out.println("O limite de carga suportada pelo avi�o � --> " + aviao3.getCargaSup());
		aviao1.aviao(); 
	
	}

}
