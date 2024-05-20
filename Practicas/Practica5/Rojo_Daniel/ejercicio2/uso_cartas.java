// Se importan los cosos que se utilizan 
// ICC, práctica 5
// Daniel Rojo Mata
// uso_cartas

// Se importan los cosos que se usan 
import java.util.Random;
import java.util.Arrays;

public class uso_cartas{

    // Se definen ciertos atributos que son de utilidad en algunos métodos
    int contador_pares;
    int contador_tercia;
    int contador_escalera;
    int contador_flor;

    // Se definen los gets
    public int get_contador_pares(){ return contador_pares; }
    public int get_contador_tercia(){ return contador_tercia; }
    public int get_contador_escalera(){ return contador_escalera; }
    public int get_contador_flor(){ return contador_flor; }

    // Se definen los sets
    public void set_contador_pares(int nuevo_par){ contador_pares = nuevo_par; }
    public void set_contador_tercia(int nuevo_tercia){ contador_tercia = nuevo_tercia; }
    public void set_contador_escalera(int nuevo_escalera){ contador_escalera = nuevo_escalera; }
    public void set_contador_flor(int nuevo_flor){ contador_flor = nuevo_flor; }



    // método que nos dice si hay una flor imperial en el mazo
    public void flor_imperial(String[] palos_cartas, String [] valores_cartas){    
        int contador_flor = 0;
        for(int i=1; i<valores_cartas.length; i++){
            // Se comprueba primero que los palos de las cartas sean todos los mismos
            if(palos_cartas[i].equals(palos_cartas[i-1])){
                // Si ya se tiene el palo, ahora se tienen que tener los valores: 1, 10, 11, 12, 13
                if( Arrays.asList(valores_cartas).contains("1") && Arrays.asList(valores_cartas).contains("10") && 
                Arrays.asList(valores_cartas).contains("11") && Arrays.asList(valores_cartas).contains("12") && Arrays.asList(valores_cartas).contains("13") )
                {
                    // Se agrega 1 al contador por cada valor anterior que exista en el mazo (esto pasa por el for)
                    contador_flor += 1;
                }
            }
        }
        
        this.set_contador_flor(contador_flor);

        if(contador_flor > 0){
             // Al ser la anterior una condicón que incluye: &&, se tienen que cumplir que existan los valores en el mazo, por lo que basta que contador sea mayor a cero-
            // para que exista la flor imperial
            System.out.println("Hay una flor imperial en tu juego");
            System.out.println();
        } 
    }


    // Método que nos dice si existe una escalera en el juego
    // En esencia la escalera consta de 5 valores consecutivos, es por ello que se busca la condición valor[i+1] - valor[i] = 1
    public void escalera(int[] valores_cartas_int){
        // Se ordenan los valores de las cartas
        Arrays.sort(valores_cartas_int);
        // Se crea un array con los valores de las cartas ordenados
        int[] valores_ordenados_int = valores_cartas_int;

        int contador_escalera=0;
        for(int i=1; i<valores_ordenados_int.length; i++){
            // Se busca la condición valor[i]-valor[i+1]=1
            if(valores_ordenados_int[i] - valores_ordenados_int[i-1] == 1){
                // Se agrega 1 al contador_escalera por cada ocasión que se cumpla la condición anterior
                contador_escalera+=1;
            }
        }

        this.set_contador_escalera(contador_escalera);

        // Puesto que hay 5 cartas se espera que haya 4 parejas en donde se cumpla la condición valor[i+1] - valor[i] = 1 en caso de existir una escalera
        if(contador_escalera==4){
            System.out.println("Hay una escalera en tu juego");
            System.out.println();
        }
    }

    
    // Método que nos dice si hay una tercia en el juego 
    public void tercia(int[] valores_cartas_int){
    // Se ordenan los valores de las cartas
    Arrays.sort(valores_cartas_int);
    // Se crea un array con los valores de las cartas ordenados
    int[] valores_ordenados_int = valores_cartas_int;
        // Se revisa que haya 3 elementos iguales de manera consecutiva 
        for(int i=1; i<valores_ordenados_int.length-1; i++){
            // Si hay 4 elementos consecutivos se rompe el ciclo, por lo que no se cuentan tercias que no son
            if(valores_ordenados_int[0] == valores_ordenados_int[1] && valores_ordenados_int [1] ==valores_ordenados_int[2]
            && valores_cartas_int[2]==valores_ordenados_int[3]){
                set_contador_tercia(0);
                break;
            }
            // Aquí ya solo existen 3 valores consecutivos
            else if(valores_ordenados_int[i] == valores_ordenados_int[i-1] && valores_ordenados_int[i+1] == valores_ordenados_int[i] )
            {
                set_contador_tercia(1);
            }
        }

        // Solo puede existir una tercia en el juego, por lo que si existe se agrega un valor al contador correspondiente
        if(this.get_contador_tercia()==1){
            System.out.println("Hay una tercia en tu juego");
            System.out.println();
        }
    }


