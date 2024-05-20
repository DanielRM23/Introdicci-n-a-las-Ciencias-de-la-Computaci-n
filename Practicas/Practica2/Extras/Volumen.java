import java.util.Scanner;

public class Volumen{
    public static void main(String args[]){

        Scanner figura = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);
        Scanner radio = new Scanner(System.in);
        Scanner arista = new Scanner(System.in);
        Scanner apotema = new Scanner(System.in);
        
        String cono = "cono";
        String octaedro = "octaedro";
        String hemisferio = "hemisferio";
        String piramide = "piramide";

        System.out.println("\nPrograma que calcula e imprime el volumen de diversas figuras geométricas \n");
        System.out.println("\nEscribe una de las siguientes opciones (sin acentos): \n");
        System.out.println(" Cono \n Octaedro \n Hemisferio \n Pirámide Pentagonal \n");
        
        String figura_leida = (figura.next()).toLowerCase();


        if(figura_leida.equals(cono)){
            System.out.println("\nDame el valor de la altura \n");
            Double altura_leida = altura.nextDouble();
        
            System.out.println("\nDame el valor del radio \n");
            Double radio_leido = radio.nextDouble();

            Double volumen_cono = (Math.PI/3) * Math.pow(radio_leido, 2) * altura_leida;
            System.out.println("\nEl volumen que buscas es: " + volumen_cono);
        }

        else if(figura_leida.equals(octaedro)){
            System.out.println("\nDame el valor de la arista \n");
            Double arista_leida = arista.nextDouble();
            
            Double volumen_octaedro = (Math.sqrt(2)/3)*Math.pow(arista_leida, 3);
            System.out.println("\nEl volumen que buscas es: " + volumen_octaedro);
        }

        else if(figura_leida.equals(hemisferio)){
            System.out.println("\nDame el valor del radio \n");
            Double radio_leido = radio.nextDouble();
            
            Double volumen_hemisferio = (2*Math.PI)/3 *Math.pow(radio_leido, 3);
            System.out.println("\nEl volumen que buscas es: " + volumen_hemisferio);
        }
        
        else if(figura_leida.equals(piramide)){
            System.out.println("\nDame el valor de una arista (de la base pentagonal) \n");
            Double arista_leida = arista.nextDouble();

            System.out.println("\nDame el valor del apotema \n");
            Double apotema_leido = apotema.nextDouble();

            System.out.println("\nDame el valor de la altura \n");
            Double altura_leida = altura.nextDouble();
            
            Double volumen_piramide = (0.83)*(arista_leida * apotema_leido * altura_leida);
            System.out.println("\nEl volumen que buscas es: " + volumen_piramide);
        }

        else{
            System.out.println("\nAlgo falló, vuelve a intentarlo \n");
        }


    }

}