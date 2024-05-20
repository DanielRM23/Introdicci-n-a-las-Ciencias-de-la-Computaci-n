
public class UsoRacional {
	
	public static void main(String[] args) {
		

		Racional miPrimerRacional = new Racional(1,2);
		Racional racVacio = new Racional();

		System.out.println(miPrimerRacional);
		System.out.println(racVacio);

		racVacio.establecerNumerador(4);
		racVacio.setQ(2);

		System.out.println(racVacio);

		System.out.println(miPrimerRacional.dameElValorDelNumerador());

		System.out.println(racVacio.dameElValorDelNumerador());
		System.out.println(racVacio.getQ());



	}



}

