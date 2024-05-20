// ICC, proyecto 1
// Daniel Rojo Mata
// Uso de la calculadora

// Se importan los cosos que se utilizan
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){

        // Se define un objeto de tipo 'herramientas' para poder inicializar todo el proceso
        herramientas tool = new herramientas();

        // Esto se utiliza para preguntar diferentes respuestas a lo largo del programa
        Scanner entrada_usuario = new Scanner(System.in);
        
        // Se define el primer operando 
        Scanner operando1 = new Scanner(System.in);
        // Se define el segundo operando 
        Scanner operando2 = new Scanner(System.in);
        
        // Esto sirve para apagar o prender la calculadora
        tool.set_prendida(true);
        
        // Se inicia el programa
        tool.esquema(entrada_usuario, operando1, operando2);
        
    }
}