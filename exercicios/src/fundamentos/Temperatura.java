package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (*F - 32) x 5/9 = *C
		
		final int 	 tempPadrao = 32;
		final double divisaoPadrao = 5.0/9.0;
		double       tempF = 86;
		double		 tempC = (tempF - tempPadrao) * divisaoPadrao;
		
		System.out.println(tempF + " fahrenheit é igual a " + tempC + " celsius.");
		
	}
}
