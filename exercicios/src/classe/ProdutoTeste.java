package classe;

//import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		/*int a = 3;
		Scanner entrada = new Scanner(System.in);*/
		
		Produto p1 = new Produto();
		p1.nome = "Ipad";
		p1.preco = 4999.99;
		p1.desconto = 0.2;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.4;
		p2.desconto = 0.1;
		
		System.out.println(p2.nome);
		System.out.println(p1.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}
}
