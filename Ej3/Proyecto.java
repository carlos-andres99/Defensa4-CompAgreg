
package Def4.ej3;


public class Proyecto {
    
    //->Atributos
    
    private String titulo, fechaInicio, fechaFin;
    
    //-> Getters & Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    //-> Constructors
    
    public Proyecto(){
        this.titulo="Grafos";
        this.fechaInicio="25/10/21";
        this.fechaFin="3/11/21";
        
    }
    
    public Proyecto(String t, String fI, String fF){
        this.titulo=t;
        this.fechaInicio=fI;
        this.fechaFin=fF;
    }
    
    //-> Methods
    
    public void mostrar(){
        System.out.println("Proyecto: "+titulo);
        System.out.println("Fecha Inicio: "+fechaInicio);
        System.out.println("Fecha Fin"+fechaFin);
    }
    
}
