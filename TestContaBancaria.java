package ExePOO1211;

public class TestContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria P1 = new ContaBancaria();
		ContaBancaria P2 = new ContaBancaria();
		ContaBancaria P3 = new ContaBancaria();
		
		P1.setNomeDono("Carlos de Oliveira");
		P1.setNumerCont(6543);
		P1.setSaldo(1632.76);
		
		P2.setNomeDono("Mariana Elena");
		P2.setNumerCont(9648);
		P2.setSaldo(8467.98);
		
		P3.setNomeDono("Justin Bieber");
		P3.setNumerCont(5297);
		P3.setSaldo(-400.98);
		
		System.out.println("O nome do dono/a da conta �: " + P1.getNomeDono());
		System.out.println("O numero de sua conta � " + P1.getNumerCont());
		System.out.println("O saldo da sua conta bancaria � de: " + P1.getSaldo());
		P1.condi��o2();
		
		System.out.println("\nO nome do dono/a da conta �: " + P2.getNomeDono());
		System.out.println("O numero de sua conta � " + P2.getNumerCont());
		System.out.println("O saldo da sua conta bancaria � de: " + P2.getSaldo());
		P2.condi��o2();
		
		System.out.println("\nO nome do dono/a da conta �: " + P3.getNomeDono());
		System.out.println("O numero de sua conta � " + P3.getNumerCont());
		System.out.println("O saldo da sua conta bancaria � de: " + P3.getSaldo());
		P3.condi��o();
		

	}

}
