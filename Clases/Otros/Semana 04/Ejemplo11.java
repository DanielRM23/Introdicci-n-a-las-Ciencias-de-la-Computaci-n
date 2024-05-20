import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1 =1;
        int num2 = 2;
        
        
        System.out.println("num1 > num2 es " + (num1 > num2));
        System.out.println("num1 < num2 es " + (num1 < num2));
        System.out.println("num1 >= num2 es " + (num1 >= num2));
        System.out.println("num1 <= num2 es " + (num1 <= num2));
        System.out.println("num1 == num2 es " + (num1 == num2));
        System.out.println("num1 != num2 es " + (num1 != num2));
    }
}