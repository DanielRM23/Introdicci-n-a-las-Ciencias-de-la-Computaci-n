import java.util.Scanner;

public class Ejemplo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa el primer numero: ");
		double num1 = sc.nextDouble();

		System.out.print("Ingresa el segundo numero: ");
		double num2 = sc.nextDouble();

		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;

		System.out.println("La suma de dos numeros es: " + sum);
		System.out.println("La resta de dos numeros es: " + difference);
		System.out.println("El producto de dos numeros es: " + product);
		System.out.println("La division de dos numeros es: " + quotient);
	}
}
