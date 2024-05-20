
public class UsoBanco {
	
	public static void main(String[] args) {
		
		TarjetaCredito t = new TarjetaCredito("hsjhajshaj", 200);
		Banco b = new Banco();
		System.out.println(t);

		try {
			b.agregaSaldo(t, -2200);
		} catch(SaldoNegativo sn) {
			System.out.println(sn);
		} 
		System.out.println(t);


	}


}
