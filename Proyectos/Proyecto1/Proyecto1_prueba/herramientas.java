// ICC, proyecto 1
// Daniel Rojo Mata
// Herramientas para la calcualdora 

// Se importan los cosos que se utilizan 
import java.util.Scanner;

public class herramientas{

    // Se definen los atributos

    // Estos son los operandos con los que trabaja la calculadora
    int op1; 
    int op2; 
    // La memoria que tiene la calculadora 
    int MEM;
    // Es para prender o apagar la calculadora
    boolean prendida;

    // Se hace un constructor vacío
    public herramientas(){}
    
    // Se definen los gets 
    public int get_op1(){return op1; }
    public int get_op2(){return op2; }
    public int get_MEM(){return MEM; } 
    public boolean get_prendida(){return prendida;}

    // Se definen los sets 
    public void set_op1(int nuevo_op1){ op1 = nuevo_op1; }
    public void set_op2(int nuevo_op2){ op2 = nuevo_op2; }
    public void set_MEM(int nuevo_MEM){ MEM = nuevo_MEM; }
    public void set_prendida(boolean nuevo_valor){ prendida = nuevo_valor;}


// ############################################# MÉTODOS GENERALES (QUE SE USAN EN DECIMAL Y EN BINARIO) #############################################


    // Este método imprime un mensaje de bienvenida
    public void print_bienvenida(){
        System.out.println("\nB I E N V E N I D O   A   LA   C A L C U L A D O R A\n ");
        System.out.println("Elige una de las siguientes opciones:\n");
        System.out.println(" 1.- Usar calculadora en modo decimal. \n 2.- Usar calculadora en modo binario. \n 3.- Finalizar programa.\n");
    }

    // Este método imprime las opciones de las operciones que se quieren realizar 
    public void print_operaciones(){
        System.out.println("\n¿Qué operación quieres realizar?");             
        System.out.println("Elige una de las siguientes opciones:\n");
        System.out.println(" 1.- Suma. \n 2.- Resta. \n 3.- Multiplicación. \n 4.- Salir al menú anterior. \n" );
    }


    // Este método se usa para guardar el valor de una operación en memoria si así lo quiere el usuario
    public void guardar_memoria(Scanner memoria, int resultado){
        System.out.println("\n¿Quieres guardar el resultado en memoria?" + "\n" +"\n1.- Si \n2.- No\n");
        // Esta variable almacena 1 o 2, dependiendo la respuesta del usuario 
        int guardo_memoria = memoria.nextInt();
        // Esto es si el usuario quiere guardar o no su respuesta en la variable "MEM"
        if(guardo_memoria==1){
            // El usuario sí quiere guardar su respuesta
            this.set_MEM(resultado);
        }
        else{
            // El usuario no quiere guardar su respuesta, por lo que se debe reemplazar con un 0 
            this.set_MEM(0);
        }
        // Mensaje donde se muestra el valor actual que tiene la memoria (aributo MEM)
        System.out.println("\nEl valor que se tiene almacenado en la memoria es: " + this.get_MEM() + "\n");
    }


    // Este método es el cuerpo del programa 
    // Con base a los argumentos dados, el usuario elige un sistema en el cual trabajar; sistema decimal o binario
    // Una vez elegido el sistema se procede a elegir dos operandos con los cuales se trabajará
    public void esquema(Scanner entrada_usuario, Scanner operando1, Scanner operando2){
        // Se imprime el mensaje de bienvenida de la calculadora 
        this.print_bienvenida();
        // Se elige el modo de la calculadora 
        int modo = entrada_usuario.nextInt();

        // El ciclo sirve para mantener encedida la calculadora 
        // En este caso, la calculadora estará encendida siempre y cuando el atributo 'prendida' tenga un valor de true
        while(this.get_prendida()==true){
            // Se eligió el sistema decimal
            if(modo==1){
                System.out.println("\nS I S T E M A   D E C I M A L \n");
                // Se hacen los procedimientos correspondientes del sistema decimal (véase el método correspondiente)
                this.procedimiento_decimal(entrada_usuario, operando1, operando2);
            }
            // Se está usando la calculadora en modo binario 
            else if(modo==2){
                System.out.println("\nS I S T E M A   B I N A R I O \n");
                // Se hacen los procedimietos correspondientes del sistema binario (véase el método correspondiente)
                this.procedimiento_binario(entrada_usuario, operando1, operando2);
            }
            else{
                // Se apaga la calculadora cambiando el valor que toma el atributo 'prendida' a false
                System.out.println("\nA D I Ó S \nVuelve pronto :) \n");
                this.set_prendida(false);
            }
        }
    }

