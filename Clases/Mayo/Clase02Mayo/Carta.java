
public class Carta {
	
	//Atributos
	char simbolo;
	boolean descubierta;

	public Carta() {
		
	}


	public Carta(char s, boolean d) {
		simbolo = s;
		descubierta = d;
	}

	public void setDescubierta(boolean d) {
		descubierta = d;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public boolean getDescubierta() {
		return descubierta;
	}

	public String toString() {
		return simbolo + " ";
	}


}
