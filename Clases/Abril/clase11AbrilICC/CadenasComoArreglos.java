
public class CadenasComoArreglos {
	
	public static void main(String[] args) {

		/*
		String cad = "12";
		int val = Integer.parseInt(cad);
		System.out.println(cad + 5);
		*/

		String palabra = "somos";

		//Revisar que sea palíndroma
		String volteada = "";
		for(int i=palabra.length()-1; i>=0; i--) {
			char car = palabra.charAt(i);
			volteada += car;
			
		}

	//	System.out.println(volteada);

		if(palabra.equals(volteada)) {
			System.out.println("La palabra " + palabra  + " es palíndroma");
		} else {
			System.out.println("La palabra " + palabra  + " NO es palíndroma");
			
		}


		
		/*String prueba = "Clases";

		for (int i=0; i<prueba.length(); i++ ) {
			//System.out.println("aqui " + i);
			if(prueba.charAt(i)=='a') {
				System.out.print(prueba.charAt(i));
			}
			
		}


		System.out.println();
		*/

		/*String numeroBinario = "100";
		int resultado=0;
		double potencia= numeroBinario.length()-1;

		//De izquierda a derecha
		for(int i=0; i< numeroBinario.length(); i++) {
			char numero = numeroBinario.charAt(i);
			int valor = Character.getNumericValue(numero);
			double multiplicacion = valor * Math.pow(2, potencia);	
			resultado += multiplicacion;
			potencia--;
		}


		System.out.println(resultado);*/


		String numeroBinario = "100";
		int resultado=0;
		double potencia= 0;

		//De izquierda a derecha
		for(int i=numeroBinario.length()-1; i>=0 ; i--) {
			char numero = numeroBinario.charAt(i);
			int valor = Character.getNumericValue(numero);
			double multiplicacion = valor * Math.pow(2, potencia);	
			resultado += multiplicacion;
			potencia++;
		}


		System.out.println(resultado);


		String cadena1= "100011110";
		String cadena2= "1";

		int longitudMaxima=0;

		if(cadena1.length() > cadena2.length()) {
			longitudMaxima = cadena1.length();

			String temporal = cadena2;

			int diferencia = cadena1.length()-cadena2.length();
			int j=1;
			String cadenaCeros="";
			while( j<= diferencia) {
				cadenaCeros += "0";
				j++;
			}

			cadena2 = "";
			cadena2 = cadenaCeros + temporal;

			System.out.println(cadena2);

		}

		if(cadena2.length() > cadena1.length()) {
			longitudMaxima = cadena2.length();

			String temporal2 = cadena1;

			int diferencia2 = cadena2.length()-cadena1.length();
			int j2=1;
			String cadenaCeros2="";
			while( j2<= diferencia2) {
				cadenaCeros2 += "0";
				j2++;
			}

			cadena1 = "";
			cadena1 = cadenaCeros2 + temporal2;

			System.out.println(cadena1);



		}


	}


}