 // #####################################################################################################################################
 


 
 // ############################################# MÉTODOS QUE SE USAN PARA EL SISTEMA DECIMAL #############################################


    // Este método recibe el valor de los dos operandos que se están ingresando
    // Éstos se ingresan como String pero después se convierten en int, bajo ciertas condiciones 
    // Los objetos que ingresa el usuario son de tipo Scanner
    public void operandos_decimal(Scanner operando1, Scanner operando2){
        // Se convierte el string "MEM" en minúsculas
        String MEM = "MEM";
        String mem = MEM.toLowerCase();

        System.out.println("\nEscribe el valor del primer operando, o bien 'MEM' para usar el valor almacenado en memoria: ");
        // Esto es para que el valor que ingresa el usuario sea un String
        String op_1 = operando1.nextLine();
        // Esto es para ver si el usuario escribió MEM o mem (no importa si es letras minúsculas o mayúsculas)
        if(op_1.equals(mem) || op_1.equals(MEM)){
        // Si el usuario escribe MEM se hace lo siguiente: 
        // El atributo op1 recibe el valor que está almacenado en la memoria y por defecto, MEM tiene el valor 0 
            this.set_op1(this.get_MEM());
            }

        else{
        // Si el usuario NO escribe la palabra MEM entonces se convierte en un valor entero el número que escribe (recordemos que es un String de principio)
            int op1_int = Integer.parseInt(op_1);
        // El atributo op1 recibe el valor que ingreso el usuario
            this.set_op1(op1_int);
            }

        // Se repite lo anterior para el siguiente operando
        System.out.println("Escribe el valor del segundo operando, o bien 'MEM' para usar el valor almacenado en memoria: ");
        String op_2 = operando2.nextLine();
        if(op_2.equals(mem) || op_2.equals(MEM)){
            this.set_op2(this.get_MEM());
            }
        else{
            int op2_int = Integer.parseInt(op_2);
            this.set_op2(op2_int);
            }                     
    }

    
    // En este método se definen las operaciones con las cuales se trabajará dependiendo de lo que quiera el usuario
    public void procedimiento_decimal(Scanner entrada_usuario, Scanner operando1, Scanner operando2){    
        // Se imprimen las operaciones con las cuales se puede trabajar
        this.print_operaciones();
        // Esto es para saber que tipo de operación se eligió de las opciones
        int operacion = entrada_usuario.nextInt();

        switch(operacion){
            // Se eligió suma
            case 1:        
                // Se llama al método 'operandos_decimal'
                this.operandos_decimal(operando1, operando2);
                // El resultado es la suma correspondiente
                int resultado_suma = this.get_op1() + this.get_op2();
                System.out.println("\nEl resultado es: " + resultado_suma);
                // Se pregunta al usuario si quiere guardar el resultado en memoria        
                this.guardar_memoria(entrada_usuario, resultado_suma);
                break;            
            
            // Se eligió resta 
            case 2: 
                // Se llama al método 'operandos_decimal' 
                this.operandos_decimal(operando1, operando2);
                // El resultado es la resta correspondiente
                int resultado_resta = this.get_op1() - this.get_op2();
                System.out.println("\nEl resultado es: " + resultado_resta);
                // Se pregunta al usuario si quiere guardar el resultado en memoria        
                this.guardar_memoria(entrada_usuario, resultado_resta);
                break;

            // Se eligió multiplicación 
            case 3: 
                // Se llama al método 'operandos_decimal'
                this.operandos_decimal(operando1, operando2);
                // El resultado es la multiplicación correspondiente 
                int resultado_multiplicacion = this.get_op1() * this.get_op2();
                System.out.println("\nEl resultado es: " + resultado_multiplicacion);
                // Se pregunta al usuario si quiere guardar el resultado en memoria        
                this.guardar_memoria(entrada_usuario, resultado_multiplicacion);
                break;
            
            // Se eligió 'salir al menú anterior'
            case 4:
                // En este caso el atributo MEM recibe el valor 0 y se inicia de nuevo la calculadora (desde el mensaje inicial)
                set_MEM(0);
                this.esquema(entrada_usuario, operando1, operando2);
                break;
        }           
    }


// #####################################################################################################################################




