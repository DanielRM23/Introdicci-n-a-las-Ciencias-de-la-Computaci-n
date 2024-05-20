// ICC, práctica 5
// Daniel Rojo Mata
// Cartas

public class Carta{

    // Se definen los atributos
    String palo;
    //int valor;
    String valor; 
    

    // Se hacen los get
    public String get_palo(){ return palo; }
    //public int get_valor(){ return valor; }
    public String get_valor(){ return valor; }

    // Se hacen los set
    // En este caso no se necesitan, pero es buena práctica
    public void set_palo(String nuevo_palo){ palo = nuevo_palo; }
    public void set_valor(String nuevo_valor){ valor = nuevo_valor; }

    // Se hace el método constructor
    public Carta(String palo, String valor){
        this.palo = palo;
        this.valor = valor;
    }

    // Se imprimen los detalles de la carta, en este caso el palo y el valor
    public void detalles(){
        System.out.println("C A R T A: " + this.get_valor() + " de " + this.get_palo());
    }
    
}