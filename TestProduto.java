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
		
		produtoC.settipo("p�o integral");
		produtoC.setFabricante("wickbold");
		produtoC.setDataVal("Dia 25 de novembro");
		
		System.out.println("O tipo de produto �: " + produtoA.gettipo());
		System.out.println("O fabricante do produto �: " + produtoA.getFabricante());
		System.out.println("A data de validade do produto � at�: " + produtoA.getDataVal() );
		produtoA.opini�o();
		
		
		System.out.println("\nO tipo de produto �: " + produtoB.gettipo());
		System.out.println("O fabricante do produto �: " + produtoB.getFabricante());
		System.out.println("A data de validade do produto � at�: " + produtoB.getDataVal() );
		produtoB.opini�o();
		
		System.out.println("\nO tipo de produto �: " + produtoC.gettipo());
		System.out.println("O fabricante do produto �: " + produtoC.getFabricante());
		System.out.println("A data de validade do produto � at�: " + produtoC.getDataVal() );
		produtoC.opni�o2();  
		
		
		
		

}
}