 // ############################################# MÉTODOS QUE SE USAN PARA EL SISTEMA BINARIO #############################################


    // Este método se hizo en clase 
    // Este método transforma un número binario (escrito por 0's y 1's) en su equivalente en decimal 
    // Toma como argumento un objeto de tipo int y devuelve un objeto de tipo int 
    public int binario_a_decimal(int binario){
        String binario_string = String.valueOf(binario);
        int resultado = 0;
        double potencia = 0; 
        for(int i=binario_string.length()-1; i>=0; i--){
            char numero = binario_string.charAt(i);
            int valor = Character.getNumericValue(numero);
            double multiplicacion = valor*Math.pow(2, potencia);
            resultado += multiplicacion;
            potencia++; 
        }
        return resultado; 
    }


    // Este método transforma de un número decimal a su equivalente en binario (compuesto de 0's y 1's)
    public int decimal_a_binario(int decimal){
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        int numero_decimal = Integer.parseInt(binary);
        return numero_decimal;
    }


    // Este método es similar al mostrado en 'operandos_decimal' salvo por unos detalles
    // Este método recibe el valor de los dos operandos que se están ingresando
    // Éstos se ingresan como String pero después se convierten en int, bajo ciertas condiciones 
    // Los objetos que ingresa el usuario son de tipo Scanner
    public void operandos_binario(Scanner operando1, Scanner operando2){
        // Se convierte el string "MEM" en minúsculas
        String MEM = "MEM";
        String mem = MEM.toLowerCase();

        System.out.println("\nEscribe el valor del primer operando, o bien 'MEM' para usar el valor almacenado en memoria: ");
        // Esto es para que el valor que ingresa el usuario sea un String
        String op_1 = operando1.nextLine();
        // Esto es para ver si el usuario escribió MEM o mem (no importa si es letras minúsculas o mayúsculas)
        if(op_1.equals(mem) || op_1.equals(MEM)){
        // Si el usuario escribe MEM se hace lo siguiente: 
        // El atributo op1 recibe el valor que está almacenado en la memoria y por defecto, MEM tiene el valor 0 
            this.set_op1(this.get_MEM());
            }

        // Esto es por si el usuario ingresa un número que no está compuesto por 0's y 1's
        // A grandes razgos, si el usuario ingresa un número que no está compuesto únicamente por 0's y/o 1's se reinicia el método binario 
        else{
            // Se comprueba que el número ingresado contenga a las cifras 2,3,4,5,6,7,8 o 9 
            if( op_1.contains(String.valueOf("2")) || op_1.contains(String.valueOf("3")) || op_1.contains(String.valueOf("4")) || op_1.contains(String.valueOf("5")) 
            || op_1.contains(String.valueOf("6")) || op_1.contains(String.valueOf("7")) || op_1.contains(String.valueOf("8")) || op_1.contains(String.valueOf("9"))) {
                // En este caso se muestra un mensaje de error
                System.out.println("\nE R R O R: Escribiste un número inválido.");
                System.out.println("Recuerda que en el sistema binario solo existen 0's y 1's. ");
                System.out.println("Empieza de nuevo.\n");
                // Se reinicia el método binario 
                this.procedimiento_binario(operando2, operando1, operando2);
            }
           
            else{
            // Ya se comprobó que el número que escribió el usuario es correcto (consta de 0´s y 1's)
            // Si el usuario no escribe la palabra MEM entonces se convierte en un valor entero el número que escribe (recordemos que es un String de principio)
                int op1_int = Integer.parseInt(op_1);
                // El atributo op1 recibe el valor que ingreso el usuario
                this.set_op1(op1_int);
            }
        }
        // Se repite lo anterior para el segundo operando
        System.out.println("Escribe el valor del segundo operando, o bien 'MEM' para usar el valor almacenado en memoria: ");
        String op_2 = operando1.nextLine();
        if(op_2.equals(mem) || op_2.equals(MEM)){
            this.set_op2(this.get_MEM());
            }
        else{
            if( op_2.contains(String.valueOf("2")) || op_2.contains(String.valueOf("3")) || op_2.contains(String.valueOf("4")) || op_2.contains(String.valueOf("5")) 
            || op_2.contains(String.valueOf("6")) || op_2.contains(String.valueOf("7")) || op_2.contains(String.valueOf("8")) || op_2.contains(String.valueOf("9"))) {
                System.out.println("\nE R R O R: Escribiste un número inválido.");
                System.out.println("Recuerda que en el sistema binario solo existen 0's y 1's. ");
                System.out.println("Empieza de nuevo.\n");
                this.procedimiento_binario(operando2, operando1, operando2);
            }
            else{
                int op2_int = Integer.parseInt(op_2);
                this.set_op2(op2_int);
            }
        }
    }

        
    // En este método se definen las operaciones con las cuales se trabajará dependiendo de lo que quiera el usuario
    // El usuario ingresa exclusivamente un número compuesto solo por 0's y 1's 
    // Ingresado el valor, éste se convierte en su equivalente en decimal
    // Las operaciones se hacen con los operandos en deciamal, hecha la operación el resultado se convierte a binario
    public void procedimiento_binario(Scanner entrada_usuario, Scanner operando1, Scanner operando2){    
        // Se imprimen las operaciones con las cuales se puede trabajar
        this.print_operaciones();
        // Esto es para saber que tipo de operación se quiere 
        int operacion = entrada_usuario.nextInt();

        switch(operacion){
            // Se eligió la suma 
            case 1:        
                // Se llama al método 'operandos_binario'
                this.operandos_binario(operando1, operando2);
                // Se transforman los valores ingresados a decimal usando el ḿétodo 'binario_a_decimal'
                int op1_decimal = this.binario_a_decimal(this.get_op1());
                int op2_decimal = this.binario_a_decimal(this.get_op2());
                // Se hace la operación correspondiente en el sistema decimal
                int resultado_suma_decimal = op1_decimal + op2_decimal; 
                // El resultado de la operación se transforma a números binarios usando el método 'decimal_a_binario'
                int resultado_suma_binario = this.decimal_a_binario(resultado_suma_decimal);
            
                System.out.println("\nEl resultado es: " + resultado_suma_binario);

                // Se pregunta si se el resultado se guarda en memoria
                this.guardar_memoria(entrada_usuario, resultado_suma_binario);
                break;        

            // Se eligió resta
            case 2: 

                // Se llama al método 'operandos_binario'
                this.operandos_binario(operando1, operando2);
                // Se transforman los valores ingresados a decimal usando el método 'binario_a_decimal'
                int op3_decimal = this.binario_a_decimal(this.get_op1());
                int op4_decimal = this.binario_a_decimal(this.get_op2());
                // Se hace la operación correspondiente en el sistema decimal
                int resultado_resta_decimal = op3_decimal - op4_decimal; 
                // El resultado de la operación se transforma a números binarios usando el método 'decimal_a_binario'
                int resultado_resta_binario = this.decimal_a_binario(resultado_resta_decimal);
            
                System.out.println("\nEl resultado es: " + resultado_resta_binario);
                // Se pregunta al usuario si quiere guardar el resultado en memoria        
                this.guardar_memoria(entrada_usuario, resultado_resta_binario);
                break;  

            case 3: 
                // Se llama al método 'opernados_binario'
                this.operandos_binario(operando1, operando2);
                // Se transforman los valores ingresados a decimal usando el método 'binario_a_decimal'
                int op5_decimal = this.binario_a_decimal(this.get_op1());
                int op6_decimal = this.binario_a_decimal(this.get_op2());
                // Se hace la operación correspondiente en el sistema decimal 
                int resultado_producto_decimal = op5_decimal * op6_decimal; 
                // El resultado de la operación se transforma al sistema binario usando el método 'decimal_a_binario'
                int resultado_producto_binario = this.decimal_a_binario(resultado_producto_decimal);
            
                System.out.println("\nEl resultado es: " + resultado_producto_binario);
                // Se pregunta al usuario si quiere guardar el resultado en memoria 
                this.guardar_memoria(entrada_usuario, resultado_producto_binario);
                break;  
            
            // Se eligió 'salir al menú anterior'
            case 4:
                // En este caso el atributo MEM recibe el valor 0 y se inicia de nuevo la calculadora (desde el mensaje inicial)
                set_MEM(0);
                this.esquema(entrada_usuario, operando1, operando2);
                break;
        }           
    }


// #####################################################################################################################################

}