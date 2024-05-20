import java.io.*;

class Ejemplo15 {
	public static void main (String[] args) {
	int i=0;
    System.out.println("Antes del ciclo");
        while (i<=10)
        {
            System.out.println("Dentro del ciclo");
            System.out.println(i);
            i++;
            System.out.println(i);
        }
	}
}