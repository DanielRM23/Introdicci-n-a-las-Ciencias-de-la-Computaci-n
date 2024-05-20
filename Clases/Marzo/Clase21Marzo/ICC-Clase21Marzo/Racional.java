
public class Racional {
	
	int p;
	int q;

	public Racional(int numerador, int denominador) {
		p = numerador;
		q = denominador;

	}

	public Racional() {

	}


	//Sets
	public void establecerNumerador(int nuevoEstadoNumerador) {
		System.out.println("Cambiamos el estado del numerador");
		p = nuevoEstadoNumerador;
	}

	public void setQ(int nuevoEstadoDenominador) {
		q = nuevoEstadoDenominador;
	}


	//Gets
	public int dameElValorDelNumerador() {
		return p;
	}

	public int getQ() {
		return q;
	}


	//toString
	public String toString() {
		return p + "/" + q;
	}



}


