// ICC, práctica 4
// Daniel Rojo Mata
// Dinosaurios

import java.util.Random;

// Se define la clase
public class Dinosaurio{

    //Se definen los atributos

    String nombre;
    // El tipo es carnívoro o herbívoro
    String tipo;
    // El hábitat es caluroso, templado o frío
    String habitat;
    // La energía es un valor de 0 a 100
    int energia; 

    // Se define el método constructor 

    public Dinosaurio(String nombre, String tipo, String habitat, int energia){
        this.nombre = nombre;
        this.tipo = tipo;
        this.habitat = habitat;
        this.energia = energia;
    }

    // Se definen los gets
    
    public String get_nombre(){return nombre; }
    public String get_tipo(){return tipo; }
    public String get_habitat(){return habitat; }
    public int get_energia(){return energia; }

    // Se definen los sets

    public void set_nombre(String nuevo_nombre){ nombre = nuevo_nombre; }
    public void set_tipo(String nuevo_tipo){ tipo = nuevo_tipo; }
    public void set_habitat(String nuevo_habitat){ habitat = nuevo_habitat; }
    public void set_energia(int nueva_energia){ energia = nueva_energia; }


    // Método toString para que se impriman las caracteísticas de nuestro dinosaurio
    public String toString(){
        String cadena = "";
        cadena += "El nombre de tu dinosaurio es: \t" + nombre + "\n";
        cadena += "El tipo de tu dinosaurio es: \t" + tipo + "\n";
        cadena += "El habitat de tu dinosaurio es: \t" + habitat + "\n";
        cadena += "La energia de tu dinosaurio es: \t" + energia + "\n";
        return cadena;
    }

    // SE DEFINEN LOS MÉTODOS


    // La energía se eleva a 100
    public void comer(){ 
        System.out.println("Tu dinosaurio ha ingerido comida, ahora su energía se eleva a 100  \n 💪");     
        this.set_energia(100); 
    }


    // ************************************** AQUÍ EMPIEZA EL MÉTODO 'CAMBIAR CLIMA' **************************************

    // Se define un número aleatorio 
    Random rand1 = new Random();
    
    public void cambiar_clima(){

        // Se toma un número aleatorio entre 0 y 40
        int temp_aleatoria = rand1.nextInt(41);
        System.out.println("********************************************************************************************** \n");
        System.out.println("El clima cambió, por lo que la temperatura nueva que hay en el ambiente es: " + temp_aleatoria + "\n");
        System.out.println("Si la temperatura es un valor entre 0 y 10, los dinosaurios frios 🧊 no sufren afectaciones.");   
        System.out.println("Si la temperatura es un valor entre 11 y 25, los dinosaurios templados 💨  no sufren afectaciones.");     
        System.out.println("Si la temperatura es un valor entre 26 y 40, los dinosaurios calurosos 🔥 no sufren afectaciones. \n");

        // Si 0<= num_aleatorio <=10, los dinosaurios frios no tienen efecto en la energía
        if(temp_aleatoria >= 0 && temp_aleatoria <= 10){ 
            if(this.habitat != "frio"){
                System.out.println("El cambió de temperatura hace que la energía de tu dinosaurio disminuya 30 unidades. \n");
                int energia_restante = this.energia - 30;
                set_energia(energia_restante);
            }
            else{
                System.out.println("El cambio de temperatura no afectó a tu dinosaurio 🦕 \n");
            }
        }
        // Si 11<= num_aleatorio <=25, los dinosaurios templados no tienen efecto en la energía
        else if(temp_aleatoria >= 11 && temp_aleatoria <= 25){ 
            if(this.habitat != "templado"){
                System.out.println("El cambió de temperatura hace que la energía de tu dinosaurio disminuya 30 unidades. \n");
                int energia_restante = this.energia - 30;
                set_energia(energia_restante);
            }
            else{
                System.out.println("El cambio de temperatura no afectó a tu dinosaurio 🦕 \n");
            }
        }
        // Si 0<= num_aleatorio <=10, los dinosaurios calurosos no tienen efecto en la energía
        else{ 
            if(this.habitat != "caluroso"){
                System.out.println("El cambió de temperatura hace que la energía de tu dinosaurio disminuya 30 unidades. \n");
                int energia_restante = this.energia - 30;
                set_energia(energia_restante);
            }
            else{
                System.out.println("El cambio de temperatura no afectó a tu dinosaurio 🦕 \n");
            }
        }
        System.out.println("********************************************************************************************** \n");

    }
    
    // ************************************** AQUÍ TERMINA EL MÉTODO 'CAMBIAR CLIMA' **************************************



    // ************************************** AQUÍ EMPIEZA EL MÉTODO 'AFRONTAR' **************************************

    // Se define un número aleatorio 
    Random rand2 = new Random();
    // Se toma un número aleatorio entre 0 y 10
    int proba_ataque = rand2.nextInt(10);

