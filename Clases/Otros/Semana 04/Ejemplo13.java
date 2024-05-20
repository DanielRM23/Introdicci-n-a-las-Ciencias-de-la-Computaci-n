import java.io.*;

class Ejemplo13 {
	public static void main(String[] args)
	{

		int i = 20;

		if (i < 10)
			System.out.println("i es menor que 10\n");

		// condition 2
		else if (i < 15)
			System.out.println("i es menor que 15\n");

		// condition 3
		else if (i < 20)
			System.out.println("i es menor que 20\n");

		else
			System.out.println("i es mas grande que "
							+ "o igual que 20\n");

		System.out.println("Fuera del bloque if-else-if");
	}
}
