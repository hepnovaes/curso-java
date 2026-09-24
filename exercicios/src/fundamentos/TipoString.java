package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(6));

		String s = "Boa Tarde!!";

		s = s.toUpperCase();
		s = "Bom dia";

		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome = "Paulo";
		//nome.
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.56;
		
		String maisUmaFrase = "Nome:" + nome 
				+ "\nSobrenome:" + sobrenome 
				+ "\nIdade:" + idade 
				+ "\nSalário:" + salario
				+ "\n";
		
		System.out.println(maisUmaFrase);
		
		System.out.println("Nome:" + nome 
				+ "\nSobrenome:" + sobrenome 
				+ "\nIdade:" + idade 
				+ "\nSalário:" + salario
				+ "\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, 
				sobrenome, 
				idade, 
				salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, 
				sobrenome, 
				idade, 
				salario);
		
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase Qualquer".substring(6));
		System.out.println("Frase Qualquer".substring(6,10));
		
		System.out.println("Frase:qualquer".split(":")[0]);

	}

}
