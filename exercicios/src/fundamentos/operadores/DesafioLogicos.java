package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		
		boolean tv32 = trabalho1 ^ trabalho2;
		
		boolean sorvete = tv50 || tv32;
		
		boolean saudavel = !sorvete;
		
		
		System.out.println("Comprou a tv de 50\"? " + tv50);
		
		System.out.println("Comprou a tv de 32\"? " + tv32);
		
		System.out.println("Tomaram sorvete? " + sorvete);
		
		System.out.println("Mais saudável? " + saudavel);
		
	}
}
