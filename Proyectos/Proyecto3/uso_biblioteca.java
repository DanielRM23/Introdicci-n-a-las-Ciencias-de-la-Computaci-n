import java.util.ArrayList;
import java.util.Scanner;


public class uso_biblioteca{


    public static void main(String[] holaaaaa) {
        
        libro libro_prueba = new libro(null, null, null, null, null, null);
        //usuario usuario_prueba = new usuario(null, null, null);

        Scanner entrada_usuario = new Scanner(System.in);

        boolean bandera = true;
        
        while(bandera){

            System.out.println();
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1.- Agregar libro");
            System.out.println("2.- Editar libro");
            System.out.println("3.- Ver información de los libros");
            System.out.println("4.- Eliminar un libro");
            System.out.println("5.- Registrar usuario");
            System.out.println("6.- Ver usuarios");
            System.out.println("7.- Prestar libro");

            System.out.println();


            int opcion_elegida = entrada_usuario.nextInt();
            
            switch(opcion_elegida){
                case 1: 
                    System.out.println("-------------------------------------------------");
                    libro_prueba.registrar_libro();
                    break;

                case 2: 
                    System.out.println("-------------------------------------------------");
                    libro_prueba.editar_libro();
                    break;

                case 3: 
                    System.out.println("-------------------------------------------------");
                    libro_prueba.informacion_libro();
                    break;
                
                case 4:
                    System.out.println("-------------------------------------------------");
                    libro_prueba.eliminar_libro();
                    break;

                case 5:
                    System.out.println("-------------------------------------------------");
                    libro_prueba.registrar_usuario();
                    break;
                
                case 6:
                    System.out.println("-------------------------------------------------");
                    libro_prueba.informacion_usuario();
                    break;
                    
                case 7:
                    System.out.println("-------------------------------------------------");
                    libro_prueba.prestar_libro();
                    break;

                default: 
                    System.out.println("-------------------------------------------------");
                    System.out.println("Vuelve pronto");
                    bandera = false;
                    break;
            }
        }    
    }




    
}