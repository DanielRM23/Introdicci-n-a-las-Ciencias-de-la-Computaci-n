import java.util.Scanner;

public class UsoCafeteria {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		Cafeteria caf = new Cafeteria();

		int opcion=0;

		while(opcion!=5) {

			System.out.println("Elige una opción");
			System.out.println("1. Agregar café");
			System.out.println("2. Imprimir toda la mesa");
			System.out.println("3. Buscar café por tipo");
			System.out.println("4. Eliminar café");
			System.out.println("5. Salir");

			opcion = entrada.nextInt();

			if(opcion == 1) {
				caf.agregaCafe();
			} else if(opcion == 2) {
				caf.imprimeMesa();
			} else if(opcion == 3) {
				//Leer parámetros del tipo
				System.out.println("Escribe el tipo del café que quieres buscar");
				System.out.println("1. Capucchino ");
				System.out.println("2. Latte");
				System.out.println("3. Americano");
				String tip =  entrada2.next();
				String cadenaBusqueda="";
				if(tip.equals("1")) {
					cadenaBusqueda = "Capucchino";
				} else if (tip.equals("2")) {
					cadenaBusqueda = "Latte";
				} else {
					cadenaBusqueda = "Americano";
				}

				caf.buscaCafe(cadenaBusqueda);
			} else if(opcion == 4) {

				//Leer parámetros del tipo
				System.out.println("Escribe el tipo del café que quieres borrar");
				System.out.println("1. Capucchino ");
				System.out.println("2. Latte");
				System.out.println("3. Americano");
				String tip2 =  entrada2.next();
				String cadenaBusquedaTipo="";
				if(tip2.equals("1")) {
					cadenaBusquedaTipo = "Capucchino";
				} else if (tip2.equals("2")) {
					cadenaBusquedaTipo = "Latte";
				} else {
					cadenaBusquedaTipo = "Americano";
				}



				//Leer parámetros del tamaño
				System.out.println("Escribe el tamaño del café que quieres borrar");
				System.out.println("1. CH ");
				System.out.println("2. M");
				System.out.println("3. G");
				String tip3 =  entrada2.next();
				String cadenaBusquedaTam="";
				if(tip3.equals("1")) {
					cadenaBusquedaTam = "CH";
				} else if (tip3.equals("2")) {
					cadenaBusquedaTam = "M";
				} else {
					cadenaBusquedaTam = "G";
				}


				caf.eliminaCafe(cadenaBusquedaTipo, cadenaBusquedaTam);


			} else if(opcion == 5) {
				System.out.println("Gracias por usar el programa");
				System.exit(1);

			} else {
				System.out.println("Opción inválida");
			}

		}

	}


}

