/**
 * Importamos la biblioteca correspondiente.
 */
import java.util.Scanner;

/**
 * Clase que explica el funcionamiento de Scanner.
 * Permite al usuario agregar sus propios datos.
 * @author Miriam Torres Bucio.
 * ICC 14-02-2023
 */
public class Ejemplo2{
	public static void main(String args[]){
		Scanner dato = new Scanner(System.in);
		/**
		 * Entrada de una cadena, en este caso un nombre.
		 */
		System.out.println("Ingresa tu nombre: ");
		String nombre = dato.nextLine();
		/**
		 * Entrada de un número, es este caso edad.
		 */
		System.out.println("Ingresa tu edad: ");
		int edad = dato.nextInt();
		/**
		 * Entrada de un promedio, double.
		 */
		System.out.println("Ingresa tu promedio: ");
		double promedio = dato.nextDouble();

		/**
		 * Imprimimos los datos en consola.
		 */
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu edad es: " + edad);
		System.out.println("Tu promedio es : " + promedio);
	}
}