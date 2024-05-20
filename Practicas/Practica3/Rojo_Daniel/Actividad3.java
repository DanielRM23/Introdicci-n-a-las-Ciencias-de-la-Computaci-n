// ICC, práctica 3
// Daniel Rojo Mata
// Adivinar un número 

// Se importan los cosos que se van a usar 
import java.util.Scanner; 
import java.util.Random; 

public class Actividad3{
    public static void main(String[] args){

        // Se genera un objeto de tipo scanner 
        Scanner entrada = new Scanner(System.in);
        // Se genera un objeto de tipo random 
        Random aleatorio = new Random();
        // Estos son los intentos que tiene el jugador para ganar 
        int intentos_restantes = 4;
        // Estos son los intentos que se muestran en pantalla
        int intentos_restantes_2 = 5;

        // Número aleatorio que elige la computadora entre 0 y 100
        int numero_computadora = aleatorio.nextInt(100);

        // Uso esta bandera para indicarle al ciclo while cuando terminar
        // El ciclo while termina cuando la bandera se convierta en false
        Boolean bandera = true;


        // Comienza el juego
        while(bandera){
            System.out.println("*************************************");
            System.out.println("\n Adivina el número entre 0 y 100 \n");
            // El usuario selecciona un número 
            int numero_usuario = entrada.nextInt();
            System.out.println("\nEl número que elegiste es: " + numero_usuario + "\n");
            
            // Aquí se gana el juago
            if (numero_computadora == numero_usuario){
                System.out.println("¡Ganasteeee! 😎 \n");
                // Si se gana el juego, bandera cambia a false, por ello se termina el ciclo
                bandera = false;
            }
            //Si no se gana en lo anterior el juego continua
            else if (0< intentos_restantes){
                System.out.println("No le atinaste, vuelve a intentar\n");
                //Cada vez que se pierde se resta 1 a los intentos restantes (y a los que salen en pantalla)
                intentos_restantes--;
                intentos_restantes_2--;

                System.out.println("Tienes " + intentos_restantes_2 + " intentos 🫣\n");
                
                // Se le brinda ayuda al usuario para saber si el número elegido por la compu es mayor o menor al que eligió
                if(numero_computadora > numero_usuario){
                    System.out.println("Tip: el número es más grande\n");
                }
                else{
                    System.out.println("Tip: el número es menor\n");
                }
            }
            // Se acaban los intentos y se pierde el juego
            else{
                System.out.println("Ya no tienes más intentos 😖");
                System.out.println("Perdiste 😔\n");
                // bandera cambia a false y se acaba el ciclo
                bandera = false; 
            }
        }
        // Se imprime el número que eligió la compu
        System.out.println("El número que eligió la compu 🤖 es " + numero_computadora); 

    }

}