    public void afrontar(Dinosaurio d){
        // Si el tipo de los dinosaurios es el mismo, entonces no hay enfrentamiento
        if(this.tipo == d.tipo){
            System.out.println("********************************************************************************************** \n");
            System.out.println("Los dinosaurios del mismo tipo no se enfrentan por ser compis 🫶 \n");
            System.out.println("********************************************************************************************** \n");
        }
        // Si el tipo de lo dinosaurios es distinto, hay un enfrentamiento
        else{
            System.out.println("********************************************************************************************** \n");
            System.out.println("Los dinosaurios que no son de mismo tipo se deben enfrentar, lo dice la naturaleza 🥊\n");
            System.out.println("El dinosaurio " + this.get_nombre() + " afronta a " + d.get_nombre() + "\n");
            System.out.println("********************************************************************************************** \n");

            // Hay un 60% de probabilidad de que el dinosaurio "this" inicie la pelea
            if(proba_ataque<=5){
                System.out.println("**********************************************************************************************");
                System.out.println("El dinosaurio de nombre " + this.nombre + " ha empezado la pelea 😤");
                System.out.println("********************************************************************************************** \n");
                this.pelear(d);
            }
            // Hay un 40% de probabilidad de que el dinosaurio "d" inicie la pelea
            else{
                System.out.println("**********************************************************************************************");
                System.out.println("El dinosaurio de nombre: " + d.nombre + " ha empezado la pelea 😤");
                System.out.println("********************************************************************************************** \n");
                d.pelear(this);
            }
        }
    }

    // ************************************** AQUÍ TERMINA EL MÉTODO 'AFRONTAR' **************************************
    

    
    // ************************************** AQUÍ EMPIEZA EL MÉTODO 'PELEAR' **************************************

    // Se definen números aleatorios 
    Random rand3 = new Random();
    Random rand4 = new Random();

    // Número de rondas que hay en la pelea
    int numero_rondas = 5;

