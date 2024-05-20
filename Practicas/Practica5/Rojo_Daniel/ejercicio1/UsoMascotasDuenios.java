// ICC, práctica 5
// Daniel Rojo Mata
// UsoMascotasDuenios


// Se importan los cosos que se utilizan
import java.util.Scanner;
import java.util.Random;

public class UsoMascotasDuenios {


	// Método con el cual se vacuna a la mascota con base a las especificaciones requeridas
	// Primero se revisa si la mascota está vacunada contra Sarampión
		// Si la mascota sí está vacunada se pasa al siguiente filtro
			// Se observa si la mascota tiene covid
				// Si la mascota no tiene covid se pŕegunta si se quiere vacunar
				// Si la mascota sí tiene covid se pregunta si se quiere sanar (llamar a este método) y después se pregunta si se quiere vacunar

		// Si la mascota no está vacunada primero se pregunta si se quiere vacunar conra sarampión
			// Se observa si la mascota tiene covid
				// Si la mascota no tiene covid se pŕegunta si se quiere vacunar
				// Si la mascota sí tiene covid se pregunta si se quiere sanar (llamar a este método) y después se pregunta si se quiere vacunar
	
	// en todos los casos se pregunta si se quiere vacunar o no, en caso de que no se quiera vacunar a la mascota el programa finaliza
	public void adopcion(Mascota mascota){

		Scanner entrada_usuario = new Scanner(System.in);
		System.out.println("\n¿Quieres vacunar a tu mascota? \n1.- Si \n2.- No \n3.- En otro momento");
		int respuesta = entrada_usuario.nextInt();

		// Sí quiere vacunar a su mascota
		if(respuesta == 1){
			
			System.out.println("\nI N D I C A C I O N E S   G E N E R A L E S\n");
			System.out.println("*Hay dos posibles vacunas que se pueden aplicar; COVID y Sarampión");
			System.out.println("*Ten en cuenta que la vacuna del COVID no se puede aplicar si la mascota no está protegida contra el Sarampión");
			System.out.println("*La vacuna contra el COVID tampoco se puede aplicar si la mascota está enferma. \n");
			System.out.println("*Por protocolo, primero se hace un pequeño diagnóstico para ver si la mascota presenta Sarampión.\n");

			if(mascota.get_vacunado_sarampion() == true){
				System.out.println("D I A G N Ó S T I C O: La mascota parece no tener Sarampión.\n");
				System.out.println("*Ahora, se asegura que la mascota no esté enferma, en este caso, que tenga COVID.\n");

				if(mascota.get_enfermedad_covid() == false){
					System.out.println("D I A G N Ó S T I C O: La mascota no está enferma de COVID.");
					System.out.println("Tu mascota sí puede vacunarse contra COVID");
					System.out.println("\n¿Quieres vacunar a tu mascota contra el COVID \n1.- Si \n2.- No");
			
					int tipo_vacuna = entrada_usuario.nextInt();

					switch(tipo_vacuna){
					// Se eligió covid
						case 1:
							mascota.set_enfermedad_covid(false);
							mascota.set_vacunado_covid(true);
							System.out.println("¡Listo!, tu mascota ya fue vacunada contra el COVID");
						break;

						case 2:
							System.out.println("Está bien, pero recuerda que es importante vacunar a tu mascota.");
							System.out.println("Vuelve pronto :)");
						break;
					}
				}

				else if(mascota.get_enfermedad_covid()==true){
					System.out.println("D I A G N Ó S T I C O: La mascota está enferma de COVID.");
					System.out.println("Tu mascota está enferma, si quieres que sea vacunada contra COVID, es encesario que primero se cure.");
					System.out.println("¿Quieres curar a tu mascota? (esto llama al método sanar) \n1.- Si \n2.- No");

					int querer_sanar = entrada_usuario.nextInt();

					if(querer_sanar==1){
						this.sanar(mascota);
						System.out.println("Ahora que tu mascota ya está sana, ¿quieres vacunarla contra el COVID? \n1.- Si \n2.- No");
						int tipo_vacuna = entrada_usuario.nextInt();
						switch(tipo_vacuna){
						// Se eligió covid
							case 1:
								mascota.set_enfermedad_covid(false);
								mascota.set_vacunado_covid(true);
								System.out.println("¡Listo!, tu mascota ya fue vacunada contra el COVID");
							break;
							case 2:
								System.out.println("Está bien, pero recuerda que es importante vacunar a tu mascota.");
								System.out.println("Vuelve pronto :)");
							break;
						}
					}
				}
			}

			else{
				System.out.println("D I A G N O S T I C O: La mascota podría tener Sarampión. ");
				System.out.println("Tu mascota no puede vacunarse contra COVID en primera instancia por protocolo");
				System.out.println("Si quieres que tu mascota pueda ser vacunada contra COVID es necesario que primero la vacunes contra el Sarampión.");
				System.out.println("\n¿Quieres vacunar a tu mascota contra Sarampión ? \n1.- Si \n2.- No");

				int respuesta2 = entrada_usuario.nextInt();

				// La quiere vacunar contra el Sarampión
				if(respuesta2 == 1){
					mascota.set_enfermedad_sarampion(false);
					mascota.set_vacunado_sarampion(true);

					System.out.println("\nPerfecto. Tu mascota ya fue vacunada contra Sarampión\n");
					System.out.println("Ahora, se asegura que la mascota no esté enferma, en este caso, que tenga COVID.\n");

					if(mascota.get_enfermedad_covid() == false){
						System.out.println("D I A G N Ó S T I C O: La mascota no está enferma de COVID.");
						System.out.println("Tu mascota sí puede vacunarse contra COVID");
						System.out.println("\n¿Quieres vacunar a tu mascota contra el COVID \n1.- Si \n2.- No");
				
						int tipo_vacuna = entrada_usuario.nextInt();

						switch(tipo_vacuna){
						// Se eligió covid
							case 1:
								mascota.set_enfermedad_covid(false);
								mascota.set_vacunado_covid(true);
								System.out.println("¡Listo!, tu mascota ya fue vacunada contra el COVID");
							break;
							case 2:
								System.out.println("Está bien, pero recuerda que es importante vacunar a tu mascota.");
								System.out.println("Vuelve pronto :)");
							break;
						}
					}

					else if(mascota.get_enfermedad_covid()==true){
					System.out.println("D I A G N Ó S T I C O: La mascota está enferma de COVID.");
					System.out.println("Tu mascota está enferma, si quieres que sea vacunada contra COVID, es encesario que primero se cure. \n");
					System.out.println("¿Quieres curar a tu mascota? (esto llama al método sanar) \n1.- Si \n2.- No");

					int querer_sanar = entrada_usuario.nextInt();

						if(querer_sanar==1){
							this.sanar(mascota);
							System.out.println("Ahora que tu mascota ya está sana, ¿quieres vacunarla contra el COVID? \n1.- Si \n2.- No");
							int tipo_vacuna = entrada_usuario.nextInt();
							switch(tipo_vacuna){
								case 1:
									mascota.set_enfermedad_covid(false);
									mascota.set_vacunado_covid(true);
									System.out.println("¡Listo!, tu mascota ya fue vacunada contra el COVID");
								break;
								case 2:
									System.out.println("Está bien, pero recuerda que es importante vacunar a tu mascota.");
									System.out.println("Vuelve pronto :)");
								break;
							}
						}
					}
				}

				else{
					System.out.println("Está bien, pero recuerda, no podrá ser vacunada contra COVID.");
				}
			}
		}
		else if(respuesta==2){
			System.out.println("Recuerda que es muy importante vacunar a tus mascotas.");
		}
		else{
			System.out.println("Vuelve pronto :)");
		}
	}



