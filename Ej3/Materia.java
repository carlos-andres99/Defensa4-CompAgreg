
package Def4.ej3;

import java.util.Scanner;
public class Materia {

     Scanner teclado=new Scanner(System.in);
    //->Atributos
    
    private String sigla;
    private int nroGrupos;
    private Grupo[] g;
    
    //-> Getters & Setters

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getNroGrupos() {
        return nroGrupos;
    }

    public void setNroGrupos(int nroGrupos) {
        this.nroGrupos = nroGrupos;
    }

    public Grupo[] getG() {
        return g;
    }

    public void setG(Grupo[] g) {
        this.g = g;
    }
    
    //-> Constructors
    
    
    public Materia(String nomM){
        this.sigla=nomM;
        this.nroGrupos=2;
        this.g=new Grupo[nroGrupos];
        for(int i=0; i<nroGrupos ;i++){
            System.out.print("NombreG: ");
            String nom=teclado.nextLine();
            g[i]=new Grupo(nom);
        }
    }
    
    public void mostrar(){
        System.out.println("Sigla: "+sigla);
        System.out.println("Grupos: ");
        for(int i=0; i<nroGrupos ;i++){
            g[i].mostrar();
            
            //opcional: 
            // System.out.println("Grupo: "+g[i].getNombreG());
        }
    }
    
    //---------------a)-------------------------
    
    public void mostrJefes(){
        for(int i=0; i<nroGrupos ;i++){
           g[i].mostJefe();
        }
    }
    
    //----------------c)-------------------------
    
    public void promG(String nG){
        int sw=0;
        for(int i=0; i<nroGrupos ;i++){
            if(g[i].getNombreG().equalsIgnoreCase(nG)){
                System.out.println("El promedio del grupo "+nG+" es: "+g[i].promNotas());
                sw=1;
            }
        }
        if(sw==0){
            System.out.println("No existe grupo con el nombre "+nG);
        }
    }
    
    //--------------d)----------------

    
    
}
