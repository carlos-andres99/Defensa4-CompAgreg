
package Def4.ej3;

import java.util.Scanner;
public class Estudiante {
    
    Scanner teclado=new Scanner(System.in);
    //->Atributos
    private String ci;
    private String nombre, paterno, materno;
    
    //-> Getters & Setters

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    //-> Constructors
    
    public Estudiante(){
        this.nombre="Carlos";
        this.paterno="Arroyo";
        this.materno="Espinoza";
        this.ci="6146833LP";
    }
    
    
    
    //-> Methods
    
    public void mostrar(){
        System.out.println("nombre: "+nombre+" "+paterno+" "+materno);
        System.out.println("Ci: "+ci);
    }
    
    public void leer(){
        System.out.print("nombre: ");
        this.nombre=teclado.next();
        System.out.print("paterno: ");
        this.paterno=teclado.next();
        System.out.print("materno: ");
        this.materno=teclado.next();
        System.out.print("Ci: ");
        this.ci=teclado.next();
    }
    
}