	// Método con el cual se puede contraer covid en las mascotas
	public void contraerCovid(Mascota mascota){
		// Esto es para poder generar los porcentajes 
		// Se crea un array de 20 elementos 
		// el 5% de 20 es tomar un número
		// el 20% de 20 es tomar 4 números
		// el 95% de 20 es tomar 19 números
		int [] valores = new int[20];
		Random rand1 = new Random();
		// Se generan de forma aleatoria los valores
		int valor1 = rand1.nextInt(valores.length);
		int valor2 = rand1.nextInt(valores.length);
		int valor3 = rand1.nextInt(valores.length);

		System.out.println("\nA T E N C I Ó N\n");
		System.out.println("Existe la posibilidad de que tu mascota contraiga COVID bajo los siguientes porcentajes");
		System.out.println("* Si la mascota está vacunada contra el Sarampión y el COVID tendrá 5% de probabilidad de enfermarse");
		System.out.println("* Si la mascota no tiene la vacuna del COVID pero sí la del Sarampión, tendrá 20% de probabilidad de enfermarse");
		System.out.println("* Si la mascota no está vacunada contra nada, tendrá un 95% de probabilidad de enfermarse");

		// Se muestran las vacunas que tienen las mascotas
		System.out.println("\nTu mascota presenta las siguientes vacunas:");
		if(mascota.get_vacunado_covid()==true ){
			System.out.println("\t*Sí tiene vacuna contra COVID");
		}
		
		if(mascota.get_vacunado_sarampion()==true){
			System.out.println("\t*Si tiene vacuna contra Sarampión");
		}
		
		if(mascota.get_vacunado_covid()==false){
			System.out.println("\t*No tiene vacuna contra COVID");
		}
		
		if(mascota.get_vacunado_sarampion()==false){
			System.out.println("\t*No tiene vacuna contra Sarampión\n");
		}

		// La mascota está vacunada contra ambas enfermedades
		if(mascota.get_vacunado_covid() == true && mascota.get_vacunado_sarampion() == true){
			// Esto representa el 5%
			if(valor1 == 1){
				System.out.println("\nI M P O R T A N T E: Tu mascota se contagió de COVID, :(");
				mascota.set_enfermedad_covid(true);
			}
			else{
				System.out.println("\nI M P O R T A N T E: Tu mascota no se contagió :)");
			}
		}
		// La mascota solo presenta una vacuna
		else if(mascota.get_vacunado_covid()==false && mascota.get_vacunado_sarampion()==true){
			// Esto representa el 20%
			if(valor2==1 || valor2 == 2 || valor2 == 3 || valor2 == 4){
				System.out.println("\nI M P O R T A N T E: Tu mascota se contagió de COVID, :(");
				mascota.set_enfermedad_covid(true);
			}
			else{
				System.out.println("\nI M P O R T A N T E: Tu mascota no se contagió :)");
			}
		}
		// La mascota no tiene vacunas 
		else if(mascota.get_vacunado_covid() == false && mascota.get_vacunado_sarampion() == false){
			// Esto representa el 95%
			if(valor3 != 1){
				System.out.println("\nI M P O R T A N T E: Tu mascota se contagió de COVID, :(");
				mascota.set_enfermedad_covid(true);
			}
			else{
				System.out.println("\nI M P O R T A N T E: Tu mascota no se contagió :)");
			}
		}
	}


