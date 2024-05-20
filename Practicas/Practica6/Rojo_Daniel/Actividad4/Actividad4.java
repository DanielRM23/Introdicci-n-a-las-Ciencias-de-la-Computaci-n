// ICC, práctica 6
// Daniel Rojo Mata
// Actividad4. Listas.

// Se importan los cosos que se utilizan
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad4{

   public static void main(String[] args) {
  
        Scanner entrada_usuario = new Scanner(System.in);

        boolean bandera = true; 

        while(bandera){
            System.out.println();
            System.out.println("Elige una de las siguientes opciones:");
            System.out.println("1.- Agregar un videojuego a la lista 1");
            System.out.println("2.- Agregar un videojuego a la lista 2");
            System.out.println("3.- Mostrar la unión de las listas");
            System.out.println("4.- Mostrar la intersección de las listas");
            System.out.println("5.- Mostrar todos los videojuegos que pertenecen a una compañia");
            System.out.println("6.- Salir");
            System.out.println();

            int valor = entrada_usuario.nextInt();
            // Se hace el menú que se pide
            switch(valor){
                case 1:
                    hola.Agregar_lista1();
                    break;
                case 2:
                    hola.Agregar_lista2();
                    break;                
                case 3:
                    hola.union_listas();
                    break;
                case 4:
                    hola.interseccion_listas();
                    break;
                case 5:
                    hola.mostrar_videojuegos();
                    break;
                default:
                    System.out.println("Adiós");
                    bandera = false;
                    break;
            }
        }
   }
}