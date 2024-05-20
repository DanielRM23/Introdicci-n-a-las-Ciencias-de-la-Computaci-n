// ICC, práctica 2
// Daniel Rojo Mata
// Piedra, papel, tijeras, lagarto o spock

// Se importan las clases que se usarán 
import java.util.Scanner;
import java.util.Random; 

public class PiedraPapelTijeraLagartoSpock{
    public static void main(String[] args){

        //Se instancian objetos de la clase Scannner
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random(); 

        // Se asocian números a los elementos del juego de la siguiente manera
        // 0-> Piedra, 1-> Papel, 2-> Tijera, 3-> Lagarto, 4-> Spock
        int a = rand.nextInt(5);

        // Mensaje que se muestra en la pantalla
        System.out.println("Que quieres escoger:");
        System.out.println("0. Piedra");
        System.out.println("1. Papel");
        System.out.println("2. Tijera");
        System.out.println("3. Lagarto");
        System.out.println("4. Spock");

        // Opción que elige la persona que juega
        int b = entrada.nextInt();

        // Se inicia el juego 
        if (b <= 4 && b>=0){

            // Las elecciones que puede tener la persona con base a la asociación de números
            if (b==0){System.out.println("Tu elección es: 🪨"); }
            else if(b==1){System.out.println("Tu elección es: ✋");}
            else if(b==2){System.out.println("Tu elección es: ✄");}
            else if(b==3){System.out.println("Tu elección es: 🦎");}
            else{System.out.println("Tu elección es: 🖖");}
            
            // Elecciones de la PC
            if (a==0){System.out.println("La elección PC es: 🪨"); }
            else if(a==1){System.out.println("La elección PC es: ✋");}
            else if(a==2){System.out.println("La elección PC es: ✄");}
            else if(a==3){System.out.println("La elección PC es: 🦎");}
            else{System.out.println("La elección PC es: 🖖");}

            // Opciones para ganar 
            if (
                //Piedra aplasta tijeras
                (b == 0 && a == 2)||
                //Papel envuelve piedra
                (b == 1 && a == 0)||
                //Tijera corta papel
                (b == 2 && a == 1)||
                //Piedra aplasta lagarto 
                (b == 0 && a == 3)||
                //Lagarto envenena Spock
                (b == 3 && a == 4)||
                //Spock rompe tijera 
                (b == 4 && a == 2)||
                //Tijera decapita lagarto
                (b == 2 && a == 3)||
                //Lagarto devora papel
                (b == 3 && a == 1)||
                //Papel desautoriza Spock
                (b == 1 && a == 4)||
                //Spock vaporiza piedra
                (b == 4 && a == 0)
                ){
                System.out.println("\n¡Ganaste! 🤟");
            }
            // Aquí hay empate 
            else if(b == a){
              System.out.println("\nEmpate");
            }
            // Aquí se pierde el juego 
            else{
              System.out.println("\n¡Perdiste! 😞");
            }
        }
        
    }

}