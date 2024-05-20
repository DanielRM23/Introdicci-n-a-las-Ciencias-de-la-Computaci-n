import java.util.ArrayList;
import java.util.Scanner;

public class SuperMercado {
	
	ArrayList<Producto> listaCompras = new ArrayList<Producto>();

	public void agregaArticulo() {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Agrega el Producto");

		System.out.println("Escribe el código del producto");
		String cod = entrada.next();

		boolean sePudo=true;
		//Revisar si ese código no está ya dado de alta
		for(int i=0; i<listaCompras.size(); i++) {
			String codigoActual = listaCompras.get(i).getCodigo() ;
			if(codigoActual.equals(cod)) {
				sePudo=false;
				break;
			}

		}

		if(sePudo) {

			System.out.println("Escribe el nombre del producto");
			String n = entrada2.nextLine();

			System.out.println("Escribe el precio del producto");
			double p = entrada2.nextDouble();

			Producto pro = new Producto(cod, n, p);
			listaCompras.add(pro);

		} else {
			System.out.println("Ese código ya está registrado");
		}


	}


	public void imprimeListaCompras() {

		for(int i=0; i<listaCompras.size(); i++) {
			System.out.println(listaCompras.get(i));
		}

	}




}




