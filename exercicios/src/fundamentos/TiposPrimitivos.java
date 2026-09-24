package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte  anosDeEmpresa = 23;
		short numeroDeVoos = 328;
		//short limite = 32768;
		int   id = 78456;
		long  pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float  salario = 11_445.44F;
		double vendasAcumuladas = 2_991_898_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = true; //false
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Id ganha salário
		System.out.println(id + ": ganha -> " + salario);
		
		// Funcionario de ferias
		System.out.println("Férias? " + estaDeFerias);
		
		// Status do funcionário
		System.out.println("Status: " + status);
	}
}
