public class MetodosString{
    public static void main(String[] args){
        

        // Con estas cadenas se ejemplifican los métodos
        String cadena1 = "Mi nombre es Daniel Rojo Mata ";
        String cadena2 = "Me gusta bailar cumbias ";
        String cadena3 = ("           Esta es una cadena           ");
    
        System.out.println("\n Algunos métodos de la clase String \n");
        System.out.println("La cadena1 es: " + cadena1);
        System.out.println("La cadena2 es: " + cadena2);
        System.out.println("La cadena3 es: " + cadena3);

        System.out.println("\n########################################################\n");       

        // Método length
        System.out.println("El método length() sirve para contar el número de caracteres de una cadena \n");
        System.out.println("La cantidad de caracteres que tiene la cadena1 es: " + cadena1.length());
        System.out.println("La cantidad de caracteres que tiene la cadena2 es :" + cadena2.length());

        System.out.println("\n########################################################\n");

        // Método concat()
        System.out.println("El método concat() sirve para concatenar 2 cadenas\n");
        System.out.println("La concatenación de cadena1 y cadena2 mediante el método concat() es: ");
        System.out.println(cadena1.concat(cadena2));

        System.out.println("\n########################################################\n");

        // Método replace()
        System.out.println("El método replace(carac_viejo, carac_nuevo) busca el caracter carac_viejo en el texto y lo reemplaza con un nuevo caracter llamado carac_nuevo \n");
        System.out.println("En el siguiente ejemplo se cambian los caracteres 'cumbias' por 'salsas' en la cadena2 ");
        System.out.println(cadena2.replace("cumbias", "salsas"));

        System.out.println("\n########################################################\n");

        //Métod trim()
        System.out.println("El método trim() elimina los caracteres blancos (espacios) iniciales y finales de la cadena\n");
        System.out.println("La cadena original es: " + cadena3);
        System.out.println("La cadena con el método trim() es: "+ cadena3.trim());


        System.out.println("\n########################################################\n");

        //Método equalsIgnoreCase()
        System.out.println("El método equalsIgnoreCase() compara dos cadenas y devuelve true si son iguales sin considerar mayúsculas y minúsculas \n");
        System.out.println("¿La cadena1 es igual a la cadena2? " + cadena1.equalsIgnoreCase(cadena2));



    }

}