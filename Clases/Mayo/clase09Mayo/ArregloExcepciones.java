
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArregloExcepciones {
	
	public static void main(String[] args) {
		
		//Programa que maneja excepciones de acceso a índices inválidos en un arreglo
		Scanner entrada = new Scanner(System.in);
		int[] arreglo = {1,5,6,7,8,8,20};
		int opcion=0;
		System.out.println("Dame un número entre 0 y 6");

		try {
			opcion = entrada.nextInt();
			System.out.println("El valor es " + arreglo[opcion]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ese valor que diste en inválido, debe ser entre 0 y 6");
			System.out.println(e);

		} catch(InputMismatchException ime) {
			System.out.println("Ese valor que diste en inválido, debe ser un número");
			//System.out.println(ime);
		}	

	}

}

