

public class PruebaPersona {
	
	public static void main(String[] args) {

		//creamos un objeto de tipo Persona
		Persona p = new Persona("Jimena", 20);	
		Persona p2 = new Persona("Diego", -2);
		
		try {
			System.out.println(p.info());
			System.out.println(p2.info());
		} catch(PersonaEdadMalException exception) {
			System.out.println("Estás creando personas inconsistentes de información");
			System.out.println(exception);
		}
		
		
		
	}


}