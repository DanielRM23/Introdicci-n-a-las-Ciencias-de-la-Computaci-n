import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class libro{

    String isbn;
    String titulo;
    String autor;
    String tema;
    String editorial;
    String numero_paginas; 
    int ejemplares;

    ArrayList<libro> biblioteca = new ArrayList<libro>();


    //Método constructor
    public libro(String isbn, String titulo, String autor, String tema, String editorial, String numero_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.editorial = editorial;
        this.numero_paginas = numero_paginas;
    }

    // constructor vacío 
    //public libro(){} 
    
    // Métodos set
    public void set_isbn(String isbn) {
        this.isbn = isbn;
    }

    public void set_titulo(String titulo) {
        this.titulo = titulo;
    }

    public void set_autor(String autor) {
        this.autor = autor;
    }

    public void set_tema(String tema) {
        this.tema = tema;
    }

    public void set_editorial(String editorial) {
        this.editorial = editorial;
    }

    public void set_numero_paginas(String numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public void set_ejemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    // Métodos get
    public String get_isbn() {
        return isbn;
    }

    public String get_titulo() {
        return titulo;
    }

    public String get_autor() {
        return autor;
    }

    public String get_tema() {
        return tema;
    }

    public String get_editorial() {
        return editorial;
    }

    public String get_numero_paginas() {
        return numero_paginas;
    }

    public int get_ejemplares() {
        return ejemplares;
    }


    
    //Métódo con el cual el usuario ingresa los datos de un libro
    public void registrar_libro(){

        Scanner entrada0 = new Scanner(System.in);

        System.out.println("Introduce el ISBN del libro");
        String sbn_introducido = entrada0.nextLine();
        //this.set_isbn(sbn_introducido);

        System.out.println("Introduce el título del libro");
        String titulo_introducido = entrada0.nextLine();
        this.set_titulo(titulo_introducido);
        
        System.out.println("Introduce el autor del libro:");
        String autor_introducido = entrada0.nextLine();
        //this.set_autor(autor_introducido);

        System.out.println("Introduce el tema del libro:");
        String tema_introducido = entrada0.nextLine();
        //this.set_tema(tema_introducido);

        System.out.println("Introduce la editorial del libro:");
        String editorial_introducido = entrada0.nextLine();
        this.set_editorial(editorial_introducido);

        System.out.println("Introduce el número de páginas del libro:");
        String numero_paginas_introducido = entrada0.nextLine();
        //this.set_numero_paginas(numero_paginas_introducido);

        // Se agrega el libro a la lista biblioteca
        libro libro_nuevo = new libro(sbn_introducido, titulo_introducido, autor_introducido,
        tema_introducido, editorial_introducido, numero_paginas_introducido);

        // Cuando se registra un libro cuenta con 2 ejemplares 
        libro_nuevo.set_ejemplares(2);

        biblioteca.add(libro_nuevo);

        System.out.println("-------------------------------------------------");
    }


    //Métódo con el cual el usuario edita los datos de un libro
    public void editar_libro(){

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Elige qué campo del libro quieres cambiar");

        System.out.println("1.- ISBN");
        System.out.println("2.- Título");
        System.out.println("3.- Autor");
        System.out.println("4.- Tema");             
        System.out.println("5.- Editorial");
        System.out.println("6.- # páginas");

        int opcion_elegida = entrada1.nextInt();

        switch(opcion_elegida){
            case 1: 
                System.out.println("Introduce el nuevo ISBN");
                String sbn_introducido = entrada2.nextLine();
                this.set_isbn(sbn_introducido);
                break;
            
            case 2:
                System.out.println("Introduce el nuevo título");
                String titulo_introducido = entrada2.nextLine();
                this.set_titulo(titulo_introducido);
                break;
            
            case 3: 
                System.out.println("Introduce el nuevo autor");
                String autor_introducido = entrada2.nextLine();
                this.set_titulo(autor_introducido);
                break;
            
            case 4: 
                System.out.println("Introduce el nuevo tema");
                String tema_introducido = entrada2.nextLine();
                this.set_tema(tema_introducido);
                break;
            
            case 5:
                System.out.println("Introduce la nueva editorial");
                String editorial_introducido = entrada2.nextLine();
                this.set_editorial(editorial_introducido);
                break;
            
            case 6:
                System.out.println("Introduce el nuevo número de páginas");
                String numero_paginas_introducido = entrada2.nextLine();
                this.set_numero_paginas(numero_paginas_introducido);
                break;
            
            default:
                System.out.println("Algo falló, selecciona alguno de los números anteriores");
        }
        
        System.out.println("-------------------------------------------------");
    }


    // Método con el cual se obtiene la información de todos los libros que se encuentran en la biblio        
    public void informacion_libro(){

        for(int i =0; i< biblioteca.size(); i++){
            System.out.println("ISBN: " + biblioteca.get(i).get_isbn() );
            System.out.println("Título: " + biblioteca.get(i).get_titulo() );
            System.out.println("Autor: " + biblioteca.get(i).get_autor() );
            System.out.println("Tema: " + biblioteca.get(i).get_tema() );
            System.out.println("Editorial: " + biblioteca.get(i).get_editorial() );
            System.out.println("Número de páginas: " + biblioteca.get(i).get_numero_paginas() );
         
            if( biblioteca.get(i).get_ejemplares() == 2){
                System.out.println("Estado: DISPONIBLE");
            }
            else{
                System.out.println("Estado: EN PRÉSTAMO");
            }
        }

        System.out.println("-------------------------------------------------");
    }
    

    // Método con el cual se elimina un libro del sistema con base a su isbn 
    public void eliminar_libro(){
        
        Scanner entrada3 = new Scanner(System.in);

        System.out.println("Ingresa el ISBN del libro que quieres buscar");

        String isbn_introducido = entrada3.nextLine();
        int indice_libro_borrar = -1; 

        for(int i=0; i < biblioteca.size(); i++){
            // Los ejemplares no están en préstamo
            if( biblioteca.get(i).get_ejemplares() == 2 ){
                // primero vemos en que posición está el coso y se guarda el índice en una variable
                if( biblioteca.get(i).get_isbn().equals(isbn_introducido) ){
                    indice_libro_borrar = i;
                    break;
                }
            }
        }

        // Una vez se encontró el índice, se borra de la lista
        System.out.println("Se ha eliminado el libro del sistema");
        biblioteca.remove(indice_libro_borrar);

        System.out.println("-------------------------------------------------");
    }



    // método con el cual se pide prestado un libro 
    public void prestar_libro(){

        Scanner entrada4 = new Scanner(System.in);

        System.out.println("Ingresa el ISBN del libro");
        String isbn_introducido = entrada4.nextLine();

        System.out.println("Ingresa la clave de usuario");
        String clave_introducida = entrada4.nextLine();

        // índices que se utilizan para encontrar al usuario dado la clave y el libro dado el isbn 
        int indice_libro = -1;
        int indice_usuario = -1;

        int libros_prestados_actuales = usuarios.get(indice_usuario).get_cantidad_libros_prestados();
        boolean tipo_usuario = usuarios.get(indice_usuario).get_tipo();
        String libro_a_prestar = biblioteca.get(indice_libro).get_titulo();

        // Se obtiene el índice del usuario con la contraseña dada
        for(int i=0; i<usuarios.size(); i++){
            if(usuarios.get(i).get_contrasenia().equals(clave_introducida)){
                indice_usuario = i;
                break;
            }
        }

        // Se obtiene el índice del libro con el isbn dado
        for(int i =0; i< biblioteca.size(); i++){
            if( biblioteca.get(i).get_isbn().equals(isbn_introducido) ){
                indice_libro = i;
                break;
            }
        }

        // Estas son las restricciones que se impusieron 
        // Si no hay ejemplares entonces no se puede prestar el libro 
        if(biblioteca.get(indice_libro).get_ejemplares() == 0){
            System.out.println("No hay ejemplares del libro");
        }
        // Esto es por si el usuario tiene una sanción 
        else if( tipo_usuario == false){
            System.out.println("El usuario tiene una sanción, no se puede realizar el préstamo");
        }
        else{
            if(libros_prestados_actuales == 2){
                System.out.println("El usuario ya cuenta con dos libros en préstamo.");
                System.out.println("No es posible prestarle más libros.");
            }

            if( libros_prestados_actuales == 0 ){
                usuarios.get(indice_usuario).set_libro_prestado1( libro_a_prestar );   
                usuarios.get(indice_usuario).set_cantidad_libros_prestados(libros_prestados_actuales + 1); 
                System.out.println("El libro fue prestado con éxito");
            }
            else if(libros_prestados_actuales == 1 ){
                usuarios.get(indice_usuario).set_libro_prestado2( libro_a_prestar ); 
                usuarios.get(indice_usuario).set_cantidad_libros_prestados(libros_prestados_actuales + 1);
                System.out.println("El libro fue prestado con éxito");
            }
        }

        System.out.println("-------------------------------------------------");
    }


    // Atributos del usuario 
    String nombre;
    String correo;
    String contrasenia;
    boolean tipo;
    String libro_prestado1;
    String libro_prestado2;
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
        
    public void set_libro_prestado1(String libro_prestado1) {
            this.libro_prestado1 = libro_prestado1;
        }
    
    public void set_libro_prestado2(String libro_prestado2) {
        this.libro_prestado2 = libro_prestado2;
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

    public String get_libro_prestado1() {
        return libro_prestado1;
    }    

    public String get_libro_prestado2() {
        return libro_prestado2;
    }  

    public int get_cantidad_libros_prestados() {
            return cantidad_libros_prestados;
        }


    // Método constructor
    // public usuario(String nombre, String correo, String contrasenia){
    //     this.nombre = nombre;
    //     this.correo = correo;
    //     this.contrasenia = contrasenia;
    // }


    // Método con el cual se registra un usuario
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

        //Cuando se crea un usuarioo, éste no tiene libros prestados de momento
        nuevo_usuario.set_cantidad_libros_prestados(0);

        // Los libros están vacíos
        nuevo_usuario.set_libro_prestado1(" ");
        nuevo_usuario.set_libro_prestado2(" ");


        // Se agrega el nuevo usuario a la lista
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
    
            
            if(usuarios.get(i).get_cantidad_libros_prestados() == 0){
                System.out.println("El usuario no ha solicitado libros");
            }
            else if( usuarios.get(i).get_cantidad_libros_prestados() != 0 ){
                System.out.println( usuarios.get(i).get_libro_prestado1() );
                System.out.println( usuarios.get(i).get_libro_prestado2() );
            }
            
            System.out.println("-------------------------------------------------");
    
        }
    }

}




