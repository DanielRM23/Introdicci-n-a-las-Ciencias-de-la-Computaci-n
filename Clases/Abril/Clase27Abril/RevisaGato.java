
public class RevisaGato {
	
	public static void main(String[] args) {
		

		int[][] gato = {{1,2,1}, {1,0,2}, {1,0,0}};

		int contadorJugador1=0;
		int contadorJugador2=0;


		for(int i=0; i<gato.length; i++) {
			for(int j=0; j<gato[i].length; j++) {
				if(gato[i][j]==1) {
					System.out.print("X ");
				} else if(gato[i][j]==2) {
					System.out.print("O ");
				} else {
					System.out.print("- ");
				}

			}
			System.out.println();
		}


		//Busqueda ganador diagonal superior izquierda 
		// a inferior der
		for(int i=0; i<gato.length; i++) {
			for(int j=0; j<gato[i].length; j++) {
				if(gato[i][j]==1 ) {
					contadorJugador1++;
				} else if(gato[i][j]==2 ) {
					contadorJugador2++;
				}

			}
		}

		if(contadorJugador1==3) {
			System.out.println("Gana el jugador 1 qiue tira con X victoria en diagonal");
		} 
		if(contadorJugador2==3) {
			System.out.println("Gana el jugador 2 qiue tira con O victoria en diagonal");
		} 


		//Buscar victoria de esquina superior derecha a inferior izquierda
		contadorJugador1=0;
		contadorJugador2=0;
		int longitudGato=gato.length-1;

		for(int i=0; i<gato.length; i++) {
			int renglon=longitudGato;
			int columna=i;
			if(gato[renglon][columna]==1 ) {
				contadorJugador1++;
			} else if(gato[renglon][columna]==2 ) {
				contadorJugador2++;
			}
			renglon--;
		}


		if(contadorJugador1==3) {
			System.out.println("Gana el jugador 1 qiue tira con X victoria en diagonal");
		} 
		if(contadorJugador2==3) {
			System.out.println("Gana el jugador 2 qiue tira con O victoria en diagonal");
		} 


		//Buscar victorias horizontales
		for(int i=0; i<gato.length; i++) {
			contadorJugador1=0;
			contadorJugador2=0;
			for(int j=0; j<gato[i].length; j++) {
				if(gato[i][j]==1 ) {
					contadorJugador1++;
				} else if(gato[i][j]==2 ) {
					contadorJugador2++;
				}

			}
			if(contadorJugador1==3) {
				System.out.println("Gana el jugador 1 qiue tira con X victoria horizontal");
			} 
			if(contadorJugador2==3) {
				System.out.println("Gana el jugador 2 qiue tira con O victoria horizontal");
			}	 

		}


		//Buscar victorias verticales
		for(int i=0; i<gato.length; i++) {
			contadorJugador1=0;
			contadorJugador2=0;
			for(int j=0; j<gato[i].length; j++) {
				if(gato[j][i]==1 ) {
					contadorJugador1++;
				} else if(gato[i][j]==2 ) {
					contadorJugador2++;
				}

			}
			if(contadorJugador1==3) {
				System.out.println("Gana el jugador 1 qiue tira con X victoria vertical");
			} 
			if(contadorJugador2==3) {
				System.out.println("Gana el jugador 2 qiue tira con O victoria vertical");
			}	 

		}

	}

}
