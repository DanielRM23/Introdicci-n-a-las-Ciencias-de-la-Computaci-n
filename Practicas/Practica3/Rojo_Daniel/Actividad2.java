// ICC, práctica 3
// Daniel Rojo Mata
// Cuadrado hueco con digonal

// Se importan los cosos que se usan 
import java.util.Scanner;
 
public class Actividad2 {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el tamaño del cuadrado: \n");
        int tamanio_cuadrado = teclado.nextInt();
        
     
        for(int i = 0; i <= tamanio_cuadrado-1 ; i++) {
            System.out.print("*");
            for(int j = 0; j <= tamanio_cuadrado ; j++) {
                System.out.print(" ");
                if(i==j+1|| i == 0 || i == tamanio_cuadrado-1)
                {System.out.print("*"); }
            }   
            System.out.println("*");
        }
        
        System.out.println("\n");        
 
    }
}
