import java.util.Random;

public class LanzarDados {


	public static void main(String[] args) {

		Random aleatorios = new Random();

		int dado = aleatorios.nextInt(6)+1;

		switch(dado) {
			case 1:
				System.out.println("*");
				break;
			case 2:
				System.out.println("*");
				System.out.println("*");
				break;
			case 3:
				System.out.println("*");
				System.out.println("  *");
				System.out.println("    *");
				break;
			case 4:
				System.out.println("*  *");
				System.out.println("*  *");
				break;
			case 5:
				System.out.println("*   *");
				System.out.println("  * ");
				System.out.println("*   *");
				break;
			case 6:
				System.out.println("* *");
				System.out.println("* *");
				System.out.println("* *");
				break;
				
		}
	


	}

}



