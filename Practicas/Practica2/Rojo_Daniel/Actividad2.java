// ICC, práctica 2
// Daniel Rojo Mata
// Volumen de diversas figuras 

// Se importan las clases que se usarán 
import java.util.Scanner;

public class Actividad2{
    public static void main(String args[]){

        Scanner figura = new Scanner(System.in);

        // Estos son los elementos que se usan en todas las figuras
        Scanner altura = new Scanner(System.in);
        Scanner radio = new Scanner(System.in);
        Scanner arista = new Scanner(System.in);
        Scanner apotema = new Scanner(System.in);
        

        // Mensaje que se muestra en pantalla 
        System.out.println("\nPrograma que calcula e imprime el volumen de diversas figuras geométricas \n");
        System.out.println("\nEscribe una de las siguientes opciones (el número asociado a cada figura): \n");
        // Se asocian números a las figuras
        // 1-> Cono, 2-> Octaedro, 3-> Hemisferio, 4-> Pirámide pentagonal
        System.out.println(" 1.- Cono \n 2.- Octaedro \n 3.- Hemisferio \n 4.- Pirámide Pentagonal \n");
        
        // Se elige la figura
        int figura_leida = figura.nextInt();

        // Dependiendo de la opción que se haya elegido se selecciona la figura correspondiente
        if (figura_leida == 1){
            System.out.println("\nDame el valor de la altura \n");
            Double altura_leida = altura.nextDouble();
        
            System.out.println("\nDame el valor del radio \n");
            Double radio_leido = radio.nextDouble();

            // Se calcula el volumen del cono 
            Double volumen_cono = (Math.PI/3) * Math.pow(radio_leido, 2) * altura_leida;
            System.out.println("\nEl volumen que buscas es: " + volumen_cono);
            }
            
    
        else if(figura_leida == 2){
            System.out.println("\nDame el valor de la arista \n");
            Double arista_leida = arista.nextDouble();
            
            // Se calcula el volumen del octaedro
            Double volumen_octaedro = (Math.sqrt(2)/3)*Math.pow(arista_leida, 3);
            System.out.println("\nEl volumen que buscas es: " + volumen_octaedro);
            }

        else if(figura_leida ==3 ){
            System.out.println("\nDame el valor del radio \n");
            Double radio_leido = radio.nextDouble();
            
            // Se calcula el volumen del hemisferio
            Double volumen_hemisferio = (2*Math.PI)/3 *Math.pow(radio_leido, 3);
            System.out.println("\nEl volumen que buscas es: " + volumen_hemisferio);
            }

        else if(figura_leida == 4){
            System.out.println("\nDame el valor de una arista (de la base pentagonal) \n");
            Double arista_leida = arista.nextDouble();

            System.out.println("\nDame el valor del apotema \n");
            Double apotema_leido = apotema.nextDouble();

            System.out.println("\nDame el valor de la altura \n");
            Double altura_leida = altura.nextDouble();
            
            // Se calcula el volumen de la pirámide
            Double volumen_piramide = (0.83)*(arista_leida * apotema_leido * altura_leida);
            System.out.println("\nEl volumen que buscas es: " + volumen_piramide);
            }

        else{
            System.out.println("\nAlgo falló, vuelve a intentarlo \n");
            }

    }

}

