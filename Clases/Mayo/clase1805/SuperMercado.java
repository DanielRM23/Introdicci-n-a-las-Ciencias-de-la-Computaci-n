import java.util.ArrayList;
import java.util.Scanner;

public class SuperMercado {
	
	ArrayList<Producto> listaCompras = new ArrayList<Producto>();
	ArrayList<Producto> carrito = new ArrayList<Producto>();


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

			Producto pro = new Producto(cod, n, p, 10);
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


	public void mostrarMenuAdmin() {

		int opcion=0;

		Scanner entradaAdmin = new Scanner(System.in);


		while(opcion!=6) {

			System.out.println("Introduce una opción");
			System.out.println("1. Guardar artículo");
			System.out.println("2. Mostrar lista de productos");
			System.out.println("3. Agregar más artículos de uno ya existente");
			System.out.println("4. Eliminar un artículo");
			System.out.println("5. Eliminar todos los artículos");
			System.out.println("6. Salir");

			opcion = entradaAdmin.nextInt();

			switch(opcion) {

				case 1:
					agregaArticulo();
					break;
				case 2:
					imprimeListaCompras();
					break;
				case 3:
					agregarMasArticulos();
					break;
				case 4:
					eliminarArticulo();
					break;
				case 5:	
					borraTodo();
					break;
				case 6:
					System.out.println("Hasta pronto administrador");
					break;
				default:
					System.out.println("Opción incorrecta");
					break;

			}
		}
	}


	public void eliminarArticulo() {

		Scanner entrada11 = new Scanner(System.in);
		System.out.println("Escribe el código de barras del artículo a eliminar del inventario");
		String c_borrar = entrada11.next();


		int indiceBorrar=-1;
		boolean encontrado=false;
		for(int i=0; i<listaCompras.size(); i++) {
			indiceBorrar+=1;
			String codi = listaCompras.get(i).getCodigo();
			if(codi.equals(c_borrar)) {
				encontrado=true;
				break;
			}
			
		}


		//System.out.println(indiceBorrar);

		if(encontrado) {
			listaCompras.remove(indiceBorrar);
			System.out.println("Elemento borrado exitosamente");
		} else {
			System.out.println("Elemento no encontrado con ese código");
		}

	}



	public void borraTodo() {

		Scanner entrada = new Scanner(System.in);
		int opcion=0;

		Scanner entrada22 = new Scanner(System.in);
		System.out.println("¿Seguro que quieres borrar todo el inventario?");

		System.out.println("1. Sí");
		System.out.println("2. No");
		opcion = entrada.nextInt();

		if(opcion==1) {

			ArrayList<Producto> listaComprasBorrada = new ArrayList<Producto>();

			listaCompras = listaComprasBorrada;

			System.out.println("Haz borrado todo el inventario");

		}




	}





	public void agregarMasArticulos() {

		Scanner entradaSumar = new Scanner(System.in);
		Scanner entradaSumar2 = new Scanner(System.in);

		//Leer código de barras del artículo
		System.out.println("Dame el código del código de barras del artículo al que vas a sumar unidades");
		String codigoActualBarras = entradaSumar.next();

		boolean esta=false;
		String nombreArt="";

		//Buscar el artículo con ese código de barras		
		for(int i=0; i<listaCompras.size(); i++) {
			String codi = listaCompras.get(i).getCodigo();
			if(codi.equals(codigoActualBarras)) {
				esta = true;
				nombreArt = listaCompras.get(i).getNombre();
				break;
			}
		}

		if(esta) {
			System.out.println("Escribe la cantidad de artículos nuevos que llegaron de " + nombreArt);
			int cantidadNueva = entradaSumar2.nextInt();

			if(cantidadNueva>=0 && cantidadNueva<=100) {

				for(int i=0; i<listaCompras.size(); i++) {
					String codi2 = listaCompras.get(i).getCodigo();
					if(codi2.equals(codigoActualBarras)) {
						int cantidadActual = listaCompras.get(i).getUnidades();
						int cantNueva = cantidadActual + cantidadNueva;
						listaCompras.get(i).agregaUnidades(cantNueva);
						break;
					}
				}

			} else {
				System.out.println("Cantidad errónea de unidades a agregar");
			}


		} else {
			System.out.println("Artículo no encontrado");
		}

	}



	public void mostrarMenuCliente() {

		Scanner entrada200 = new Scanner(System.in);

		int opcion2=0;
		

		while(opcion2!=7) {

			System.out.println("Introduce una opción");
			System.out.println("1. Añadir artículo a mi carrito");
			System.out.println("2. Ver lista de productos en el almacén");
			System.out.println("3. Ver lista de mis productos");
			System.out.println("4. Eliminar un artículo del carrito");
			System.out.println("5. Eliminar todos mis artículos");
			System.out.println("6. Procesar pago");
			System.out.println("7. Salir");

			opcion2 = entrada200.nextInt();

			switch(opcion2) {

			case 1:
				comprarArticulos();
				break;
			case 2:
				imprimeListaCompras();
				break;
			case 3:
				imprimeMiCarrito();
				break;
			case 4:
				eliminarArticuloCarrito();
				break;
			case 5:	
				vaciarCarrito();
				break;
			case 6:	
				//procesaPago();
				break;
			case 7:
				System.out.println("Hasta pronto cliente");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;

			}

		}


		
	}


	public void comprarArticulos() {

		Scanner entrada33 = new Scanner(System.in);

		System.out.println("Escribe el código del artículo que quieres agregar a tu lista");
		String codigoArtQuiero = entrada33.next();

		for(int i=0; i<listaCompras.size(); i++) {
			String codi2 = listaCompras.get(i).getCodigo();
			if(codi2.equals(codigoArtQuiero)) {
				carrito.add(listaCompras.get(i));
				break;
			}
		}

	}


	public void imprimeMiCarrito() {

		System.out.println("Tus artículos");
		for(int i=0; i<carrito.size(); i++) {
			System.out.println(carrito.get(i).toString2());
		}

	}



	public void eliminarArticuloCarrito() {

		Scanner entrada110 = new Scanner(System.in);
		System.out.println("Escribe el código de barras del artículo a eliminar de tu carrito");
		String c_borrar = entrada110.next();


		int indiceBorrar=-1;
		boolean encontrado=false;
		for(int i=0; i<carrito.size(); i++) {
			indiceBorrar+=1;
			String codi = carrito.get(i).getCodigo();
			if(codi.equals(c_borrar)) {
				encontrado=true;
				break;
			}
			
		}


		//System.out.println(indiceBorrar);

		if(encontrado) {
			carrito.remove(indiceBorrar);
			System.out.println("Elemento borrado exitosamente");
		} else {
			System.out.println("Elemento no encontrado con ese código");
		}

	}



	public void vaciarCarrito() {

		Scanner entrada = new Scanner(System.in);
		int opcion=0;

		Scanner entrada22 = new Scanner(System.in);
		System.out.println("¿Seguro que quieres borrar todo tu carrito?");

		System.out.println("1. Sí");
		System.out.println("2. No");
		opcion = entrada.nextInt();

		if(opcion==1) {

			ArrayList<Producto> listaCarritoBorrado = new ArrayList<Producto>();

			carrito = listaCarritoBorrado;

			System.out.println("Haz borrado todo tu carrito");

		}




	}



}
