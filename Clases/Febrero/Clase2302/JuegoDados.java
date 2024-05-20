import java.util.Random;

public class JuegoDados {


	public static void main(String[] args) {
	
		Random aleatorios = new Random();
		
		int dado1 = aleatorios.nextInt(6)+1;
		int dado2 = aleatorios.nextInt(6)+1;
	
		int suma = (dado1+dado2);
		
		System.out.println("suma: " + suma);
		
		if(suma%2==0) {
		
			dado1 = aleatorios.nextInt(6)+1;
			dado2 = aleatorios.nextInt(6)+1;
			suma = dado1+dado2;
			
			System.out.println("suma: " + suma);
			
			if(suma%2==0) {
			
				System.out.println("Ganamos");
			} else {
				System.out.println("Perdimos");
			}
		
		
		} else {
		
			System.out.println("Perdimos");
		
		}
		

	}


}





