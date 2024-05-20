// ICC, práctica 5
// Daniel Rojo Mata
// Duenio

public class Duenio {
	
	String nombre;
	Mascota mascota;

	public Duenio(String nombre, Mascota mascota) {
		this.nombre = nombre;
		this.mascota = mascota;
	}

	public Duenio(String nom) {
		nombre = nom;
	}

	public Duenio() {

	}

	public void set_nombre(String nuevo_nombre) {nombre = nuevo_nombre;}
	public void setMascota(Mascota nueva_mascota) {mascota = nueva_mascota;}

	public Mascota getMascota() {return mascota;}
	public String getNombre() {return nombre;}


	public void saluda_duenio() {
		System.out.println("Estas en la clase Duenio");
	}

	public String toString() {
		return "Hola, me llamo " + nombre;
	}


	
}