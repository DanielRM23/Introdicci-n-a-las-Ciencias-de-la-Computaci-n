import java.util.Scanner;

public class AreaCirculoInteractivo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa que calcula e imprime al área de un círculo dado su radio");

		System.out.println("Dame el valor del radio");

		double radio = entrada.nextDouble();
		double area = Math.PI * Math.pow(radio, 2);

		System.out.println("El área del círculo de radio " + radio + " es " + area);

	}

}