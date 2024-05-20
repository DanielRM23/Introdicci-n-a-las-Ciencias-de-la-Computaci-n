import java.util.Scanner;

public class Horario{
    
    // Atributos 
    String dia;
    String hora;


    // Método constructor
    Horario(String dia, String hora){
        if( dia.equals("lunes") ||  dia.equals("martes") || dia.equals("miercoles") 
            || dia.equals("jueves") || dia.equals("viernes") || dia.equals("sabado") 
            || dia.equals("domingo") ){
                this.dia = dia;
                this.hora = hora; 
            }
        else{
            System.out.println("Día de la semana inválido, escribe un día válido");
        }

        System.out.println(" ");
    }

    // Métodos set
    public void set_hora(String nueva_hora){hora = nueva_hora; }
    public void set_dia(String nuevo_dia){dia = nuevo_dia; }

    // Métodos get
    public String get_dia(){ return dia; }
    public String get_hora(){ return hora; }





}