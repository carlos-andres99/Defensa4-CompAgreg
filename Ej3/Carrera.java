
package Def4.ej3;

import java.util.Scanner;
public class Carrera {
    
    Scanner teclado=new Scanner(System.in);
    //->Atributos
    
    private String nombre;
    private int nroMat;
    private Materia[] m;
    
    
    //-> Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroMat() {
        return nroMat;
    }

    public void setNroMat(int nroMat) {
        this.nroMat = nroMat;
    }

    public Materia[] getM() {
        return m;
    }

    public void setM(Materia[] m) {
        this.m = m;
    }
    
    //-> Constructors
    
    public Carrera(){
        this.nombre="Informática";
        this.nroMat=2;
        this.m=new Materia[nroMat];
        for(int i=0; i<nroMat ;i++){
            System.out.print("materia: ");
            String nm=teclado.nextLine();
            m[i]=new Materia(nm);
        }
    }
    
    //-> Methods
    
    public void mostrar(){
        System.out.println("Carrera: "+nombre);
        System.out.println("Materias: ");
        for(int i=0; i<nroMat ;i++){
            System.out.println(m[i].getSigla());
        }
    }
    
    //-------------a)--------------
    
    public void mostJefes(String x){
        int sw=0;
        for(int j=0; j<nroMat ;j++){
            if(m[j].getSigla().equalsIgnoreCase(x)){
                sw=1;
            }
        }
        if(sw==1){
            for(int i=0; i<nroMat ;i++){
                if(m[i].getSigla().equalsIgnoreCase(x)){
                    m[i].mostrJefes();
                }
            }
        }else{
            System.out.println("La materia "+x+" NO existe en la carrera "+nombre);
        }
    }
    
    //---------------b)------------------
    
    
    //---------------C)------------------
    
    public void promGrup(String nG, String mat){
        int sw=0;
        for(int i=0; i<nroMat ;i++){
            if(m[i].getSigla().equalsIgnoreCase(mat)){
                m[i].promG(nG);
                sw=1;
            }
        }
        if(sw==0){
            System.out.println("No existe la materia "+mat);
        }
    }
    
    //----------------d)--------------------------

    
    
}