// Se crea la clase dueño

public class Duenio{

    String nombre;
    // Falta hacer la clase mascota
    Mascota mascota; 
    int pago; 
    // Esto es para ver si el dueño tienen cita sí o no
    boolean cita;

    // Método constructor 
    public Duenio(String nombre, Mascota mascota, int pago, boolean cita){
        this.nombre = nombre;
        this.mascota = mascota;
        this.pago = pago; 
        this.cita = cita; 
    }

    // Se hacen los sets
    public void setNombre(String nuevo_nombre){
        nuevo_nombre = nombre; 
    }

    public void setMascota(Mascota nueva_mascota){
        nueva_mascota = mascota; 
    }
    
    public void setPago(double nuevo_pago){
        nuevo_pago = pago; 
    }
    
    public void setCita(Boolean nueva_cita){
        nueva_cita = cita;  
    }
    
    //Se hacen los gets 
    public String getNombre(){
        return nombre;
    }

    public Mascota getMascota(){
        return mascota;

    }

    public int getPago(){
        return pago;
    }

    public boolean getCita(){
        return cita;
    }

}