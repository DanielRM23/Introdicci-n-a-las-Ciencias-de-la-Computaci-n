/**
 * Importamos la biblioteca correspondiente.
 */
import java.util.Random;

/**
 * Clase que explica el funcionamiento de Random.
 * Nos permite generar números aleatorios.
 * @author Miriam Torres Bucio.
 * ICC 14-02-2023
 */

public class Ejemplo1{
	public static void main(String args[]){

		Random r = new Random();
		int numero = 15;
		int entero_random = r.nextInt(numero);
		double double_random = r.nextDouble();

		System.out.println("Numero aleatorio entero de 0 a " + (numero-1) 
			+ " : " + entero_random);
		System.out.println("Numero aleatorio double : " + double_random);
	
		/**
		 * Elegiremos un número al azar en un intervalo.
		 * Utilizamos Math.random que viene en el paquete Random.
		 * Los parámetros para usar Math son:
		 * 			Math.random()*numeroMaximo+numeroMinimo
		 */
	
	
		int min = 20;
		int max = 70;

		System.out.println("Valor aleatorio entre " + min + " hasta " 
			+ max + ":");

		int numeroIntervalo = (int)Math.floor(Math.random() * 
			(max-min+1) + min);
		System.out.println(numeroIntervalo);

		/**
		 * Genera un número de tipo double al azar.
		 * Los parámetros para usar Math son:
		 * 			Math.random()*numeroMaximo+numeroMinimo
		 */
	
		double azar = Math.random()*40+12;
		System.out.println(azar);


		/**
		 * Generamos letras al azar.
		 */

		Random letra = new Random();
		char letraAzar = (char) (letra.nextInt(26) + 'a');
		System.out.println("La letra al azar es:" + letraAzar);
	}
}