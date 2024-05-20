// ICC, práctica 3
// Daniel Rojo Mata
// Piedra, papel, tijeras, hasta que haya ganador

// Se importan las clases que se usarán 
import java.util.Scanner;
import java.util.Random; 

public class Actividad1{
    public static void main(String[] args){

        //Se instancian objetos de la clase Scannner
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random(); 
        
        boolean continuar_juego = true;

        // Se inicia el juego 
        while(continuar_juego){

            // Mensaje que se muestra en la pantalla
            System.out.println("\n*********************************************");
            System.out.println("Que quieres escoger:\n");

            // Se asocian números a los elementos del juego de la siguiente manera
            // 0-> Piedra, 1-> Papel, 2-> Tijera
            System.out.println("0. Piedra");
            System.out.println("1. Papel");
            System.out.println("2. Tijera");

            int a = rand.nextInt(2);

            // Opción que elige la persona que juega
            int b = entrada.nextInt();       

            // Las elecciones que puede tener la persona con base a la asociación de números
            if (b==0){System.out.println("Tu elección es: 🪨"); }
            else if(b==1){System.out.println("Tu elección es: ✋");}
            else{System.out.println("Tu elección es: ✄");}
            
            // Elecciones de la PC
            if (a==0){System.out.println("La elección PC es: 🪨"); }
            else if(a==1){System.out.println("La elección PC es: ✋");}
            else{System.out.println("La elección PC es: ✄");}

            // Opciones para ganar             
            if ( (b == 0 && a == 2) || (b == 1 && a == 0) || (b == 2 && a == 1) )
                {
                System.out.println("\n¡Ganaste! 🤟");
                continuar_juego = false;
                }
            // Aquí hay empate 
            else if(b == a)
            {
              System.out.println("\nE M P A T E");
              System.out.println("Vuelve a intentar \n");
            } 

            // Aquí se pierde el juego 
            else{
              System.out.println("\n¡Perdiste! 😞");
              continuar_juego = false;
            }
        }
        
    }

}