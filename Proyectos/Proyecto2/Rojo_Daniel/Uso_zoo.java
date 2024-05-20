public class Uso_zoo{
    public static void main(String[] hola){

        // Se crea un objeto de tipo jaula 
        Jaula prueba = new Jaula();

        // Se crean todos los horarios de los animales
        Horario h1 = new Horario("lunes", "1 pm");
        Horario h2 = new Horario("martes", "2 pm");
        //Horario h3 = new Horario("miercoles", "3 pm");
        Horario h4 = new Horario("jueves", "4 pm");
        // Horario h5 = new Horario("viernes", "5 pm");

        // Horario h6 = new Horario("sabado", "6 pm");
        // Horario h7 = new Horario("domingo", "8 pm");
        // Horario h8 = new Horario("lunes", "7 pm");
        // Horario h9 = new Horario("martes", "8 pm");
        // Horario h10 = new Horario("miercoles", "9 pm");


         // Se crean las 5 jaulas y éstas se guardan dentro de un array
        Animal[] jaula1 = new Animal[5];
        Animal[] jaula2 = new Animal[5];
        Animal[] jaula3 = new Animal[5];
        Animal[] jaula4 = new Animal[5];
        Animal[] jaula5 = new Animal[5];
 
         // Las jaulas se guardan dentro de un array 
         Animal[][] jaulas = {jaula1, jaula2, jaula3, jaula4, jaula5};

        // Se crean 5 animales 
        Animal animal1 = new Animal("L1", "leon", "enfermo", h1);
        Animal animal2 = new Animal("M1", "mono", "sano", h2);
        //Animal animal3 = new Animal("M2", "mono", "sano", h3);
        Animal animal4 = new Animal("A1", "aguila", "enfermo", h4);
        //Animal animal5 = new Animal("A2", "aguila", "sano", h5);
        // Se crean 5 animales
        // Animal animal6 = new Animal("L2", "leon", "enfermo", h6);
        // Animal animal7 = new Animal("M3", "leon", "sano", h7);
        // Animal animal8 = new Animal("M4", "mono", "sano", h8);
        // Animal animal9 = new Animal("A3", "aguila", "enfermo", h9);
        // Animal animal10 = new Animal("L3", "leon", "enfermo", h10);

       
        // Se utilizan para el método agregar animal
        // Son un candado para que no haya leones en donde hay monos o viceversa
        // No hay que modificar su valor
        prueba.set_hay_leon(false);
        prueba.set_hay_mono(false);
       
        // Se agregan animales a las jaulas
        prueba.agrega_animal(jaulas, animal1, jaula1);
        prueba.agrega_animal(jaulas, animal2, jaula2);
        prueba.agrega_animal(jaulas, animal4, jaula1);

        
        // Se imprimen los identificadores de los animales 
        prueba.imprime_identificador(jaulas, jaula1);
        prueba.imprime_identificador(jaulas, jaula2);

        
        // Se imprime la salud de los animales que hay en la jaula
        prueba.imprime_salud(jaulas, jaula1);
        // Se imprime el tipo de animal que hay en la jaula 
        prueba.imprime_animal(jaulas, jaula1);
        // Se imprime el horario de comida de los animales
        prueba.imprime_horario(jaulas, jaula1);
        // Se imprime el número de especies que hay en la jaula
        prueba.conteo_especies(jaulas, jaula1);
        // Se imprime la información de un aimal dado su número de serie 
        prueba.informacion_animal(jaulas, "M1");

        // Se cambia un animal de jaula, de la jaula-i a la jaula-j
        // En este caso se cambia al animal4 a la jaula-2, sabiendo que el animal4 se encuentra en un inicio en la jaula1
        prueba.cambiar_animal(jaulas, animal4, jaula2);
        // Se imprimen los identificadores para ver que si se pudo hacer el cambio
        prueba.imprime_identificador(jaulas, jaula2);

    }

}