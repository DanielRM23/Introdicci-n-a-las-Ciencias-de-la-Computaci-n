
public class Cafe {
	
	String tipo;
	String tamanio;
	String sabor_adicional;

	public Cafe(String ti, String ta, String sa) {
		tipo = ti;
		tamanio = ta;
		sabor_adicional = sa;
	}


	//Set's
	//No aplican


	//get's
	public String getTipo() {
		return tipo;
	}

	public String getTamanio() {
		return tamanio;
	}


	public String getSaborA() {
		return sabor_adicional;
	}


	public String toString() {
		return "Bebida: " + tipo + " de tamaño " + tamanio + " y sabor de " + sabor_adicional;
	}


}

