public class Cartas{

    // Se definen los atributos
    String palo;
    int valor;

    // Se hacen los get
    public String get_palo(){ return palo; }
    public int get_valor(){ return valor; }

    // Se hacen los set

    public void set_palo(String nuevo_palo){ palo = nuevo_palo; }
    public void set_valor(int nuevo_valor){ valor = nuevo_valor; }

    // Se hace el método constructor
    public Cartas(String palo, int valor){
        this.palo = palo;
        this.valor = valor;
    }


    public void detalles(){
        System.out.println("C A R T A: " + this.get_valor() + " de " + this.get_palo());
    }



    
}