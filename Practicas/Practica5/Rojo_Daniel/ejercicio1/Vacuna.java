// ICC, práctica 5
// Daniel Rojo Mata
// Vacuna

public class Vacuna{

    // Estos son los atributos de la vacuna
    String marca;
    // Esta es la enfermedad que ataca 
    String enfermedad;


    // Se hacen los gets 
	public String get_marca(){return marca;}
    public String get_enfermedad(){return enfermedad;}

    // Se hacen los sets
    public void set_marca(String nueva_marca){marca = nueva_marca;}
    public void set_enfermedad(String nueva_enfermedad){enfermedad = nueva_enfermedad; }
  
  
    // Constructor vacio
    public Vacuna(String marca, String enfermedad){}


    // Método que revisa si la mascota está vacunada contra el covid y el sarampión
	public void esta_vacunado(Mascota mascota){
        if(mascota.get_vacunado_covid() == false){
            System.out.println("La mascota " + mascota.getNombre() + ", cuyo dueño/a es " + mascota.getDuenio().getNombre() + ", N0 está vacunada contra el COVID");
        }
		else{
			System.out.println("La mascota " + mascota.getNombre() + ", cuyo dueño/a es " + mascota.getDuenio().getNombre() + ", SÍ está vacunada contra el COVID");
		}

		if(mascota.get_vacunado_sarampion()== false){
			System.out.println("La mascota " + mascota.getNombre() + ", cuyo dueño/a es " + mascota.getDuenio().getNombre() + ", NO está vacunada contra el sarampión");
		}
		else{
			System.out.println("La mascota " + mascota.getNombre() + ", cuyo dueño/a es " + mascota.getDuenio().getNombre() + ", SÍ está vacunada contra el sarampión");
		}
    }
	

	// Método que nos dice que vacunas se les debe aplicar a las mascotas si es que estas tienen alguna enfermedad 
	public void vacunas_a_aplicar(Duenio duenio){
		if(duenio.getMascota() != null){
			System.out.println("\n¡Hola " + duenio.getNombre() + "!");
			System.out.println("Recuerda que debes vacunar a tu mascota.");
			System.out.println();
			if(duenio.mascota.get_enfermedad_covid() == true){
				System.out.println("Tu mascota tiene COVID, debes vacunarla" );
			}
			else{
				System.out.print("Al parecer tu mascota no tiene COVID, no hay de qué preocuparse :) \n");
			}
			
			if(duenio.mascota.get_enfermedad_sarampion()==true){
				System.out.println("Tu mascota tiene sarampión, debes vacunarla.");
				System.out.println();
			}
			else{
				System.out.print("Al parecer tu mascota no tiene Sarampión, no hay de qué preocuparse :) \n");
			}
		}
		else{
			System.out.println("El dueño, de nombre " + duenio.getNombre() + ", no tiene mascotas a su cargo \n");
		}
	}


}