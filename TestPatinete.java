package ExePOO1211;

public class TestPatinete {

	public static void main(String[] args) {
		
		Patinete tipoA = new Patinete();
        Patinete tipoB = new Patinete();
        Patinete tipoC = new Patinete();
        
        tipoA.setTipo("eletric scotter");
        tipoA.setModalidade("Livre");
        tipoA.setPreço(2000.00);
        
        tipoB.setTipo("infantil");
        tipoB.setModalidade("Para crianças");
        tipoB.setPreço(699.99);
        
        tipoC.setTipo("Xiaomi M365");
        tipoC.setModalidade("Profissional");
        tipoC.setPreço(10.000);
        
        System.out.println("O tipo do patinete é: " + tipoA.getTipo());
        System.out.println("A modalidade recomendada do patinete é: " + tipoA.getModalidade());
        System.out.println("O preço do patinete está na faixa dos: " + tipoA.getPreço());
        tipoA.TemQualidade();
        
        System.out.println("\nO tipo do patinete é: " + tipoB.getTipo());
        System.out.println("A modalidade recomendada do patinete é: " + tipoB.getModalidade());
        System.out.println("O preço do patinete está na faixa dos: " + tipoB.getPreço());
        tipoB.SemQualidade();
        
        System.out.println("\nO tipo do patinete é: " + tipoC.getTipo());
        System.out.println("A modalidade recomendada do patinete é: " + tipoC.getModalidade());
        System.out.println("O preço do patinete está na faixa dos: " + tipoC.getPreço());
        tipoA.TemQualidade();                                           
}
}
