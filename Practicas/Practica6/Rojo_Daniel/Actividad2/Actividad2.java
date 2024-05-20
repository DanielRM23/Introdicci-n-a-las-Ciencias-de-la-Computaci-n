// ICC, práctica 6
// Daniel Rojo Mata
// Actividad 2. Ajedrez.

// Se importan los cosos que se utilizan 
import java.util.Random;

public class Actividad2 {
    public static void main(String[] args) {
        int[][] ajedrez = new int[8][8];

        Random aleatorios = new Random();

        // Se coloca la torre en una posición aleatoria del tablero
        // Se escribe un '1' cuando se coloca la pieza
        int x_torre = aleatorios.nextInt(8);
        int y_torre = aleatorios.nextInt(8);
        ajedrez[x_torre][y_torre] = 1;

        // Se coloca el caballo en una posición aleatoria del tablero
        // Se escribe un '2' cuando se coloca la pieza
        int x_caballo = aleatorios.nextInt(8);
        int y_caballo = aleatorios.nextInt(8);
        ajedrez[x_caballo][y_caballo] = 2;

        // Esto se utiliza para ver las casilla repetidas
        boolean[][] repetidas = new boolean[8][8];

        for (int i = 0; i < ajedrez.length; i++) {
            for (int j = 0; j < ajedrez[i].length; j++) {
                // Se verifica si la posición (i, j) coincide con la fila o columna de la torre (x_torre o y_torre)         
                if (i == x_torre || j == y_torre) {
                    if (ajedrez[i][j] != 1) {
                        // Si la posición está vacía (ajedrez[i][j] == 0), se marca con el valor 3, indicando la presencia del marcador de la torre.
                        if (ajedrez[i][j] == 0) {
                            // Marcador de torre
                            ajedrez[i][j] = 3; 
                        } else {
                            //si la posición está ocupada por otra pieza, se marca como repetida en repetidas.
                            repetidas[i][j] = true;
                        }
                    }
                }

                // La expresión (Math.abs(i - x_caballo) == 2 se utiliza para determinar si la posición (i, j) en el tablero está a una distancia de 2 ...
                // ... casillas horizontalmente y 1 casilla verticalmente o viceversa
                if ((Math.abs(i - x_caballo) == 2 && Math.abs(j - y_caballo) == 1) ||
                        (Math.abs(i - x_caballo) == 1 && Math.abs(j - y_caballo) == 2)) {

                    if (ajedrez[i][j] != 2) {
                        if (ajedrez[i][j] == 0) {
                            // Marcador de caballo
                            ajedrez[i][j] = 4; 
                        } else {
                            //si la posición está ocupada por otra pieza, se marca como repetida en repetidas.
                            repetidas[i][j] = true;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < ajedrez.length; i++) {
            for (int j = 0; j < ajedrez[i].length; j++) {
                // Se comprueba si la posición (i, j) está marcada como repetida en repetidas. Si es así, se imprime "$" 
                if (repetidas[i][j]) {
                    System.out.print("$" + " ");
                } 
                // Si no está marcada como repetida: 
                else {
                    //Si el valor es 1, se imprime "T" para la torre
                    if (ajedrez[i][j] == 1) {
                        System.out.print("T" + " ");
                    } 
                    // Si el valor es 2, se imprime "C" para el caballo.
                    else if (ajedrez[i][j] == 2) {
                        System.out.print("C" + " ");
                    } 
                    // Si el valor es 3, se imprime "*" para el marcador de la torre
                    else if (ajedrez[i][j] == 3) {
                        System.out.print("*" + " ");
                    } 
                    // Si el valor es 4, se imprime "+" para el marcador del caballo 
                    else if (ajedrez[i][j] == 4) {
                        System.out.print("+" + " ");
                    } 
                    // Si el valor es 0, se imprime "-" para indicar una casilla vacía
                    else {
                        System.out.print("-" + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
