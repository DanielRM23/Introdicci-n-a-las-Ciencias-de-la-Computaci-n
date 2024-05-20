import java.util.Scanner;

public class AccesosPC {


	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String usuario1 = "miguel";
		String contrasenia1 = "robot";
		String usuario2 = "alonso";
		String contrasenia2 = "raton";
	
		System.out.println("Programa de acceso son usuario y contraseña");
		
		System.out.println("Escribe tu usuario");
		String usuarioLeido = entrada.next();
		
		System.out.println("Escribe tu contraseña");
		String contraseniaLeida = entrada.next();


/*
		if(usuarioLeido.equals(usuario1) && contraseniaLeida.equals(contrasenia1) ) {
		
			System.out.println("Bienvenido administrador");
		
		
		} else if (usuarioLeido.equals(usuario2) && contraseniaLeida.equals(contrasenia2) ) {
			System.out.println("Bienvenido usuario normal");


		} else {
		
			System.out.println("Datos incorrectos");
		
		}
		
		
	*/
	if(usuarioLeido.equals(usuario1) && contraseniaLeida.equals(contrasenia1) || usuarioLeido.equals(usuario2) && contraseniaLeida.equals(contrasenia2) ) {
	
		if(usuarioLeido.equals(usuario1) ) {
			System.out.println("Bienvenido administrador");
		
		} else {
			System.out.println("Bienvenido usuario normal");
		}
		
	
	} else {
	
		System.out.println("Datos incorrectos");
	
	}
	
		
		

	}

}









