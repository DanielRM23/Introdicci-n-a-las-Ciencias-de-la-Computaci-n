// ICC, proyecto 1
// Daniel Rojo Mata
// Uso de la calculadora

// Se importan los cosos que se utilizan
import java.util.Scanner;

public class calculadora{
    public static void main(String[] args){

        // Se define un objeto de tipo 'herramientas' para poder inicializar todo el proceso
        herramientas tool = new herramientas();
        
        // Esto sirve para apagar o prender la calculadora
        tool.set_prendida(true);
        
        // Se inicia el programa
        tool.esquema();   
    }
}