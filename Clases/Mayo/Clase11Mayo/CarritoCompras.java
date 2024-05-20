import java.util.Scanner;

public class CarritoCompras {
	

	public static void main(String[] args) {
			
		SuperMercado s = new SuperMercado();
		Scanner entrada = new Scanner(System.in);
		int opcion=0;

		

		while(opcion!=3) {

			System.out.println("Introduce una opción");
			System.out.println("1. guadar artículo");
			System.out.println("2. Mostrar lista de productos");
			System.out.println("3. Salir");

			opcion = entrada.nextInt();

			switch(opcion) {

				case 1:
					s.agregaArticulo();
				 	break;
				case 2:
				 	s.imprimeListaCompras();
				 	break;
				case 3:
					System.exit(1);
					break;
				default:
					System.out.println("Opción incorrecta");
					break;

			}


		}

			
	}


}
