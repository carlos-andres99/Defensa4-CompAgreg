                         
package Def4.ej2;

import java.util.Scanner;


public class Carrera {
    
    Scanner teclado=new Scanner(System.in);
    //->Atributos
    
    private String nombre, director;
    private int nroEstudiantes;
    
    //-> Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNroEstudiantes() {
        return nroEstudiantes;
    }

    public void setNroEstudiantes(int nroEstudiantes) {
        this.nroEstudiantes = nroEstudiantes;
    }
    
    
    //-> Constructors
    
    public Carrera(){
        this.nombre="Ing. Electronica";
        this.director="Daniel Rodriguez";
        this.nroEstudiantes=200;
    }
    public Carrera(String nomb){
        this.nombre=nomb;
        System.out.print("Director: ");
        this.director=teclado.nextLine();
        this.nroEstudiantes=teclado.nextInt();
    }
    //-> Methods
    
    public void show(){
        System.out.println("Carrera: "+nombre);
        System.out.println("Director: "+director);
        System.out.println("Nro Estudiantes: "+nroEstudiantes);
    }

}