	// Método para sanar a las mascotas
	public void sanar(Mascota mascota){
		System.out.println("\nTu mascota ya se siente mejor :) ");
		System.out.println("Ya no tiene enfermedades :') \n");
		mascota.set_enfermedad_covid(false);
		mascota.set_enfermedad_sarampion(false);
	}


	// Convivenvia de mascotas
	public void convivir(Mascota mascota1, Mascota mascota2){
		// Si las mascotas no están enfermas entonces pueden jugar libremente 
		if(mascota1.get_enfermedad_covid()==false && mascota1.get_enfermedad_sarampion()==false 
		&& mascota2.get_enfermedad_covid()==false && mascota2.get_enfermedad_sarampion()==false){
			System.out.println("Las mascotas están sanas, no tienen ninguna enfermedad, por lo que están jugando libremente");
		}

		// Si la mascota 1 está enferma, contagia a la mascota 2
		if(mascota1.get_enfermedad_covid()==true || mascota1.get_enfermedad_sarampion()==true){
			System.out.println("C U I D A D O: La mascota " + mascota1.getNombre() + " está enferma");
			if(mascota1.get_enfermedad_covid()==true && mascota1.get_enfermedad_sarampion()==true){
				System.out.println("La mascota " + mascota1.getNombre() + " tiene COVID y Sarampión por lo que al estar conviviendo con " + mascota2.getNombre() + " la contagió");
				mascota2.set_enfermedad_covid(true);
				mascota2.set_enfermedad_sarampion(true);
			}
			else if(mascota1.get_enfermedad_covid()==true){
				System.out.println("La mascota " + mascota1.getNombre() + " tiene COVID por lo que al estar conviviendo con " + mascota2.getNombre() + " la contagió");
				mascota2.set_enfermedad_covid(true);
			}
			else if(mascota1.get_enfermedad_sarampion()==true){
				System.out.println("La mascota " + mascota1.getNombre() + " tiene Sarampión por lo que al estar conviviendo con " + mascota2.getNombre() + " la contagió");
				mascota2.set_enfermedad_sarampion(true);
			}
		}
		// Si la mascota 2 está enferma entonces contagia a la mascota 1
		else if(mascota2.get_enfermedad_covid()==true || mascota2.get_enfermedad_sarampion()==true){
			System.out.println("C U I D A D O: La mascota " + mascota2.getNombre() + " está enferma");
			if(mascota2.get_enfermedad_covid()==true && mascota2.get_enfermedad_sarampion()==true){
				System.out.println("La mascota " + mascota2.getNombre() + " tiene COVID y Sarampión por lo que al estar conviviendo con " + mascota1.getNombre() + " la contagió");
				mascota1.set_enfermedad_covid(true);
				mascota1.set_enfermedad_sarampion(true);
			}
			else if(mascota2.get_enfermedad_covid()==true){
				System.out.println("La mascota " + mascota2.getNombre() + " tiene COVID por lo que al estar conviviendo con " + mascota1.getNombre() + " la contagió");
				mascota1.set_enfermedad_covid(true);
			}
			else if(mascota2.get_enfermedad_sarampion()==true){
				System.out.println("La mascota " + mascota2.getNombre() + " tiene Sarampión por lo que al estar conviviendo con " + mascota1.getNombre() + " la contagió");
				mascota1.set_enfermedad_sarampion(true);
			}
		}
		
		// Si ambas mascotas están enfermas, no querrán jugar
		if(mascota1.get_enfermedad_covid()==true && mascota1.get_enfermedad_sarampion()==true 
		&& mascota2.get_enfermedad_covid()==true && mascota2.get_enfermedad_sarampion()==true){
			System.out.println("\nLas mascotas están malitas, no tienen ganas de jugar :( \n");
		}

	}



