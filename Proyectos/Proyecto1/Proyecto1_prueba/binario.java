import java.util.Scanner;

public class binario {
    

    
    public void decimal_a_binario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número binario: ");
        String numeroBinario = sc.nextLine();
        int numeroDecimal = 0;
        int potencia = 0;
        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            if (numeroBinario.charAt(i) == '1') {
                numeroDecimal += Math.pow(2, potencia);
            }
            potencia++;
        }
        System.out.println("El número decimal equivalente es: " + numeroDecimal);
    
    }
        public void binario_a_decimal() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número decimal: ");
            int numeroDecimal = sc.nextInt();
            String numeroBinario = "";
            while (numeroDecimal > 0) {
                int residuo = numeroDecimal % 2;
                numeroBinario = residuo + numeroBinario;
                numeroDecimal /= 2;
            }
            System.out.println("El número binario equivalente es: " + numeroBinario);
        }

}