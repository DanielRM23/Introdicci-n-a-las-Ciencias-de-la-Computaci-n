
public class TarjetaCredito {
	
	//Atributos
	String numero;
	String nip;
	double monto;
	String propietario;
	String cvv;
	String fechaCaducidad; //"mm/aaaa"

	//Método constructor
	public TarjetaCredito(String n, String nip, double m, String prop, String cvv, String fc) {
		numero = n; 
		this.nip = nip;
		monto = m;
		propietario = prop;
		this.cvv = cvv;
		fechaCaducidad = fc;
	}


	//Set 
	public void setNumero(String n) {
		numero = n;
	}

	public void setMonto(double mon) {
		monto = mon;
	}



	//get
	public String getNumero() {
		return numero;
	}

	public double getMonto() {
		return monto;
	}


	public boolean comprar(double montoRetiro) {
		boolean sePuedoHacerCompra=true;

		double saldoARestar = this.getMonto()-montoRetiro;
		if(saldoARestar >= 0) {
			//Compra exitosa
			System.out.println("Compra exitosa");
			this.setMonto(saldoARestar);
		} else {
			System.out.println("Dinero insuficiente");
			sePuedoHacerCompra = false;
		}

		return sePuedoHacerCompra;
	}


	public void depositar(double montoDeposito) {
		double saldoNuevo = this.getMonto() + montoDeposito;
		this.setMonto(saldoNuevo);
	}







	//Método toString
	public String toString() {
		String cadena="";
		cadena += "*****************************\n";
		cadena += numero + "\n";
		cadena += propietario + "\n";
		cadena += "monto: $" + monto + "\n";
		cadena += "CVV" + cvv + "\t"+"\t" + fechaCaducidad + "\n";
		cadena += "*****************************\n";
		return  cadena;
		
	}
	




}



