// Se importan los cosos que se utilizan 
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class usuario{

    // Atributos del usuario 
    String nombre;
    String correo;
    String contrasenia;
    boolean tipo;
    String libro_prestado;
    int cantidad_libros_prestados;

    ArrayList<usuario> usuarios = new ArrayList<usuario>();


    // Métodos set
    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public void set_correo(String correo) {
        this.correo = correo;
    }

    public void set_contrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void set_tipo(boolean tipo ) {
        this.tipo = tipo;
    }
    
    public void set_libro_prestado(String libro_prestado) {
        this.libro_prestado = libro_prestado;
    }

    public void set_cantidad_libros_prestados(int cantidad_libros_prestados) {
        this.cantidad_libros_prestados = cantidad_libros_prestados;
    }


    // Métodos get
    public String get_nombre() {
        return nombre;
    }

    public String get_correo() {
        return correo;
    }

    public String get_contrasenia() {
        return contrasenia;
    }

    public boolean get_tipo() {
        return tipo;
    }

    public int get_cantidad_libros_prestados() {
        return cantidad_libros_prestados;
    }



    // Método constructor
    public usuario(String nombre, String correo, String contrasenia){
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }


    public void registrar_usuario(){

        Scanner entrada4 = new Scanner(System.in);

        System.out.println("Introduce tu nombre completo ");
        String nombre_introducido = entrada4.nextLine();

        System.out.println("Introduce tu correo electrónico ");
        String correo_introducido = entrada4.nextLine();

        System.out.println("Por protocolo del sistema se proporciona una contraseña de 7 dígitos");
        System.out.println("Esta consta de números aleatorios entre 0 y 9");

        // Se genera la contraseña
        Random random = new Random();
        char[] caracteresAleatorios = new char[7];

        for (int i = 0; i < 7; i++) {
            int numeroAleatorio = random.nextInt(10); // Genera un número aleatorio entre 0 y 9
            caracteresAleatorios[i] = (char) (numeroAleatorio + '0');
        }

        String password = new String(caracteresAleatorios);
        System.out.println("La contraseña es " + password);

        // Se crea un objeto de tipo usuario y se almacena en la lista usuarios
        usuario nuevo_usuario = new usuario(nombre_introducido, correo_introducido, password);

        // cuando se crea al usuario, por defecto no tiene sanciones en el préstamo de los libros
        nuevo_usuario.set_tipo(true);

        usuarios.add(nuevo_usuario);

        System.out.println("-------------------------------------------------");

    }


    public void informacion_usuario(){

        for(int i =0; i< usuarios.size(); i++){
            System.out.println("Nombre: " + usuarios.get(i).get_nombre() );
            System.out.println("Correo: " + usuarios.get(i).get_correo() );
         
            if( usuarios.get(i).get_tipo() == true ){
                System.out.println("-Usuario normal- ");
            }
            else{
                System.out.println("-Usuario sancionado-");
            }

            System.out.println("-------------------------------------------------");

        }
    }










}