	public static void main(String[] args) {

		// objetos con los cuales se llaman todos los métodos
		Vacuna vacuna = new Vacuna("SanaSana", "covid");
		UsoMascotasDuenios chequeo = new UsoMascotasDuenios();

		// Se crea el dueño y sus mascotas
		Duenio duenio1 = new Duenio("Martha");
		Mascota mascota1 = new Mascota("Turing", "pez", duenio1, false, true);

		Duenio duenio2 = new Duenio("Juan");
		Mascota mascota2 = new Mascota("Chopper", "venado", duenio2, false, false);


		// Se están asignando las mascotas a sus dueños.
		duenio1.setMascota(mascota1);
		duenio2.setMascota(mascota2);
		
	
		// // Estos son los detalles de las mascotas en un inicio
		mascota1.detalles_mascota();
		//mascota2.detalles_mascota();

		// // Esto es para ver si sí están vacunadas las mascotas 
		vacuna.esta_vacunado(mascota1);
		// vacuna.esta_vacunado(mascota2);

		// // Esto es para que el dueño sepa qué vacunas debe aplicar a su mascota en función de la enfermedad que tenga
		// vacuna.vacunas_a_aplicar(duenio1);
		//vacuna.vacunas_a_aplicar(duenio2);

		// // Esto es para saber si las mascotas pueden contraer covid o no
		// chequeo.contraerCovid(mascota2);
		
		// // Este método es para sanar a la mascota
		// chequeo.sanar(mascota2);

		// // Convivencia de las dos mascotas
		chequeo.convivir(mascota1, mascota2);

		// // Este es para vacunar a la mascota
		//chequeo.adopcion(mascota2);

		// // Detalles de las mascotas
		//mascota1.detalles_mascota();
		//mascota2.detalles_mascota();






	}



}

