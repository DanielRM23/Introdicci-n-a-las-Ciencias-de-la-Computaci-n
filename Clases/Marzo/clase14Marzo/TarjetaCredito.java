public class TarjetaCredito {
	
	//Atributos
	String numero;
	String nip;
	double monto;
	String propietario;
	String cvv;
	String fechaCaducidad; //"mm/aaaa"


	public TarjetaCredito(String n, int m) {
		numero = n;
		monto = m;
	}


	public TarjetaCredito(String n, String p, int m) {
		numero = n;
		propietario = p;
		monto = m;
	}

	// Método constructor
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
		//No realizar transacción
		/*if(montoDeposito<0) {
			System.out.println("Saldo a depositar erróneo");
		} else {
			double saldoNuevo = this.getMonto() + montoDeposito;
			this.setMonto(saldoNuevo);
		}
		*/
		//Corregir y realizar transacción
		/*if(montoDeposito<0) {
			montoDeposito *= -1;
		} 

		double saldoNuevo = this.getMonto() + montoDeposito;
		this.setMonto(saldoNuevo);*/
		//Generalizar errores de valores negativos y corregir siempre
		montoDeposito = Math.abs(montoDeposito);

		double saldoNuevo = this.getMonto() + montoDeposito;
		this.setMonto(saldoNuevo);


	}


	public void transferir(TarjetaCredito t, double montoTransferencia) {

		double saldoQueQueda = this.getMonto()-montoTransferencia;
		if(saldoQueQueda>=0) {
			t.depositar(montoTransferencia);
			this.setMonto(saldoQueQueda);
		} else {
			System.out.println("La tarjeta " +  this.getNumero() + " no cuenta con los fondos suficientes");
		}

	}

	public void mismoDuenio(TarjetaCredito t) {

		if(this.propietario.equals(t.propietario)) {
			System.out.println("Las tarjetas tienen al mismo dueño");
		} else {
			System.out.println("Las tarjetas son de diferente dueño");
		}

	}




	//Método toString
	public String toString() {

		String cadena="";

		//Poner todos
		if(propietario!= null && cvv != null) {

			cadena += "*****************************\n";
			cadena += numero + "\n";
			cadena += propietario + "\n";
			cadena += "monto: $" + monto + "\n";
			cadena += "CVV" + cvv + "\t"+"\t" + fechaCaducidad + "\n";
			cadena += "*****************************\n";
		} else if (propietario!= null && numero != null && monto != 0.0) {

			cadena += "*****************************\n";
			cadena += numero + "\n";
			cadena += propietario + "\n";
			cadena += "monto: $" + monto + "\n";
			cadena += "*****************************\n";

		} else {

			cadena += "*****************************\n";
			cadena += numero + "\n";
			cadena += "monto: $" + monto + "\n";
			cadena += "*****************************\n";
		}

		
		
		return  cadena;
		
	}
	




}



