public class persona{

    // public static void main(String[] args) {
    //     imprimir_personaje(0);
    // }

    // Constructor vacio
    public persona(){}

    public void imprimir_personaje(int indice){

        String [] etapas = {
            " +---+\n |   |\n O   |\n/|\\  |\n/ \\  |\n     | \n========",
            " +---+\n |   |\n O   |\n/|\\  |\n/    |\n     | \n========",
            " +---+\n |   |\n O   |\n/|\\  |\n     |\n     |\n========",
            " +---+\n |   |\n O   |\n/|   |\n     |\n     |\n========",
            " +---+\n |   |\n O   |\n |   |\n     |\n     |\n========",
            " +---+\n |   |\n O   |\n     |\n     |\n     |\n========",
            " +---+\n |   |\n     |\n     |\n     |\n     |\n========"
        };
        System.out.println(etapas[indice]);

    }

}