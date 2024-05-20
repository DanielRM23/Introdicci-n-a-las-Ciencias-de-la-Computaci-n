// Se importan las cosas que se utilizan 
import java.util.Scanner;
import java.util.InputMismatchException;


public class JarraDeAgua{

    // Número de vasos que tiene la jarra
    int numero_vasos;

    // Constructor 
    public JarraDeAgua(int numero_vasos){
        if(numero_vasos >= 0){
            this.numero_vasos = numero_vasos;
        }
        else{
            System.out.println("Introduce una cantidad positiva (de vasos)");
        }
    }
    
    // Método get con el que se obtiene la capcidad del agua 
    public int get_capacidad(){ return numero_vasos; }

    // Método con el cual se deposita agua a la jarra
    // Se hace el supuesto de que cada vaso es de 1L de capacidad, así se puede almacenar un máximo de 10 vasos
    public void depositar_agua(){

        Scanner entrada_usuario1 = new Scanner(System.in);
        System.out.println("¿Cuántos vasos quieres agregar?");

        // Se usa un try por si ocurren las excepciones creadas o un InputMismatchException
        try{
            // Valor que ingresa el usuario
            int vasos_introducidos = entrada_usuario1.nextInt();
            // Esta condición garantiza que no se almacenen más vasos de los que se pueden
            int condicion_vasos = numero_vasos + vasos_introducidos; 

            if(condicion_vasos <= 10){
                numero_vasos += vasos_introducidos;
                System.out.println("-----------------------------------------------------");
                System.out.println("Has introducido " + vasos_introducidos + " vaso(s)");
                System.out.println("La jarra ahora tiene " + this.get_capacidad() + " vasos");
            }
            else{
                System.out.println("-----------------------------------------------------");
                throw new CapacidadSuperada("No puedes agregar tantos vasos. \nExcedes la capacidad máxima.");
            }
        }
        // Se cachan las excepciones
        catch(CapacidadSuperada e){
            System.out.println( e.getMessage() );
        }
        catch(InputMismatchException ime){
            System.out.println("-----------------------------------------------------");
            System.out.println("Entrada inválida. Introduce números por favor.");
        }

    }


    // Método con el cual se retiran vasos de agua
    // Se hace el supuesto de que cada vaso es de 1L de capacidad
    public void retirar_agua(){
        
        Scanner entrada_usuario2 = new Scanner(System.in);
        System.out.println("¿Cuántos vasos quieres retirar?");                
        
        // Se usa un try por si ocurren las excepciones creadas o un InputMismatchException
        try{
            // Valor que ingresa el usuario
            int vasos_introducidos = entrada_usuario2.nextInt();
            // Esta condición garantiza que no se almacenen más vasos de los que se pueden
            int condicion_vasos = numero_vasos - vasos_introducidos; 

            if(condicion_vasos >= 0){
                numero_vasos -= vasos_introducidos;
                System.out.println("-----------------------------------------------------");
                System.out.println("Has retirado " + vasos_introducidos + " vaso(s)");
                System.out.println("La jarra tiene ahora " + this.get_capacidad() + " vaso(s)");
            }
            else{
                System.out.println("-----------------------------------------------------");
                throw new CapacidadInsuficiente("No puedes quitar más vasos de los que tienes");
            }
        }
        // Se cachan las excepciones
        catch(CapacidadInsuficiente e){
            System.out.println( e.getMessage() );
        }
        catch(InputMismatchException ime){
            System.out.println("-----------------------------------------------------");
            System.out.println("Entrada inválida. Introduce números por favor.");
        }

    }

}