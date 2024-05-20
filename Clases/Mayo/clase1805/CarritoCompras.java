import java.util.Scanner;

public class CarritoCompras {
	

	public static void main(String[] args) {
			
		SuperMercado s = new SuperMercado();
		Scanner entrada = new Scanner(System.in);
		int opcion=0;

	
		while(opcion!=3) {

			System.out.println("Introduce una opción");
			System.out.println("1. Usar la tienda como Administrador");
			System.out.println("2. Usar la tienda como cliente");
			System.out.println("3. Salir");
			opcion = entrada.nextInt();

			if(opcion==1) {
				s.mostrarMenuAdmin();
			} else if (opcion==2) {
				s.mostrarMenuCliente();
			} else if(opcion==3) {
				System.exit(1);
			} else {
				System.out.println("Opción incorrecta");
			}

		}
			
	}

}
