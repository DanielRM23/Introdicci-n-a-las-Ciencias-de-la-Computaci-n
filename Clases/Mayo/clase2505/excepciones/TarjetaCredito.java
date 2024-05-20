
public class TarjetaCredito {
	
	String numero;
	double saldo;

	public TarjetaCredito(String n, double s) {
		numero = n;
		saldo = s;
	}

	public void setSaldo(double s) {
		saldo = s;
	}

	public double getSaldo() {
		return saldo;
	}


	public String toString() {
		return "Tarjeta " + numero + " $ " + saldo;
	}


}

