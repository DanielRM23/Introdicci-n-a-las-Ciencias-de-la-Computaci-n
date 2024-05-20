// ICC, práctica 5
// Daniel Rojo Mata
// Mascota

public class Mascota {
	
	String nombre;
	String especie;
	Duenio d;
	boolean enfermedad_covid;
	boolean enfermedad_sarampion;
	boolean vacunado_covid;
	boolean vacunado_sarampion;

	//Constructor
	public Mascota(String n, String e, Duenio d, boolean vacunado_covid, boolean vacunado_sarampion) {
		nombre = n;
		especie = e;
		this.d = d;
		this.vacunado_covid = vacunado_covid;
		this.vacunado_sarampion = vacunado_sarampion;

		if(vacunado_sarampion == true){
			this.enfermedad_sarampion = false;
		}
		else if(vacunado_sarampion == false){
			this.enfermedad_sarampion= true;
		}

		if(vacunado_covid==true){
			this.enfermedad_covid = false;
		}
		else if(vacunado_covid==false){
			this.enfermedad_covid = true;
		}
	}


	// Se hacen los sets
	public void setNombre(String n){nombre = n;}
	public void setEspecie(String e){especie = e;}
	public void setDuenio(Duenio d){this.d = d;}
	public void set_enfermedad_covid(boolean nueva_enfermedad_covid){enfermedad_covid = nueva_enfermedad_covid;}
	public void set_enfermedad_sarampion(boolean nueva_enfermedad_sarampion){enfermedad_sarampion = nueva_enfermedad_sarampion;}
	public void set_vacunado_covid(boolean nuevo_vacunado_covid){vacunado_covid = nuevo_vacunado_covid; }
	public void set_vacunado_sarampion(boolean nuevo_vacunado_sarampion){vacunado_sarampion = nuevo_vacunado_sarampion;}


	// Se hacen los gets 
	public String getNombre(){return nombre;}
	public String getEspecie(){return especie;}
	public Duenio getDuenio(){return d;}
	public boolean get_enfermedad_covid(){return enfermedad_covid;}
	public boolean get_enfermedad_sarampion(){return enfermedad_sarampion;}
	public boolean get_vacunado_covid(){return vacunado_covid; }
	public boolean get_vacunado_sarampion(){return vacunado_sarampion; }


	public void saludaMascota() {
		System.out.println("Estas en la clase Mascota");
	}

	// Se imprimen los detalles de la mascota
	public void detalles_mascota(){
		if(this.getDuenio() != null){
			System.out.println("\nI N F O R M A C I Ó N  D E  L A  M A S C O T A\n");
			System.out.println("*Nombre del dueño: " + this.d.getNombre() );
			System.out.println("*Nombre de la mascota: " + this.getNombre() );
			System.out.println("*Especie: " + this.getEspecie());
			System.out.println("*Enfermedades: ");

			if(this.get_enfermedad_covid()==true){
				System.out.println("\t*COVID: Si");
			}
			else if(this.get_enfermedad_covid()==false){
				System.out.println("\t*COVID: No");
			}
			
			if(this.get_enfermedad_sarampion()==true){
				System.out.println("\t*Sarampión: Si");
			}
			else if(this.get_enfermedad_sarampion()==false){
				System.out.println("\t*Sarampión: No");
			}

			System.out.println("*Vacunas:");
			if(this.get_vacunado_covid()==true){
				System.out.println("\t*Contra COVID: Si");
			}
			else if(this.get_vacunado_covid()==false){
				System.out.println("\t*Contra COVID: No");
			}

			if(this.get_vacunado_sarampion()==true){
				System.out.println("\t*Contra Sarampión: Si");
			}
			else if(this.get_vacunado_sarampion()==false){
				System.out.println("\t*Contra Sarampión: No");
			}

			System.out.println();
		}
		else{
			System.out.println("El dueño no tiene mascota");
		}
		
	}

	
	public String toString() {
		String cad="";

		if(d != null) {
			if(d.getNombre()!= null){
				cad = "Soy la mascota " + especie + " de nombre " + nombre + " y mi dueño es " + d.getNombre();
			} 
			else{
				cad = "Soy la mascota " + especie + " de nombre " + nombre + " y no tengo dueño"; 
			}
		} 
		else{
			cad = "Soy la mascota " + especie + " de nombre " + nombre + " y mi dueño no existe"; 
		}
		return cad;
	}
}


