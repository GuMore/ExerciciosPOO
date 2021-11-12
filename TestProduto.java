package ExePOO1211;

public class TestProduto {

	public static void main(String[] args) {
				
		Produto produtoA = new Produto(); 
		Produto produtoB = new Produto();
		Produto produtoC = new Produto(); 
		
		produtoA.settipo("caixa de bombom");
		produtoA.setFabricante("Nestle");
		produtoA.setDataVal("Dia 18 de maio");
		
		produtoB.settipo("danoninho");
		produtoB.setFabricante("Danone");
		produtoB.setDataVal("Dia 7 de janeiro");
		
		produtoC.settipo("pão integral");
		produtoC.setFabricante("wickbold");
		produtoC.setDataVal("Dia 25 de novembro");
		
		System.out.println("O tipo de produto é: " + produtoA.gettipo());
		System.out.println("O fabricante do produto é: " + produtoA.getFabricante());
		System.out.println("A data de validade do produto é até: " + produtoA.getDataVal() );
		produtoA.opinião();
		
		
		System.out.println("\nO tipo de produto é: " + produtoB.gettipo());
		System.out.println("O fabricante do produto é: " + produtoB.getFabricante());
		System.out.println("A data de validade do produto é até: " + produtoB.getDataVal() );
		produtoB.opinião();
		
		System.out.println("\nO tipo de produto é: " + produtoC.gettipo());
		System.out.println("O fabricante do produto é: " + produtoC.getFabricante());
		System.out.println("A data de validade do produto é até: " + produtoC.getDataVal() );
		produtoC.opnião2();  
		
		
		
		

}
}
