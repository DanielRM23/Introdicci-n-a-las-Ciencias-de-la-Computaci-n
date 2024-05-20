public class Cliente{

    private String nombre;
    private double dinero;


    // Constructor
    public Cliente(String nombre, double dinero){
        this.nombre = nombre;
        this.dinero = dinero;
    }


    // Se hacen los gets 
    public String getnombre(){
        return nombre;
    }

    public double getdinero(){
        return dinero;
    }
    
    //Se hacen los sets 
    
    public void setnombre(){
        this.nombre = nombre;
    }

    public void setdinero(){
        this.dinero = dinero;
    }


    public String toString(){
        String cadena = " ";
    
        cadena += "El nombre del cliente es: " + nombre + "\n";
        cadena += "Tiene: " + dinero + " pesos";
        
    
        return cadena; 
    
        }

}