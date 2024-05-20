// Se importan los cosos que se utilizan 
import java.util.ArrayList;
import java.util.Scanner;


public class VideoJuego{

    // Se definen los atributos
    String titulo;
    String genero;
    String compania;

    // Se definen las 2 listas con las cuales se va a trabajar 
    ArrayList<VideoJuego> lista_videojuegos1 = new ArrayList<VideoJuego>();
    ArrayList<VideoJuego> lista_videojuegos2 = new ArrayList<VideoJuego>();
    // Listas auxiliares con las cuales se trabaja
    ArrayList<VideoJuego> lista_union = new ArrayList<>();
    ArrayList<String> lista_union_titulos = new ArrayList<>();
    ArrayList<VideoJuego> lista_interseccion = new ArrayList<>();
    ArrayList<String> lista_interseccion_titulos = new ArrayList<>();

    ArrayList<String> lista1_titulos = new ArrayList<>();
    ArrayList<String> lista2_titulos = new ArrayList<>();




    // Método constructor
    public VideoJuego(String titulo, String genero, String compania){
        this.genero = genero;
        this.titulo = titulo;
        this.compania = compania;
    }


    // Método get
    public String get_compania(){ return compania;}
    public String get_titulo(){return titulo;}


    // Ḿétodo con el cual se agregan videojuegos a las lista1
    public void Agregar_lista1(){

        Scanner entrada_uauario3 = new Scanner(System.in);

        System.out.println("Introduce el título del videojuego");
        String titulo_introducido = entrada_uauario3.nextLine();
        System.out.println("Introduce el nombre de la compañia del videojuego");
        String compania_introducida = entrada_uauario3.nextLine();
        System.out.println("Introduce el género del videojuego");
        String genero_introducido = entrada_uauario3.nextLine();
        
        System.out.println();
        
        VideoJuego juego = new VideoJuego(titulo_introducido, genero_introducido, compania_introducida);

        lista_videojuegos1.add(juego);
        System.out.println("Agregaste el videojuego " + juego.get_titulo() + " a la lista 1");
        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }

    // Ḿétodo con el cual se agregan videojuegos a las lista2
    public void Agregar_lista2(){

        Scanner entrada_uauario3 = new Scanner(System.in);

        System.out.println("Introduce el título del videojuego");
        String titulo_introducido = entrada_uauario3.nextLine();
        System.out.println("Introduce el nombre de la compañia del videojuego");
        String compania_introducida = entrada_uauario3.nextLine();
        System.out.println("Introduce el género del videojuego");
        String genero_introducido = entrada_uauario3.nextLine();
        
        System.out.println();
        
        VideoJuego juego = new VideoJuego(titulo_introducido, genero_introducido, compania_introducida);

        lista_videojuegos2.add(juego);
        System.out.println("Agregaste el videojuego " + juego.get_titulo() + " a la lista 2");
        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }

   
    // Unir las listas
    public void union_listas(){
        
        // Se unen todos los elementos de las listas
        lista_union.addAll(lista_videojuegos1);
        lista_union.addAll(lista_videojuegos2);

        // Se agregan los titulos de todos los videojuegos
        for(int i = 0; i<=lista_videojuegos1.size(); i++){
            lista_union_titulos.add(lista_videojuegos1.get(i).get_titulo());
        }
        for(int i = 0; i<=lista_videojuegos2.size(); i++){
            lista_union_titulos.add(lista_videojuegos1.get(i).get_titulo());
        }

        System.out.println("Uniste ambas listas");
        // Imprimir la lista unida
        System.out.println("Lista 1: " + lista_videojuegos1);
        System.out.println("Lista 2: " + lista_videojuegos2);
        System.out.println("Lista unida: " + lista_union_titulos);
        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }

    // Se intersectan las listas
    public void interseccion_listas(){
        // Se agregan los titulos de todos los videojuegos
        for(int i = 0; i<lista_videojuegos1.size(); i++){
            lista1_titulos.add(lista_videojuegos1.get(i).get_titulo());
        }
        for(int i = 0; i<lista_videojuegos2.size(); i++){
            lista2_titulos.add(lista_videojuegos1.get(i).get_titulo());
        }

        // Se hace la intersección
        lista_interseccion_titulos.addAll(lista1_titulos);
        lista_interseccion_titulos.retainAll(lista2_titulos);
        
        System.out.println("Intsersectaste las listas");
        // Imprimir la intersección
        System.out.println("Lista 1: " + lista_videojuegos1);
        System.out.println("Lista 2: " + lista_videojuegos2);
        System.out.println("Intersección: " + lista_interseccion_titulos);
        System.out.println("----------------------------------------------------------------");
        System.out.println();

    }


    // Se muestran los videojuegos de una compañia dada 
    public void mostrar_videojuegos(){

        Scanner entrada_uauario3 = new Scanner(System.in);

        ArrayList<String> lista_titulos = new ArrayList<>();

        System.out.println("Introduce el nombre de la compañia de los juegos que quieres buscar\n");
        String compania_usuario = entrada_uauario3.nextLine();
        System.out.println();

        for(int i=0; i< lista_union.size(); i++){
            if( lista_union.get(i).get_compania().equals(compania_usuario) ){
                lista_titulos.add(lista_union.get(i).get_titulo());
            }
        }

        System.out.println("Se muestran los títulos de los videojuegos de la compañia que escribiste");
        System.out.println(lista_titulos);
        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }





}