    // Método que nos dice si existen pares en el juego
    public void par(int[] valores_cartas_int){
        // Se ordenan los valores de las cartas
        Arrays.sort(valores_cartas_int);
        // Se crea un array con los valores de las cartas ordenados
        int[] valores_ordenados_int = valores_cartas_int;

            // Esto es para saber si en el juego existe una tercia, de esta manera solo habría un par en el juego
            
            // Como primer caso, se ordenan los valores de las cartas
            // Este es el caso en que las primeras tres cartas conforman la tercia, ejemplo [7,7,7,1,2]
            if(valores_ordenados_int[0] == valores_ordenados_int[1] && valores_ordenados_int[1] == valores_ordenados_int[2] && get_contador_tercia()==1 ){
                // Las tres primeras cartas conforman la tercia
                // Ahora se revisa si las últimas dos cartas son las mismas, si lo son, hay un par
                if(valores_ordenados_int[3] == valores_ordenados_int[4]){
                    System.out.println("Hay un par en tu juego");
                    System.out.println();
                }
                System.out.println("Hay un par");
            }
            // Se revisa si la tercia está presente en los últimos 3 valores del mazo, ejemplo [1,2,7,7,7]
            else if(valores_ordenados_int[2] == valores_ordenados_int[3] && valores_ordenados_int[3] == valores_ordenados_int[4] && get_contador_tercia()==1){
                // Las tres últimas cartas conforman la tercia
                // Ahora se revisa si las primeras dos cartas son las mismas, si lo son, hay un par
                if(valores_ordenados_int[0]==valores_ordenados_int[1]){
                    System.out.println("Hay un par en tu juego");
                    System.out.println();
                }
            }
            // Se revisa si la tercia está compuesta por los números "de enmedio"
            // En este caso no puede existr un par, pues se tiene: [u,x,x,x,z], con u<x y x<z , esto por estar ordenados los valores
            else if(valores_ordenados_int[1] == valores_ordenados_int[2] && valores_ordenados_int[2] == valores_ordenados_int[3] && get_contador_tercia()==1){
                System.out.println();
            }

            // En este caso no existen tercias en el juego 
            if(contador_tercia==0){ 
                // Se comparan las cartas 2 a 2 para saber si son las mismas 
                int contador_pares=0;
                for(int i=1; i<valores_ordenados_int.length; i++){
                    if(valores_ordenados_int[i] == valores_ordenados_int[i-1]){
                        // Por cada par se agrega un valor al contador 
                        contador_pares +=1;
                    }
                }

                this.set_contador_pares(contador_pares);

                if(contador_pares==1){
                    System.out.println("Hay un par en tu juego");
                    System.out.println();
                }
                else if(contador_pares==2){
                    System.out.println("Hay dos pares en tu juego");
                    System.out.println();
                }
                else if(contador_pares==3){
                    System.out.println("Hay dos pares en tu juego");
                    System.out.println();
                }
            }
        }


        // Método que evalua la mano del usuario
        // Imprime en pantalla el tipo de juego que tenga el usuario
        public void evaluaMano(String[] palos_cartas, String [] valores_cartas,int[] valores_cartas_int){
            
            this.flor_imperial(palos_cartas, valores_cartas);
            this.escalera(valores_cartas_int);
            this.tercia(valores_cartas_int);
            this.par(valores_cartas_int);

            if(this.get_contador_escalera() !=4 && this.get_contador_flor() !=1 
            && (this.get_contador_pares()< 0 || this.contador_pares >3)
            && this.get_contador_tercia()==0){
                System.out.println("No tienes juego :( ");
                System.out.println();
            }
        }



        public static void main(String[] args){
        
        // // ######################################### CARTAS RANDOM ################################################# 

        // Lo siguiente es para generar cartas de manera aleatoria
        // Se pueden descomentar las líneas y el código funciona de igual manera 

        // String[] Palos = {"diamantes", "corazones", "treboles", "pikas"};
        // String[] Valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        
        // Random rand1 = new Random();
        // Random rand2 = new Random();
    
        // // Se hace un array en donde se guardas las cartas que se quiere
        // Carta[] mazo = new Carta [5];

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
        //     mazo[i] = new Carta(palo, valor);
        //     mazo[i].detalles();
        // }

        // ############################################################################################################# 

        
        
        // ######################################### CARTAS INTRODUCIDAS POR EL USUARIO ################################

        // El usuario eleige el valor de la carta y el palo de la misma 
        Carta carta1 = new Carta("pikas", "1");
        Carta carta2 = new Carta("pikas", "2");
        Carta carta3 = new Carta("pikas", "3");
        Carta carta4 = new Carta("pikas", "4");
        Carta carta5 = new Carta("pikas", "5");

        // Se guardan las cartas en un array
        Carta[] mazo = {carta1, carta2, carta3, carta4, carta5};

        // Esto es para ver los detalles de cada carta
        for(int i=0; i<mazo.length; i++){
            mazo[i].detalles();
        }

        // #################################################################

        // Se guardan los valores de cada carta, vistos como String, en un array para después comparar cada elemento y ver si existen las cosas que se piden 
        String[] valores_cartas = new String [mazo.length];
        // Los valores de cada carta se guardan como int 
        int[] valores_cartas_int = new int [mazo.length];
        // Se guardan los palos de cada carta en un array para su uso posterior 
        String[] palos_cartas = new String [mazo.length];
        // En este bucle se guardan los elementos según sea el caso 
        for(int i=0; i<mazo.length; i++){
            valores_cartas[i] = mazo[i].get_valor();
            valores_cartas_int[i] = Integer.parseInt(mazo[i].get_valor()); 
            palos_cartas[i] = mazo[i].get_palo();
        }

        // ################################################################3

        // Se crea un objeto de tipo uso_cartas() para llamar a los métodos
        uso_cartas juego = new uso_cartas();
        System.out.println();

        Arrays.sort(valores_cartas_int);
        System.out.println(Arrays.toString(valores_cartas_int));
        System.out.println();

        // Con esta línea se inicia el juego 
        juego.evaluaMano(palos_cartas, valores_cartas, valores_cartas_int);

    }
}