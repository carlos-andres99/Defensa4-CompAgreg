
package Def4.ej2;


public class Biblioteca {
    
    //-> Atributos
    
    private String encargado, horaApertura, horaCierre;
    
    //-> Getters & Setters

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }
    
    
    //-> Constructors

    public Biblioteca(){
        this.encargado="Juan Aguilar";
        this.horaApertura="8:00";
        this.horaCierre="18:00";
    }
    
    //-> Methods
    
    public void show(){
        System.out.println("Etncargado: "+encargado);
        System.out.println("Hora Apertura: "+horaApertura);
        System.out.println("Hora Cierre: "+horaCierre);
    }
    
}
