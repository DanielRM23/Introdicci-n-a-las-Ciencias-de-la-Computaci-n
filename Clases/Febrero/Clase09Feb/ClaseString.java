
public class ClaseString {

	public static void main(String[] args) {

		String cadenaPrueba = "THE LAST OF US";

		System.out.println(cadenaPrueba.charAt(0));

		System.out.println(cadenaPrueba.contains("HE"));

		int pos = cadenaPrueba.indexOf('S');
		System.out.println(pos);

		System.out.println(cadenaPrueba.isEmpty());

		System.out.println(cadenaPrueba.length());

		String minusculas = cadenaPrueba.toLowerCase();

		System.out.println(cadenaPrueba);
		System.out.println(minusculas);

	}

}



