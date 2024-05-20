public class Jaula{
    
    // Atributos que se usan como candado para que no haya leones en donde hay monos o viceversa
    boolean hay_leon;
    boolean hay_mono;

    // Se hace un constructor vacío 
    public Jaula(){}
    
    // Métodos get
    public boolean get_hay_mono(){return hay_mono; }
    public boolean get_hay_leon(){return hay_leon; }
    
    // Métodos set
    public void set_hay_mono(boolean nuevo_valor){ hay_mono = nuevo_valor; }
    public void set_hay_leon(boolean nuevo_valor){ hay_leon = nuevo_valor; }

    
    // Método con el cual se obtiene el número de una jaula
    public void numero_jaula(Animal[][] jaulas, Animal[] jaula){
        // Esto es para conocer la posición de la jaula
        int posicion = 0;
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] == jaula) {
                posicion = i;
                break;
            }
        }
        System.out.println("J A U L A  " + (posicion + 1) );
    }


    // Método que imprime en pantalla los identificadores de los animales que estén en esta jaula
    public void imprime_identificador(Animal[][] jaulas, Animal[] jaula){
        // Se llama al método "numero_jaula"
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        this.numero_jaula(jaulas, jaula);
        System.out.println("Se muestran todos los números de serie de los animales que hay en esta jaula");
        // Se itera sobre cada elemento de la jaula, si el elemento i-ésimo es "null" se imprime en pantalla "null"
        // Si el elemento i-ésimo no es "null" se imprime su identificador 
        for(int i=1; i<jaula.length;i++){
            if(jaula[i] == null){
                System.out.print(jaula[i] + " ");
            }
            else{
                System.out.print(jaula[i].get_identificador() + " ");
            }
        }
        System.out.println("\n");
    }


    // Método que imprime en pantalla la salud de los animales que estén en esta jaula 
    public void imprime_salud(Animal[][] jaulas, Animal[] jaula){
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        // Se llama al método "numero_jaula"
        this.numero_jaula(jaulas, jaula);
        System.out.println("Se muestra la salud de todos los animales en esta jaula");
        // Se itera sobre cada elemento de la jaula, si el elemento i-ésimo es "null" se imprime en pantalla "null"
        // Si el elemento i-ésimo no es "null" se imprime su estado de salud 
        for(int i=1; i<jaula.length;i++){
            if(jaula[i] == null){
                System.out.print(jaula[i] + " ");
            }
            else{
                System.out.print(jaula[i].get_estado_salud() + " ");
            }
        }
        System.out.println("\n");
    }


    // Método que imprime en pantalla los tipos de animales que hay en pantalla
    public void imprime_animal(Animal[][] jaulas, Animal[] jaula){
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        // Se llama al método "numero_jaula"
        this.numero_jaula(jaulas, jaula);
        System.out.println("Se muestran los tipos de animales en esta jaula");
        // Se itera sobre cada elemento de la jaula, si el elemento i-ésimo es "null" se imprime en pantalla "null"
        // Si el elemento i-ésimo no es "null" se imprime el tipo de animal  
        for(int i=1; i<jaula.length;i++){
            if(jaula[i] == null){
                System.out.print(jaula[i] + " ");
            }
            else{
                System.out.print(jaula[i].get_animal() + " ");
            }
        }
        System.out.println("\n");
    }
    

    // Método que imprime en pantalla el horario de comida de los animales
    public void imprime_horario(Animal[][] jaulas, Animal[] jaula){
        // // Esto es para conocer la posición de la jaula
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        this.numero_jaula(jaulas, jaula);
        System.out.println("Se muestran los horarios de comida de los animales en esta jaula");
        // Se itera sobre cada elemento de la jaula, si el elemento i-ésimo es "null" se imprime en pantalla "null"
        // Si el elemento i-ésimo no es "null" se imprime el horario de comida   
        for(int i=1; i<jaula.length; i++){
            // if(jaula[i] == null){
            //     System.out.print(jaula[i] + " ");
            // }
            if(jaula[i]!= null){
                System.out.println("Identificador del animal: " + jaula[i].get_identificador() );
                System.out.println("\tDía: " + jaula[i].get_Horario().get_dia() );
                System.out.println("\tHora: " + jaula[i].get_Horario().get_hora() );
                System.out.println(" ");
            }
            
        }
    }


    // Método que agrega a un animal a una jaula ya existente 
    public void agrega_animal(Animal[][] jaulas, Animal animal, Animal[] jaula){
         // Se obtiene el tipo de animal que se está ingresando 
        String animal_actual = animal.get_animal();

        // Candados para saber si se está agregando un león o un mono a la jaula

        // Estas dos primeras condiciones es cuando se introduce como primer animal un leon o un mono
        // Si hay un leon se actualiza el estado "hay_leon"
        if(animal_actual.equals("leon")){
            this.set_hay_leon(true);
        }
        // Si hay un mono se actualiza el estado "hay_mono"
        if(animal_actual.equals("mono")){
            this.set_hay_mono(true);
        }
        
        // Estas condiciones son para cuando ya hay un mono o un leon en la jaula
        for(int i=0; i<jaula.length; i++){
            if(jaula[i] != null){
                if(jaula[i].get_animal().equals("leon")){
                    this.set_hay_leon(true);                    
                }
            }
        }


        for(int i=0; i<jaula.length; i++){
            if(jaula[i] != null){
                if(jaula[i].get_animal().equals("mono")){
                    this.set_hay_mono(true);                    
                }
            }
        }


        // Esto espara saber el número de la juala
        int posicion = 0;
        for (int i = 0; i < jaulas.length; i++) {
        if (jaulas[i] == jaula) {
            posicion = i;
            break;
            }
        }

        int contador=0;
        for(int i=1; i<jaula.length; i++){
            if(jaula[i] == null){
                // Si hay un leon en la jaula dada y se quiere agregar un mono, se despliega un mensaje de error
                if(this.get_hay_leon()==true && animal_actual.equals("mono")){
                    System.out.println("A T E N C I Ó N: Hay al menos un león en la jaula " + (posicion + 1) );
                    System.out.println("Recuerda que los leones no pueden convivir con los monos");
                    System.out.println("Estás intentando juntar a un mono en donde ya hay un león, esto no es posible.");
                    System.out.println("\n");
                    break;
                }
                // Si hay un mono en la jaula dada y se quiere agregar un leon, se despliega un mensaje de error
                if(this.get_hay_mono()==true && animal_actual.equals("leon")){
                    System.out.println("A T E N C I Ó N: Hay al menos un mono en la jaula " +  (posicion+1) );
                    System.out.println("Recuerda que los monos no pueden convivir con los leones");
                    System.out.println("Estás intentando juntar a un león en donde ya hay un mono, esto no es posible.");
                    System.out.println("\n");
                    break;
                }
                else{
                    // Se agrega el animal cuando no hay ninguna restricción
                    jaula[i] = animal;
                    break;
                }             
            }
            else{
                // Este contador sirve para contar las jaulas que no están vacías
                contador++;
            }
        }
        
        // Esto ocurre cuando la jaula está llena, se muestra un mensaje de error
        if(contador==jaula.length-1){
            System.out.println("A T E N C I Ó N: Jaula llena");
            System.out.println("Ya no puedes meter animales a esta jaula");
            System.out.println("\n");
        }

        // Se cierran los candados con los cuales se inició el método
        this.set_hay_leon(false);
        this.set_hay_mono(false);
    }
    


    // Método que cambia a un amimal de jaula 
    // Se necesita un animal y una jaula para cambiarlo a esta nueva jaula
    public void cambiar_animal(Animal[][] jaulas, Animal animal, Animal[] jaula_a_cambiar){
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("C A M B I A R  D E  J A U L A");
    // Se ubica en qué jaula está el animalito 
    // Una vez ubicado se cambia a la otra jaula, utilizando el método "agregar_animal"
        String identificador = animal.get_identificador();
        // El índice "i" itera sobre las jaulas
        for(int i=0; i<jaulas.length; i++){
            // El índice "j" itera sobre los animales que haya en el array
            for(int j=1; j<jaulas[i].length; j++){
                // Encontramos al animal en la jaula en la que esté
                if(jaulas[i][j] != null && jaulas[i][j].get_identificador().equals(identificador)){
                    System.out.println("El identificador del animal que quieres cambiar es: " + animal.get_identificador() );
                    System.out.println("Localización actual: J A U L A  " + (i+1) );
                    // Lo quitamos de la jaula
                    jaulas[i][j] = null;
                    break;
                }
            }
        }

        // Esto es para saber el número de jaula_a_cambiar (la nueva jaula)
        int posicion = 0;
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] == jaula_a_cambiar) {
                posicion = i;
                break;
            }
        }
        
        // El animal se traslada a otra jaula
        // Se aplica el método agrega_animal
        System.out.println("Localización nueva: J A U L A  " + (posicion+1));
        System.out.println("El animal se trasladó con éxito");
        this.agrega_animal(jaulas, animal, jaula_a_cambiar);
        System.out.println(" ");

    }



    // Método que cuenta las especies que hay una jaula dada
    public void conteo_especies(Animal[][] jaulas, Animal[] jaula){
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        // Contadores de las especies
        int contador_leones=0;
        int contador_monos=0;
        int contador_aguilas=0;
        
        // Se itera sobre cada elemento de la jaula y por cada animal que aparezca se agrega un valor al respectivo contador
        for(int i=1; i<jaula.length; i++){
            if(jaula[i] != null){ 
                if(jaula[i].get_animal()=="leon"){
                    contador_leones ++;
                }
                if(jaula[i].get_animal()=="mono"){
                    contador_monos ++;
                }
                if(jaula[i].get_animal()=="aguila"){
                    contador_aguilas ++;
                }
            }
        }
        
        this.numero_jaula(jaulas, jaula);
        System.out.println("Se muestran los números de especies de animales que hay en esta jaula");
        System.out.println(" ");
        System.out.println("Hay " + contador_leones + " leon(es) en la jaula");
        System.out.println("Hay " + contador_monos + " mono(s) en la jaula");
        System.out.println("Hay " + contador_aguilas + " águila(s) en la jaula");
        System.out.println("Hay " + ((jaula.length-1) - contador_leones - contador_monos -contador_aguilas) + " lugar(es) vacío(s)");
        System.out.println(" ");
    }
    

    // Método que muestra en pantalla la información de un animal dado su número de serie 
    public void informacion_animal(Animal[][] jaulas, String numero_serie ){
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        // Se obtiene el numero de serie del animal dado 
        String identificador = numero_serie;
        int indice_jaula=0;

        // Primero se busca al animal, con su número de serie, en las jaulas
        // Se localiza en que jaula está el animal 
        // El índice "i" itera sobre las jaulas
        for(int i=0; i<jaulas.length; i++){
            // El índice "j" itera sobre los animales que haya en el array
            for(int j=1; j<jaulas[i].length; j++){
                if(jaulas[i][j] != null){
                    if(jaulas[i][j].get_identificador().equals(identificador)){
                        // Esta es la jaula en la que se encuentra en animal 
                        indice_jaula += i;
                        break;                
                    }
                }
            }
        }

        // Se trabaja en la jaula en donde está el animal 
        for(int i=0; i<jaulas[indice_jaula].length; i++){
            if(jaulas[indice_jaula][i] != null){
                // Estando en la jaula, se busca al animal con su numero de serie 
                if(jaulas[indice_jaula][i].get_identificador().equals(identificador) ){
                    // Se imprime la información del animal 
                    System.out.println("I N F O R M A C I Ó N  (dado un número de serie) ");
                    System.out.println("Número de serie del animal: " + identificador);
                    System.out.println("\t*Animal: " + jaulas[indice_jaula][i].get_animal());
                    System.out.println("\t*Localización: " + "jaula " + (i+1));
                    System.out.println("\t*Estado de salud: " + jaulas[indice_jaula][i].get_estado_salud() );
                    System.out.println("\t*Horario de comida: " + jaulas[indice_jaula][i].get_Horario().get_dia() + ", " + jaulas[indice_jaula][i].get_Horario().get_hora()  );        
                    System.out.println(" ");
                    break;
                }
                else{
                    System.out.println("E R R O R: No encuentro el numero de serie que introdujiste en ninguna jaula");
                    System.out.println("Revisa si éste está bien escrito");
                    break;
                }
            }
        }
    } 



}
