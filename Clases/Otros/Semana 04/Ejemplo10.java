import java.util.Scanner;

public class Ejemplo10 {
	public static void main(String[] args)
	{
		int num = 10;

		int result = +num;
		System.out.println(
			"El resultado del valor unario mas es: "
			+ result);

		result = -num;
		System.out.println(
			"El resultado del valor unario menos es: "
			+ result);

		result = ++num;
		System.out.println(
			"El resultado del valor despues del pre-incremento es: "
			+ result);

		result = num++;
		System.out.println(
			"El resultado del valor despues del post-incremento es: "
			+ result);

		result = --num;
		System.out.println(
			"El resultado del valor despues del pre-decremento es: "
			+ result);

		result = num--;
		System.out.println(
			"El resultado del valor despues del post-decremento es: "
			+ result);
	}
}