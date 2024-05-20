
public class Banco {
	
	public void agregaSaldo(TarjetaCredito t, double cantidad) throws SaldoNegativo {

		double cantActual = t.getSaldo();
		double nueva = cantActual + cantidad;
		if(nueva < 0) {

			throw new SaldoNegativo("No puedes agregar saldo negativos");
		} else {
			t.setSaldo(nueva);
		}
	}


}

