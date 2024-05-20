// Se crea la clase mascota

public class Mascota{

    String nombre;
    String raza; 
    double peso; 
    

    // Método constructor 
    public Mascota(String nombre, String raza, double peso){
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;  
    }

    // Se hacen los sets
    public void setNombre(String nuevo_nombre){
        nuevo_nombre = nombre; 
    }

    public void setRaza(String nueva_raza){
        nueva_raza = raza; 
    }
    
    public void setPeso(double nuevo_peso){
        nuevo_peso = peso; 
    }
    
    //Se hacen los gets 
    public String getNombre(){
        return nombre;
    }

    public String getRaza(){
        return raza;

    }

    public double getPeso(){
        return peso;
    }
    

}