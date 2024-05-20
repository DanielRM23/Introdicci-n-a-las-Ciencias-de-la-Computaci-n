
public class Persona {

	//public, private, protectec

	//Atributos
	String nombre;
	int edad;

	//Método constructor
	//nivel de encapsulación, tipo de retorno, nombre (lista de parámetros)

	public Persona(String n, int edad)   {
		nombre = n;
		this.edad = edad;
 	} 

 	public Persona() { }


 	//setter y getters
 	public void setNombre(String n) {
 		nombre = n;
 	}

 	public void setEdad(int e) {
 		edad = e;
 	}


 	public String getNombre() {
 		return nombre;
 	}


 	public int getEdad() {
 		return edad;
 	}


 	public String info() throws PersonaEdadMalException {
 		if(edad < 0) {
 			throw new PersonaEdadMalException("Edad inválida");
 		} else {
 			return "Hola, soy " + this.nombre + " tengo " + this.edad + " años";	
 		}	
 	}


 	public void comparaEdades(Persona primera, Persona segunda) {
 		if(primera.edad > segunda.edad) {
 			System.out.println(primera.nombre + " es mayor que " + segunda.nombre);
 		} else if(primera.edad < segunda.edad) {
 			System.out.println(segunda.nombre + " es mayor que " + primera.nombre);
 		} else {
 			System.out.println(segunda.nombre + " y " + primera.nombre + " tienen la misma edad");
 		}
 	}


 	public void comparaEdades2(Persona primera) {
 		if(primera.edad > this.edad) {
 			System.out.println(primera.nombre + " es mayor que " + this.nombre);
 		} else if(primera.edad < this.edad) {
 			System.out.println(this.nombre + " es mayor que " + primera.nombre);
 		} else {
 			System.out.println(this.nombre + " y " + primera.nombre + " tienen la misma edad");
 		}
 	}


 	public String regresaMensaje() {
 		return "Este es un mensaje de la clase Persona";

 	}

 	public void regresaMensaje2() {
 		System.out.println("Este es un mensaje de la clase Persona");

 	}





}