    public void pelear(Dinosaurio d){

        // Se usa bandera para poder acabar el ciclo en cierto momento, en particular, cuando ésta es falsa
        // El ciclo se detiene cuando un dinosaurio tiene una enegía menor o igual a cero o cuando se acaban las rondas de la pelea
        boolean bandera = true; 

        // Camienza la pelea
        while(numero_rondas <= 5 && bandera){

            System.out.println("\n EMPIEZA LA RONDA " + numero_rondas + "\n");

            // Se toma un número aleatorio entre 0 y 1
            // 0: representa un golpe débil
            // 1: representa un golpe fuerte
            int tipo_golpe = rand2.nextInt(2);

            // Se toma un número aleatorio entre 0 y 1
            // 0: el dinosaurio 'this' pega a 'd'
            // 1: el dinosaurio 'd' pega a 'this'
            int quien_pega = rand3.nextInt(2);

            // Este bloque es para ver quien pega primero en la primer ronda
            // El dinosaurio que sea de tipo "carnivoro" es el que debe pegar primero
            // Se consieran los casos en que el dinosaurio "this" pega primero o el dinosaurio "d" lo hace
            // Se genera un número entre 0 y 1, llamado 'tipo_golpe' para saber si se da un golpe débil o fuerte
            if(numero_rondas == 5){

                if(this.tipo == "carnivoro"){
                    // 0: golpe débil
                    if(tipo_golpe == 0){
                        System.out.println("El dinosaurio "+ this.get_nombre() + " da un golpe débil a " + d.get_nombre() );
                        // Resta 5 puntos a la energía por ser golpe débil
                        int energia_restada_pelea = d.energia - 5;
                        d.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + d.get_nombre() + " ahora es " + d.get_energia() );
                    }                    
                    // 1: golpe fuerte 
                    else{    
                        System.out.println("El dinosaurio " + this.get_nombre() + " da un golpe fuerte a " + d.get_nombre() );
                        // Resta 12 puntos a la energía por ser golpe fuerte
                        int energia_restada_pelea = d.energia - 12;
                        d.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + d.get_nombre() + " ahora es " + d.get_energia() );
                    }
                }
                else if(d.tipo == "carnivoro"){
                    // 0: golpe débil
                    if(tipo_golpe == 0){
                        System.out.println("El dinosaurio " + d.get_nombre() + " da un golpe débil a " + this.get_nombre() );
                        // Resta 5 puntos a la energía por ser golpe débil
                        int energia_restada_pelea = this.energia - 5;
                        this.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + this.get_nombre() + " es " + this.get_energia() );
                    }
                    // 1: golpe fuerte
                    else{
                        System.out.println("El dinosaurio " + d.get_nombre() + " da un golpe fuerte a " + this.get_nombre() );
                        // Resta 12 puntos a la energía por ser golpe fuerte
                        int energia_restada_pelea = this.energia - 12;
                        this.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + this.get_nombre() + " es " + this.get_energia() );
                    }
                }
            }

            // Este bloque representa el combate entre los dinosuarios
            // Se elige un número entre 0 y 1, llamado 'quien_pega' para saber qué dinosaurio pegará
            // 0: el dinosaurio 'this' pega a 'd'
            // 1: el dinosaurio 'd' pega a 'this'
            // Se genera un número entre 0 y 1, llamado 'tipo_golpe' para saber si se da un golpe débil o fuerte
            if(numero_rondas<=4){
                // 0: el dinosaurio 'this' pega a 'd'
                if(quien_pega==0){
                    if(tipo_golpe == 0){
                            System.out.println("El dinosaurio "+ this.get_nombre() + " da un golpe débil a " + d.get_nombre() );
                        // Resta 5 puntos a la energía por ser golpe débil
                        int energia_restada_pelea = d.energia - 5;
                        d.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + d.get_nombre() + " es " + d.get_energia() );
                        // La energía del dinosaurio "this" es menor o igual a cero, es por ello que se debe detenera la pelea
                        if(this.energia <= 0){
                            System.out.println("La energia de " + this.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n ");
                        }
                        // La energía del dinosaurio "d" es menor o igual a cero, es por ello que se debe detenera la pelea
                        else if(d.energia <= 0){
                            System.out.println("La energia de " + d.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n");
                        }
                    }
                    // 1: golpe fuerte 
                    else{    
                        System.out.println("El dinosaurio "+ this.get_nombre() + " da un golpe fuerte a " + d.get_nombre() );
                        // Resta 12 puntos a la energía por ser golpe fuerte
                        int energia_restada_pelea = d.energia - 12;
                        d.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + d.get_nombre() + " es " + d.get_energia() + "\n"  );
                        // La energía del dinosaurio "this" es menor o igual a cero, es por ello que se debe detenera la pelea
                        if(this.energia <= 0){
                            System.out.println("La energia de " + this.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n");
                        }
                        // La energía del dinosaurio "d" es menor o igual a cero, es por ello que se debe detenera la pelea
                        else if(d.energia <= 0){
                            System.out.println("La energia de " + d.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n");
                        }
                    }   
                }
                
                // 1: el dinosaurio 'd' pega a 'this'
                else if(quien_pega==1){
                    if(tipo_golpe == 0){
                        System.out.println("El dinosaurio "+ d.get_nombre() + " da un golpe débil a " + this.get_nombre() );
                        // Resta 5 puntos a la energía por ser golpe débil
                        int energia_restada_pelea = this.energia - 5;
                        this.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + this.get_nombre() + " es " + this.get_energia() + "\n" );
                        // La energía del dinosaurio "this" es menor o igual a cero, es por ello que se debe detenera la pelea
                        if(this.energia <= 0){
                            System.out.println("La energia " + this.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n");
                        }
                        // La energía del dinosaurio "d" es menor o igual a cero, es por ello que se debe detenera la pelea
                        else if(d.energia <= 0){
                            System.out.println("La energia de " + d.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n");
                        }
                    }
                    // 1: golpe fuerte 
                    else{
                        System.out.println("El dinosaurio " + d.get_nombre() + " da un golpe fuerte a " + this.get_nombre() );
                        // Resta 12 puntos a la energía por ser golpe fuerte
                        int energia_restada_pelea = this.energia - 12;
                        this.set_energia(energia_restada_pelea);
                        System.out.println("La energía de " + this.get_nombre() + " es " + this.get_energia() );
                        // La energía del dinosaurio "this" es menor o igual a cero, es por ello que se debe detenera la pelea
                        if(this.energia <= 0){
                            System.out.println("La energia de " + this.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n");
                        }
                        // La energía del dinosaurio "d" es menor o igual a cero, es por ello que se debe detenera la pelea
                        else if(d.energia <= 0){
                            System.out.println("La energia de " + d.get_nombre() + " es 0 o menos, no puede seguir luchando ☠ \n" );
                            bandera = false; 
                            System.out.println("La batalla termina \n");
                        }
                    }   
                }
            }

            numero_rondas += -1;
            // Si el número de rondas es cero, se detiene la pelea
            if(numero_rondas == 0){
                System.out.println("\n**********************************************************************************************");
                System.out.println("Se acabaron las rondas de la pelea ");
                System.out.println("********************************************************************************************** \n");
                bandera = false;
            }     
        }

        System.out.println("Después de una intensa batalla, la energía de los dinosaurios es: \n ");
        System.out.println("Energía de " + this.get_nombre() + ":\t" + this.get_energia());
        System.out.println("Energía de " + d.get_nombre() + ":\t" + d.get_energia());

    }
    
    // ************************************** AQUÍ TERMINA EL MÉTODO 'PELEAR' **************************************


}