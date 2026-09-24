package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";

		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Henrique".toUpperCase(); 
		System.out.println(x);
		
		String y = "Bom dia Y"
				.replace("Y","Plotegher")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "." (pois não são classes, logo, não tem metodos).
		int a = 3;
		//a.
		System.out.println(a);
	}
}
