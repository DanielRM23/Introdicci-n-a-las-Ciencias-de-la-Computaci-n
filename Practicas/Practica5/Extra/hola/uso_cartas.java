
// Se importan los cosos que se utilizan 

import java.util.Random;
import java.util.Arrays;

public class uso_cartas{

    public static void main(String[] args){
        
        // String[] Palos = {"diamantes", "corazones", "treboles", "pikas"};
        // String[] Valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        
        // Random rand1 = new Random();
        // Random rand2 = new Random();
    
        // // Se hace un array en donde se guardas las cartas que se quiere
        // Cartas[] mazo = new Cartas [5];

        // // ######################################### CARTAS RANDOM ################################################# 

        // for(int i=0; i<mazo.length; i++){
        //     //String palo = "diamantes";
        //     //String valor = "A"

        //     // Se elige un número aleatorio entre 0 y 3
        //     int indice_palos = rand1.nextInt(Palos.length);
        //     // Se elige de manera aleatoria un palo de la baraja
        //     String palo = Palos[indice_palos];

        //     int indice_valores = rand2.nextInt(Valores.length);
        //     String valor = Valores[indice_valores];

        //     // Se guardan las cartas en el array llamado mazo
        //     mazo[i] = new Cartas(palo, valor);
        //     mazo[i].detalles();
        // }

        // ######################################### CARTAS RANDOM ################################################# 

        Cartas carta1 = new Cartas("corazones", 2);
        Cartas carta2 = new Cartas("treboles", 2);
        Cartas carta3 = new Cartas("pikas", 1);
        Cartas carta4 = new Cartas("corazones", 6);
        Cartas carta5 = new Cartas("diamantes", 2);

        Cartas[] mazo = {carta1, carta2, carta3, carta4, carta5};

        for(int i=0; i<mazo.length; i++){
            mazo[i].detalles();
        }

        // Se guardan los valores de cada carta en un array para después comparar cada elemento y ver si existen las cosas que se piden 
        int[] valores_cartas_elegidas = new int [mazo.length]; 
        
        for(int i=0; i<mazo.length; i++){
            valores_cartas_elegidas[i] = mazo[i].get_valor();
            System.out.println(valores_cartas_elegidas[i]);
        }

        Arrays.sort(valores_cartas_elegidas);

        int contador = 1;
        for(int i = 1; i < valores_cartas_elegidas.length; i++){
            if(valores_cartas_elegidas[i] == valores_cartas_elegidas[i - 1]){
                contador++;
            } 
            else{
                if(contador > 1){
                    System.out.println(valores_cartas_elegidas[i - 1] + " se repite " + contador + " veces");
                }
                contador = 1;
            }
        }
        if(contador > 1){
            System.out.println(valores_cartas_elegidas[valores_cartas_elegidas.length - 1] + " se repite " + contador + " veces");
        }


        
    }
}