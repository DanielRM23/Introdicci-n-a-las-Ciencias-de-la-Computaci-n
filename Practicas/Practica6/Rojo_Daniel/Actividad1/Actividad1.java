// ICC, práctica 6
// Daniel Rojo Mata
// Actividad 1. Simulación de la carrera de la tortuga y la liebre.

// Se imprimen los cosos que se utilizan 
import java.util.Random;

public class Actividad1{

    public static void main(String[] hola) {

        // Se definen los array de cada animal
        int[] pasos_tortuga = new int[80];
        int[] pasos_conejo = new int[80];
      
        // Empieza la carrera desde 0
        int posicion_tortuga = 0;
        int posicion_conejo = 0;

        // Se coloca en la posición 0 de cada array un "1" para indicar en donde está el animal
        pasos_tortuga[posicion_tortuga] = 1;
        pasos_conejo[posicion_conejo] = 1; 

        // Se hace un ciclo que termina cuando algunos de los animales ha llegado a la posición 70 (o más)
        while(posicion_tortuga <= 70 && posicion_conejo <=70){
            
            // Se generan los números aleatorios de cada animal
            Random random1 = new Random();
            Random random2 = new Random();

            // Se eligen números del 1 al 10
            int numero_aleatorio_tortuga = random1.nextInt(10) + 1;
            int numero_aleatorio_conejo = random2.nextInt(10) + 1;

            // Estos son los cosos de la tortuga
            // Con proba de 50% avanza 3 espacios
            if( numero_aleatorio_tortuga>=1 && numero_aleatorio_tortuga <=5 ){
                posicion_tortuga += 3;
                pasos_tortuga[posicion_tortuga]=1;
            }
            // Con proba del 30% avanza 1 espacio
            else if( numero_aleatorio_tortuga>=6 && numero_aleatorio_tortuga <=8 ){
                posicion_tortuga +=1;
                pasos_tortuga[posicion_tortuga]=1;
            }
            else{
                // Con proba del 20% retrocede 6 posiciones 
                posicion_tortuga -=6;
                
                // En caso de la tortuga retroceda y el valor 'posicion_tortuga' sea menor que cero, se regresa a la posición incial
                if(posicion_tortuga<0){
                    posicion_tortuga = 0;
                    pasos_tortuga[posicion_tortuga] = 1;
                }
                // En caso de que no sea negativo el valor 'posicion_tortuga' se escribe "1" en la posición
                else{
                    pasos_tortuga[posicion_tortuga] =1;
                }

            }
            
            // Estos son los cosos del conejo 
            // El conejo se duerme
            if(numero_aleatorio_conejo==1 || numero_aleatorio_conejo == 2){
                posicion_conejo += 0;
                pasos_conejo[posicion_conejo] = 1;
            }
            // El conejo da un gran salto
            else if(numero_aleatorio_conejo==3 || numero_aleatorio_conejo == 4){
                posicion_conejo += 9;
                pasos_conejo[posicion_conejo] =1;
            }
            // El conejo da un gran resbalón
            else if( numero_aleatorio_conejo == 5){
                posicion_conejo -= 12;                                
                // En caso de que el conejo retroceda y el valor 'posicion_conejo' sea menor que cero, se regresa a la posición incial
                if(posicion_conejo<0){
                    posicion_conejo = 0;
                    pasos_conejo[posicion_conejo] = 1;
                }
                else{
                    // En caso de que no sea negativo el valor 'posicion_conejo' se escribe "1" en la posición
                    pasos_conejo[posicion_conejo] =1;
                }
            }
            // pequeño salto
            else if(numero_aleatorio_conejo <= 8 && numero_aleatorio_conejo >= 6){
                posicion_conejo += 1;
                pasos_conejo[posicion_conejo] =1;
            }
            //pequeño resbalón
            else{
                posicion_conejo -= 2;
                // En caso de que el conejo retroceda y el valor 'posicion_conejo' sea menor que cero, se regresa a la posición incial
                if(posicion_conejo<0){
                    posicion_conejo = 0;
                    pasos_conejo[posicion_conejo] = 1;
                }
                else{
                    // En caso de que no sea negativo el valor 'posicion_conejo' se escribe "1" en la posición
                    pasos_conejo[posicion_conejo] =1;
                }
            
            }
                
            // En este caso la tortuga gana la carrera
            if(posicion_tortuga>=70 && posicion_conejo < 70){
                //System.out.println("numero aleatorio: " + numero_aleatorio_tortuga);
                System.out.println("La tortuga está en la casilla: " + (posicion_tortuga+1));
                System.out.println("La tortuga gana la carrera");
                break;
            }
            // Gana el conejo
            else if(posicion_tortuga<70 && posicion_conejo >= 70){
                //System.out.println("numero aleatorio: " + numero_aleatorio_conejo);
                System.out.println("El conejo está en la casilla: " + (posicion_conejo+1));
                System.out.println("El conejo gana la carrera");
                break;
            }
            // Hay un empate
            else if(posicion_tortuga>=70 && posicion_conejo >= 70){
                System.out.println("La tortuga está en la casilla: " + (posicion_conejo+1));
                System.out.println("El conejo está en la casilla: " + (posicion_conejo+1));
                System.out.println("Hay un empate");
                break;
            }

        }

        // Se imprimen las posiciones finales de los animales 
        System.out.println("La tortuga terminó en la casilla: " + (posicion_tortuga));
        System.out.println("El conejo terminó en la casilla: " + (posicion_conejo));   

    }

}