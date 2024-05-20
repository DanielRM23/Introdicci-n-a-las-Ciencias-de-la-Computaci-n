
public class UsoVeterinaria{

    public static void main(String[] args){

        Mascota m = new Mascota("Jake", "pug", 10);

        Duenio d = new Duenio("Panfilo", m, 1000, false); 

        Veterinaria v = new Veterinaria("vacuna", 900, d, m);


        v.pedir_servicio(d, v.getServicio());
        
        System.out.println(d.getPago());

    }
}