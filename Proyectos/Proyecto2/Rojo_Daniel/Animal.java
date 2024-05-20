public class Animal{
    
    String animal;
    String estado_salud;
    String identificador;
    Horario horario_comida;

    // Método constructor 
    Animal(String identificador, String animal, String estado_salud, Horario horario_comida){
        this.identificador = identificador;
        this.animal = animal;
        this.estado_salud = estado_salud;
        this.horario_comida = horario_comida;
    }


    // Métodos get 
    public String get_animal(){ return animal; }
    public String get_estado_salud(){ return estado_salud; }
    public String get_identificador(){ return identificador; }
    public Horario get_Horario(){ return horario_comida; }

    // Métodos set 
    public void set_animal(String nuevo_animal){animal = nuevo_animal; }
    public void set_estado_salud(String nuevo_estado_salud){estado_salud = nuevo_estado_salud; }

    public void detalles_animal(){
        System.out.println( this.get_identificador() );
    }


}