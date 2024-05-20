
public class UsoMetodos {

	// Métodos estáticos

	// No regresa nada, no recibe nada
	public static void saluda() {
		System.out.println("Hola Mundo");
	}

	// No regresa nada, sí requiere parámetros
	public static void saluda2(String nombre) {
		System.out.println("Hola " + nombre);
	}

	// Sí regresa, no requiere parámetros
	public static String saluda3() {
		String cadena = "ZZZZZZZZZZZZZZZZZZZ";
		return cadena;
	}

	// Sí regresa, sí requiere parámetros
	public static String saluda4(String n) {
		String valor = "Hola, " + n;
		return valor;
	}

	public static void main(String[] args) {

		saluda();
		saluda2("Gabriela");

		System.out.println(saluda3());
		System.out.println(saluda4("Araceli"));

	}

}
