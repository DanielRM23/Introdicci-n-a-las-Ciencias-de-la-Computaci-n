

import java.util.InputMismatchException;
import java.util.Scanner;

public class Promedio {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa para obtener promedios");
		int i=1;
		int calificacion=0;
		int suma=0;
		double promedio=0;

		boolean bandera=true;

		while(bandera) {
			System.out.print("Escribe la calificación ");
			try {
				calificacion=entrada.nextInt();
				suma += calificacion;
				if(i==5) {
					bandera=false;
				}
				i++;
			} catch(InputMismatchException ime) {
				System.out.println("Dato inválido en una calificación, intenta de nuevo");
				entrada.nextLine();
			}

		}

		promedio=suma/5.0;
		System.out.println("El promedio de tu clase es " + promedio);

	}

}

