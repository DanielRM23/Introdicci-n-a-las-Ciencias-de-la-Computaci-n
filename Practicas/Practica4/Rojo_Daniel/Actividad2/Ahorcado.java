// ICC, práctica 4
// Daniel Rojo Mata
// Ahorcado

// Se importan los cosos que se van a utilizar
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Ahorcado{

    public static void main(String[] args) {
        
        // Se crea un objeto de tipo persona
        // Esto es para que se pueda ver el muñequito del juego
        persona munieco = new persona();

        // Estas son las palabras con las que se jugará
        String[] words = {"perro", "gato", "elefante", "jirafa", "cocodrilo", "ballena"};
        
        // Número de palabras que hay 
        int longitud_words = words.length;

        // Se elige un número al azar para después elegir una de las palabras en words
        Random rand1 = new Random();

        // Se fija un índice entre 0 y el número de palabras que hay
        // Se elige de forma aleatoria el índice
        int indice = rand1.nextInt(longitud_words);
        // Con ayuda del índice se elige una palabra de words
        String palabra_elegida = words[indice]; 

        // Se crea un array vacío en donde se irán guardando las letras correctas
        // Como primer caso, se agregan tantos "_" como letras haya en la palabra que se haya elegido anteriormente
        ArrayList<Character> lista_guiones = new ArrayList<Character>();
        for(int i=0; i< palabra_elegida.length(); i++){
            lista_guiones.add('_');
        }

        // Esta variable es para que en cierto momento se pueda detener el juego (el ciclo while)
        boolean continua_juego = true;

        System.out.println("\nTienes 6 vidas para encontrar la palabra escondida 👀 \n");
        System.out.println("RECUERDA: Cada vez que no aciertes una letra pierdes una vida 👻 \n");
        System.out.println("Cada vez que pierdes una vida aparecerá una parte del muñeco 🧍 \n");

        //Solo hay 6 intentos por como está definido el muñequito
        int vidas = 6;

        // Se inicia el juego 
        while(continua_juego && vidas <=6){

            System.out.println("###########################################\n");

            System.out.println("Esta es la palabra: \n");
            System.out.println(lista_guiones);
            System.out.println("\n");

            //Esto es para ver el estado del muñequito
            munieco.imprimir_personaje(vidas);
            System.out.println("\n###########################################\n");

            System.out.println("VIDA NÚMERO: " + vidas + "\n");
            // Se genera un objeto de tipo scanner
            Scanner entrada_usuario = new Scanner(System.in);
            System.out.println("Introduce una letra: \n");

            // Esto es para que la entrada sea un char
            char letra = entrada_usuario.next().charAt(0);
            // La letra que ingresa el usuario se convierte en miníscula en caso de que haya sido mayúscula
            char letra_minuscula = Character.toLowerCase(letra);
            System.out.println("\nLa letra introducida es: " + letra + "\n");

            // Si la letra que ingresó el usuario está en la palabra se sustituye y quita los "_"
            for(int i=0; i< palabra_elegida.length(); i++){
                if(letra_minuscula == palabra_elegida.charAt(i)){
                    lista_guiones.set(i, letra_minuscula);
                }
            }

            // Si la letra que se ingresa no está en la palabra se pierde una vida
            if(!palabra_elegida.contains(String.valueOf(letra_minuscula))){
                vidas += -1;
                System.out.println("Ups, pierdes una vida 😿 \n");
                // Si las vidas son 0 el juego se detiene
                if(vidas==0){
                    continua_juego = false;
                    System.out.print("\nSe acabaron tus vidas ☠\n");
                }
            }
            
            // Si ya no hay "_" quiere decir que se ha ganado el juego 
            if(!lista_guiones.contains('_')){
                System.out.println("\nG A N A S T E\n");
                continua_juego = false;
            }
        }
    }
}