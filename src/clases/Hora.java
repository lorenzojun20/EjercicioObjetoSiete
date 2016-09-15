/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lorenzo
 */
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
   
    
    
    public Hora(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public String valida (Hora h2){
        String aux;
        if(h2.getHoras() > 23 || h2.getMinutos() > 60 || h2.getSegundos() > 60 ){
            aux = "La hora es Incorrecta";
        }else{
            aux = "!Muy Bien!, La Hora es Correcta";
        }
        return aux;
    }
    public String mostrar(){
        String aux;
        aux = "La Hora es: "+this.getHoras()+"\n"
                +" Los Minutos son: "+this.getMinutos()+"\n"
                +" Los Segundos son: "+this.getSegundos()+"\n\n"
                +this.getHoras()+":"+this.getMinutos()+":"+this.getSegundos();
        
        return aux;
    }
    public String igual(Hora h2){
     String aux;
     if(this.getHoras() == h2.getHoras() && this.getMinutos() == h2.getMinutos() && this.getSegundos() == h2.getSegundos()){
     aux = "La hora es igual a la propocionada";    
     }else {
         aux = "La hora no es igual a la proporcionada";
     }
     
     return aux;
    }
    public String mayorque(Hora h2){
        String aux;
        if (this.getHoras() > h2.getHoras()){
            aux = "La hora es Posterior a la proporcionada";
        } else if (this.getHoras() == h2.getHoras()  && this.getMinutos() > h2.getMinutos()){
            aux = "La hora es Posterior a la proporcionada";
    }else if (this.getHoras() == h2.getHoras()  && this.getMinutos() == h2.getMinutos()  && this.getSegundos() > h2.getSegundos()){
            aux = "La hora es Posterior a la proporcionada";
    }else{
    aux = "La hora No es posterior a la proporcionada";   
    }
        return aux;
    }
    public String menorque(Hora h2){
        String aux;
          if (this.getHoras() < h2.getHoras()){
            aux = "La hora es anterior a la proporcionada";
        } else if (this.getHoras() == h2.getHoras()  && this.getMinutos() < h2.getMinutos()){
            aux = "La hora es anterior a la proporcionada";
    }else if (this.getHoras() == h2.getHoras()  && this.getMinutos() == h2.getMinutos()  && this.getSegundos() < h2.getSegundos()){
            aux = "La hora es anterior a la proporcionada";
    }else{
    aux = "La hora No es anterior a la proporcionada";   
    }
        return aux;
    }
}
