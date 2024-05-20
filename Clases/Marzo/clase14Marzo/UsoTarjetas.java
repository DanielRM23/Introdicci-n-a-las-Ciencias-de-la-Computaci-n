
public class UsoTarjetas {
	
	public static void main(String[] args) {
			
		TarjetaCredito t1 = new TarjetaCredito("26176177371", "Hugo Silva", 20000);
		TarjetaCredito t2 = new TarjetaCredito("64733333000", "Hugo Silva", 1);

		System.out.println(t1);
		System.out.println(t2);

		t1.mismoDuenio(t2);

		/*System.out.println(t1);

		t1.depositar(100);

		System.out.println(t1);*/
		/*System.out.println(t1);
		System.out.println(t2);

		t1.transferir(t2, 1000);

		System.out.println(t1);
		System.out.println(t2);*/



	}




}

