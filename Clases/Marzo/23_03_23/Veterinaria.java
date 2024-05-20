// Se crea la clase veterinaria
public class Veterinaria{

    String servicio; 
    int precio;
    Mascota mascota;
    Duenio duenio;
    

    // Método constructor 
    public Veterinaria(String servicio, int precio, Duenio duenio, Mascota mascota){
        this.servicio = servicio;
        this.precio = precio;
        this.duenio = duenio;
        this.mascota = mascota;  
    }

    // Se hacen los sets
    public void setServicio(String nuevo_servicio){
        nuevo_servicio = servicio; 
    }

    public void setPrecio(double nuevo_precio){
        nuevo_precio = precio; 
    }
    
    public void setDuenio(Duenio nuevo_duenio){
        nuevo_duenio = duenio; 
    }
    
    public void setMascota(Mascota nueva_mascota){
        nueva_mascota = mascota; 
    }

    
    //Se hacen los gets 
    public String getServicio(){
        return servicio;
    }

    public double getPrecio(){
        return precio;
    }

    public Duenio getDuenio(){
        return duenio;
    }

    public Mascota getMascota(){
        return mascota;
    }

    // Se hacen los métodos
    public void pedir_servicio(Duenio d, String servicio){
        
        if(d.getCita() == true){
            System.out.println("Sí tienes cita \n"); 
            System.out.println("El servicio que quieres es " + servicio + "\n");

            if(servicio == "vacuna"){
                System.out.print("El precio es: 150");

                double x = d.getPago()-150; 
                d.setPago(x);
            }

            if(this.servicio == "esteril"){
                System.out.print("El precio es: 900");
                
                double x = d.getPago() - 900; 
                d.setPago(x);
            }
        } 
            
        else{
            System.out.print("No se le atiende");
        }
    }

}