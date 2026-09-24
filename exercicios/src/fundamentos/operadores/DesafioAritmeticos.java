package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int varA  = 3 + 2;
		int varA1 = 6 * varA;
		int varA2 = 3 * 2;
		double varA3 = Math.pow(varA1, 2);
		double varA4 = varA3 / varA2;
		
		System.out.println(varA4);
		
		int varB = 1 - 5;
		int varB1 = 2 - 7;
		int varB2 = varB * varB1;
		double varB3 = varB2/2;
		double varB4 = Math.pow(varB3, 2);
		
		System.out.println(varB4);
		
		double varC = varA4 - varB4;
		double varC1 = Math.pow(varC, 3);
		double varC2 = Math.pow(10, 3);
		
		double varFinal = varC1 / varC2;
		
		System.out.println("O resultado é: " + varFinal);

		
		
	}
}
