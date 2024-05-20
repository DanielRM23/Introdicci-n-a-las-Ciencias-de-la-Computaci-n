// ICC, práctica 3
// Daniel Rojo Mata
// Usando los dinosaurios 

public class UsoDinosaurio{

    public static void main(String[] args){

        // Se crean los dinosaurios
        Dinosaurio dino1 = new Dinosaurio("Moltres", "carnivoro", "caluroso", 20);
        Dinosaurio dino2 = new Dinosaurio("Articuno", "hervivoro", "frio", 50);
        Dinosaurio dino3 = new Dinosaurio("Zapdos", "hervivoro", "templado", 20);


        // Se imprime la información de los dinosaurios 
        // System.out.println(dino1);
        // System.out.println(dino2);
        // System.out.println(dino3);

        // El dinosaurio 1 come 
        // dino1.comer();
        // System.out.println(dino1);

        // El clima cambia para el dinosaurio 1 y 2
        // dino1.cambiar_clima();
        // dino2.cambiar_clima();

        // Afrontaciones que terminan en pelea
        // dino1.afrontar(dino2);
        // dino1.afrontar(dino3);
        dino3.afrontar(dino1);
    }
}