
public class Producto {
	
	String codigoBarras;
	String nombre;
	double precio;

	public Producto(String codigo, String n, double p)  {
		codigoBarras = codigo;
		nombre = n;
		precio = p;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public void setPrecio(double p) {
		precio = p;
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


	public String toString() {
		return  "#" + codigoBarras + " Artículo: " + nombre + " $" + precio;
	}


}