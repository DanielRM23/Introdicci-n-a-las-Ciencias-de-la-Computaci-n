public class Cafe{
    // Estos son los atributos
    private String tamanio;
    private String sabor;
    private double costo; 
    private String temperatura;
    
    // Método constructor 
    public Cafe(String tamanio, String sabor, double costo, String temperatura){
        this.tamanio = tamanio;
        this.sabor = sabor;
        this.temperatura = temperatura;
        this.costo = costo;
    }

// Se hacen los gets 
// El get es para obtener el valor de los atributos

public String getTamanio(){
    return tamanio;
}

public String getsabor(){
    return sabor;
}

public String getTemperatura(){
    return temperatura;
}

public double getcosto(){
    return costo;
}

//Se hacen los sets 

public void setTamanio(){
    this.tamanio = tamanio;
}

public void setsabor(){
    this.sabor = sabor;
}

public void setTemperatura(){
    this.temperatura = temperatura; 
}

public void setcosto(){
    this.costo = costo;
}


public String toString(){
    String cadena = " ";

    cadena += tamanio + "\n";
    cadena += sabor + "\n";
    cadena += costo + "\n"; 
    cadena += temperatura + "\n"; 

    return cadena; 

    }





}