package ExePOO1211;

public class TestPatinete {

	public static void main(String[] args) {
		
		Patinete tipoA = new Patinete();
        Patinete tipoB = new Patinete();
        Patinete tipoC = new Patinete();
        
        tipoA.setTipo("eletric scotter");
        tipoA.setModalidade("Livre");
        tipoA.setPre�o(2000.00);
        
        tipoB.setTipo("infantil");
        tipoB.setModalidade("Para crian�as");
        tipoB.setPre�o(699.99);
        
        tipoC.setTipo("Xiaomi M365");
        tipoC.setModalidade("Profissional");
        tipoC.setPre�o(10.000);
        
        System.out.println("O tipo do patinete �: " + tipoA.getTipo());
        System.out.println("A modalidade recomendada do patinete �: " + tipoA.getModalidade());
        System.out.println("O pre�o do patinete est� na faixa dos: " + tipoA.getPre�o());
        tipoA.TemQualidade();
        
        System.out.println("\nO tipo do patinete �: " + tipoB.getTipo());
        System.out.println("A modalidade recomendada do patinete �: " + tipoB.getModalidade());
        System.out.println("O pre�o do patinete est� na faixa dos: " + tipoB.getPre�o());
        tipoB.SemQualidade();
        
        System.out.println("\nO tipo do patinete �: " + tipoC.getTipo());
        System.out.println("A modalidade recomendada do patinete �: " + tipoC.getModalidade());
        System.out.println("O pre�o do patinete est� na faixa dos: " + tipoC.getPre�o());
        tipoA.TemQualidade();                                           
}
}
