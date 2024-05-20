import java.util.Random;

public class Memorama {
	
	Carta[][] cartas = new Carta[4][4];

	public void generaPaqueteMemorama() {

		char[] simbolitos = {'\u2600', '\u2602', '\u2605', '\u260E', '\u263B', '\u265E', '\u266B', '\u26BD'};

		int indiceParejas=0;
		int contadorParejas=0;
		for(int i=0; i<cartas.length; i++) {
			for (int j=0; j<cartas[i].length; j++ ) {
				
				if(contadorParejas<=2) {
					Carta c = new Carta(simbolitos[indiceParejas], false); 
					cartas[i][j] = c;
					contadorParejas++;
					if(contadorParejas==2) {
						indiceParejas++;
						contadorParejas=0;
					}
				}
			}
		}

	}


	public void revuelveCartas() {

		Random aleatorios = new Random();

		for(int i=0; i<cartas.length; i++) {
			for (int j=0; j<cartas[i].length; j++ ) {

				int i_azar = aleatorios.nextInt(4);
				int j_azar = aleatorios.nextInt(4);

				Carta auxilar = new Carta();

				auxilar = cartas[i][j];
				cartas[i][j] = cartas[i_azar][j_azar];
				cartas[i_azar][j_azar] = auxilar;
				
			}
		}

	}



	public void imprimeMemorama() {

		for(int i=0; i<cartas.length; i++) {
			for (int j=0; j<cartas[i].length; j++ ) {
				if(cartas[i][j].getDescubierta()==false) {
					System.out.print("- ");					
				} else {
					System.out.print(cartas[i][j]);
				}

				
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
	}


}







