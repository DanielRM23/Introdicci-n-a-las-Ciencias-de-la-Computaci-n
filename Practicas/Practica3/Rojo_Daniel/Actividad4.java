// ICC, práctica 3
// Daniel Rojo Mata
//Canción navideña


// Se importan los cosos que se usan 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actividad4{
    public static void main(String[] args){

        String one = "(1) PRIMER VERSO: On the first day of Christmas, my true love sent to me A partridge in a pear tree. \n";
        String two = "(2) SEGUNDO VERSO: On the second day of Christmas, my true love sent to me Two turtle doves And a partridge in a pear tree.\n";
        String three = "(3) TERCER VERSO: On the third day of Christmas, my true love sent to me Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String four = "(4) CUARTO VERSO: On the fourth day of Christmas, my true love sent to me Four calling birds, Three French hens,Two turtle doves.\n";
        String five = "(5) QUINTO VERSO: On the fifth day of Christmas, my true love sent to me Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String six = "(6) SEXTO VERSO: On the sixth day of Christmas, my true love sent to me Six geese a-laying Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String seven = "(7) SÉPTIMO VERSO: On the seventh day of Christmas, my true love sent to me Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String eight = "(8) OCTAVO VERSO: On the eighth day of Christmas, my true love sent to me Eight maids a-milking, And a partridge in a pear tree. Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String nine = "(9) NOVENO VERSO: On the ninth day of Christmas, my true love sent to me Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String ten = "(10) DÉCIMO VERSO: On the tenth day of Christmas, my true love sent to me Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String eleven = "(11) DÉCIMO 1er VERSO: On the eleventh day of Christmas, my true love sent to me Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        String twelve = "(12) DÉCIMO 2do VERSO: On the twelfth day of Christmas, my true love sent to me Twelve drummers drumming, Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.\n";
        
        //Se define un array en donde se guardan los versos anteriores
        List<String> versos = new ArrayList<String>();
        List<String> lista_ordenada = new ArrayList<String>();

        // Se agregan los versos al array versos
        versos.add(twelve); versos.add(eleven); versos.add(ten);
        versos.add(nine); versos.add(eight); versos.add(seven);
        versos.add(six); versos.add(five); versos.add(four);
        versos.add(three); versos.add(two); versos.add(one);
        
        // La longitud tiene que tener el número de versos
        int longitud = versos.size();

        for(int i = longitud; 0<= i; i--){
        //versos.subList(m, n) nos proporciona una sublista del array versos, se agrega el elemento i hasta el j del array versos
        // Se imprime en pantala
            System.out.println(versos.subList(i, longitud));
            System.out.println("*****************************************************************************************************************************************************************************************************");
        }
       
    }

}

