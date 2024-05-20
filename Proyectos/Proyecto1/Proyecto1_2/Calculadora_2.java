// ICC, proyecto 1
// Daniel Rojo Mata
// Uso de la calculadora

// Se importan los cosos que se utilizan
import java.util.Scanner;

public class Calculadora_2{
    public static void main(String[] args){

        // Se define un objeto de tipo 'herramientas' para poder inicializar todo el proceso
        herramientas_2 tool = new herramientas_2();
        
        // Esto sirve para apagar o prender la calculadora
        tool.set_prendida(true);
        
        // Se inicia el programa
        tool.esquema();
        
    }
}