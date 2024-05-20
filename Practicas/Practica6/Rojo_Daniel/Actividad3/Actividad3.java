// ICC, práctica 6
// Daniel Rojo Mata
// Actividad 3. Excepciones.

// Se importan las cosas que se utilizan 
import java.util.Scanner;
import java.util.InputMismatchException;

public class Actividad3{
    public static void main(String[] hola) {
        
        // Se crea un objeto de tipo JarraDeAgua con 3 vasos iniciales
        JarraDeAgua jarra_inicial = new JarraDeAgua(3);

        Scanner entrada_usuario3 = new Scanner(System.in);

        // Bandera para el ciclo while
        boolean bandera = true;
        while(bandera){

            // Se usa un try por si ocurre un InputMismatchException
            try{
                System.out.println("-----------------------------------------------------");
                System.out.println("Selecciona una de las siguientes opciones");
                System.out.println("0.- Ver la capacidad de la jarra");
                System.out.println("1.- Depositar agua");
                System.out.println("2.- Retirar agua");
                System.out.println("3.- Salir");

                int opcion_elegida = entrada_usuario3.nextInt();

                // Se despliega el menú solicitado
                switch(opcion_elegida){
                    case 0:
                        System.out.println("-----------------------------------------------------");
                        System.out.println("\tJ A R R A");
                        System.out.println("\t*Vasos almacenados actualmente: " + jarra_inicial.get_capacidad() );
                        break;
                    case 1: 
                        jarra_inicial.depositar_agua();
                        break;
                    case 2:
                        jarra_inicial.retirar_agua();
                        break;
                    case 3:
                        System.out.println("Adiós. Vuelve pronto.");
                        bandera = false;
                        break;
                    default:
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Introduce uno de los números anteriores");
                        break;
                }
            }
            // Se cacha la excepcion
            catch(InputMismatchException ime){
                System.out.println("-----------------------------------------------------");
                System.out.println("Entrada inválida. Introduce números por favor.");
                entrada_usuario3.nextLine();
            }
        }
    }

}