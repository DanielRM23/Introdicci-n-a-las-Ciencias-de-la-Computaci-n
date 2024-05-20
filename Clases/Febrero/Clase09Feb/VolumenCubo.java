
public class VolumenCubo {

	public static void main(String[] args) {

		double lado = 3.5;
		// double volumen = lado * lado * lado;
		// Usando Math
		double volumen = Math.pow(lado, 3);

		System.out.println("El volumen de un cubo de lado " + lado + " es " + volumen);

	}

}
