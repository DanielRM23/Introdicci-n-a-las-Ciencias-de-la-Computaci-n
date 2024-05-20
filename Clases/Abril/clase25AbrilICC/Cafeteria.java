import java.util.Scanner;

public class Cafeteria {
	
	Cafe[] mesita = new Cafe[7];


	public void agregaCafe() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido, crea una café");
		System.out.println("Proporciona los siguientes datos");
		System.out.println("Tipo");
		System.out.println("1. Capucchino");
		System.out.println("2. Latte");
		System.out.println("3. Americano");

		String t;
		int opcion1 = entrada.nextInt();
		if(opcion1==1) {
			t = "Capucchino";
		} else if (opcion1==2) {
			t = "Latte";
		} else {
			t = "Americano";
		}


		System.out.println("Tamaño");
		System.out.println("1. CH");
		System.out.println("2. M");
		System.out.println("3. G");

		String tam;
		int opcion2 = entrada.nextInt();
		if(opcion2==1) {
			tam = "CH";
		} else if (opcion2==2) {
			tam = "M";
		} else {
			tam = "G";
		}
		 

		System.out.println("Sabor adicional?");
		System.out.println("1. Ninguno");
		System.out.println("2. vainilla");
		System.out.println("3. avellana");

		String sa;
		int opcion3 = entrada.nextInt();
		if(opcion3==1) {
			sa = "Ninguno";
		} else if (opcion3==2) {
			sa = "vainilla";
		} else {
			sa = "avellana";
		}
		 

		Cafe cafecito = new Cafe(t, tam, sa);

		int contador=0;

		for(int i=0; i<mesita.length; i++ ) {
			if(mesita[i]==null) {
				mesita[i] = cafecito;
				break;
			}	else {
				contador++;
			}
		}

		if(contador==mesita.length) {
			System.out.println("Mesita llena");	
		}




	}



	public void imprimeMesa() {

		for(int i=0; i<mesita.length; i++ ) {
			if(mesita[i]!=null) {
				System.out.println(mesita[i]);
			} else {
				System.out.println("----- vacío -------");
			}
		}

	}


	public void buscaCafe(String tipoCafeAbuscar) {

		int contador=0;

		for(int i=0; i<mesita.length; i++) {
			if(mesita[i]!=null) {
				if(mesita[i].getTipo().equals(tipoCafeAbuscar)) {
					System.out.println("encontrado");
					System.out.println(mesita[i]);
					contador++;

				}
			}

		}

		if(contador==0)  {
			System.out.println("No hubo ningún café de " + tipoCafeAbuscar);
		}


	}


	public void buscaPorTipo() {
		Scanner entrada2 = new Scanner(System.in);
		String t;
		System.out.println("Escribe el tipo del café que quieres buscar");

		int opcion1 = entrada2.nextInt();
		
		if(opcion1==1) {
			t = "Capucchino";
		} else if (opcion1==2) {
			t = "Latte";
		} else {
			t = "Americano";
		}		
		

		for(int i=0; i<mesita.length; i++ ) {
			if(mesita[i]!=null) {
				if(mesita[i].getTipo().equals(t)) {
					System.out.println("Café encontrado");
					System.out.println(mesita[i]);
				}
			}
		}
	
	}


	//ELiminar todos los cafés por tipo y tamaño	
	public void eliminaCafe(String t, String tam) {
		for(int i=0; i<mesita.length; i++ ) {
			if(mesita[i]!=null) {
				if(mesita[i].getTipo().equals(t) && mesita[i].getTamanio().equals(tam)) {
					mesita[i] = null;
				}
			}
		}
	}


}

