import java.util.Scanner;

public class Zodiaco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("dime tu día y mes de nacimiento y te diré tu signo");
		System.out.println("Escribe el día (1-31)");
	
		int dia = entrada.nextInt();

		System.out.println("Escribe el mes (1-12)");
	
		int mes = entrada.nextInt();
		
		boolean bandera = true;
		
		//Los datos son consistentes
		if(mes==3 && (dia<=0 || dia>=32 )) {
			System.out.println("fecha fuera de rango");
			bandera = false;
		
		}
		
		
		if(bandera) {

			if ( (mes==3 && dia>=21 && dia<=31 ) || (dia<=19 && mes==4 )) {
				System.out.println("Eres aries");
			
			} else if ( (dia>=20 && mes==4 ) || (dia<=20 && mes==5 )) {
		
				System.out.println("Eres tauro");

			}
			
		}

	}




}







