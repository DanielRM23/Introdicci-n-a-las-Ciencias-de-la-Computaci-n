
public class Producto {
	
	String codigoBarras;
	String nombre;
	double precio;
	int unidades;


	public Producto(String codigo, String n, double p, int uni)  {
		codigoBarras = codigo;
		nombre = n;
		precio = p;
		unidades = uni;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public void setPrecio(double p) {
		precio = p;
	}

	public void agregaUnidades(int uni) {
		unidades = uni;
	}




	public String getNombre() {
		return nombre;
	}


	public double getPrecio() {
		return precio;
	}

	public String getCodigo() {
		return codigoBarras;
	}

	public int getUnidades() {
		return unidades;
	}




	public String toString() {
		return  "#" + codigoBarras + " Artículo: " + nombre + " $" + precio + " tenemos " + unidades;
	}


	public String toString2() {
		return  "#" + codigoBarras + " Artículo: " + nombre + " $" + precio;
	}


}