import java.util.Random;

public class Ajedrez {
	
	public static void main(String[] args) {
		
		// Se crea un tablero de 8x8
		int[][] ajedrez = new int[8][8];

		Random aleatorios = new Random();

		// Se eligen dos números aleatorios entre 0 y 8 
		int x_azar = aleatorios.nextInt(8);
		int y_azar = aleatorios.nextInt(8);

		// En la posición ij-ésima se coloca un 1 
		ajedrez[x_azar][y_azar] = 1;

		//Cuadrante1
		int renAux = x_azar;
		int colAux= y_azar;

		while(renAux>0 && colAux>0) {
			renAux--;
			colAux--;
			ajedrez[renAux][colAux] = 2;
		}

		//Cuadrante2
		renAux = x_azar;
		colAux = y_azar;

		while(renAux>0 && colAux<7) {
			renAux--;
			colAux++;
			ajedrez[renAux][colAux] = 2;
		}

		//Cuadrante3
		renAux = x_azar;
		colAux = y_azar;

		while(renAux<7 && colAux<7) {
			renAux++;
			colAux++;
			ajedrez[renAux][colAux] = 2;
		}


		//Cuadrante4
		renAux = x_azar;
		colAux = y_azar;

		while(renAux<7 && colAux>0) {
			renAux++;
			colAux--;
			ajedrez[renAux][colAux] = 2;
		}


		for(int i=0; i<ajedrez.length; i++) {
			for(int j=0; j<ajedrez[i].length; j++) {

				if(i%2==0) {
					if(j%2==0) {
						if(ajedrez[i][j]==1) {
							System.out.print("A" + " ");
						} else if(ajedrez[i][j]==2) {
							System.out.print("*" + " ");
						} else {
							System.out.print("#" + " ");
						}						
					} else {
						if(ajedrez[i][j]==1) {
							System.out.print("A" + " ");
						} else if(ajedrez[i][j]==2) {
							System.out.print("*" + " ");
						} else {
							System.out.print("-" + " ");
						}
					}
				} else {
					if(j%2==0) {
						if(ajedrez[i][j]==1) {
							System.out.print("A" + " ");
						} else if(ajedrez[i][j]==2) {
							System.out.print("*" + " ");
						} else {
							System.out.print("-" + " ");
						}

					} else {
						if(ajedrez[i][j]==1) {
							System.out.print("A" + " ");
						} else if(ajedrez[i][j]==2) {
							System.out.print("*" + " ");
						} else {
							System.out.print("#" + " ");	
						}
						
					}
				}
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		for(int[] arr: ajedrez) {
			for(int elem: arr) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}





	}

}





