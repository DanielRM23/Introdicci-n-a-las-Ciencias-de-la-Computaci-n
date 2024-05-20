public class Ventas{

    public static void main(String[] args){
        Cafe cafe2 = new Cafe("mediano", "moka", 55, "calientito");
        Cliente persona2 = new Cliente("Dirac Gauss Euler", 100);

        System.out.println("Café vendido");

        System.out.println("El cliente "+ persona2.getnombre() + " compró un café " + cafe2.getTamanio() + " sabor " + cafe2.getsabor() + " y le costó " + cafe2.getcosto() + " pesos" );

    }

     public void comprar(String cliente, String producto, double pago){
        this.cliente = cliente; 
        this.producto = producto; 
     }


}