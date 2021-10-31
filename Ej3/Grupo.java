
package Def4.ej3;


public class Grupo {
    
    //-> Atributos
    
    private String nombreG;
    private Estudiante jefeG;
    private Estudiante[] a;
    private int[] evaluacion;
    private Proyecto py;
    private int nroEst;
            
    //->  Getters & Setters

    public String getNombreG() {
        return nombreG;
    }

    public void setNombreG(String nombreG) {
        this.nombreG = nombreG;
    }

    public Estudiante getJefeG() {
        return jefeG;
    }

    public void setJefeG(Estudiante jefeG) {
        this.jefeG = jefeG;
    }

    public Estudiante[] getA() {
        return a;
    }

    public void setA(Estudiante[] a) {
        this.a = a;
    }

    public int[] getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int[] evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Proyecto getPy() {
        return py;
    }

    public void setPy(Proyecto py) {
        this.py = py;
    }

    public int getNroEst() {
        return nroEst;
    }

    public void setNroEst(int nroEst) {
        this.nroEst = nroEst;
    }
    
    
    //-> Constructors
    
    public Grupo(){
        this.nombreG="Grupo A";
        this.jefeG=new Estudiante();
        this.nroEst=6;
        this.a=new Estudiante[nroEst];
        for(int i=0; i<nroEst ;i++){
            a[i]=new Estudiante();
        }
        this.py=new Proyecto();
        this.evaluacion=new int[nroEst];
        int x=0;
        for(int i=0; i<nroEst ;i++){
            evaluacion[i]=x+10;
            x=x+10;
        }
    }
    public Grupo(String nom){
        this.nombreG = nom;
        this.jefeG = new Estudiante();
        this.nroEst = 6;
        this.a = new Estudiante[nroEst];
        for (int i = 0; i < nroEst; i++) {
            a[i] = new Estudiante();
        }
        this.py = new Proyecto();
        this.evaluacion = new int[nroEst];
        int x = 0;
        for (int i = 0; i < nroEst; i++) {
            evaluacion[i] = x + 10;
            x = x + 10;
        }
    }
    
    //->Methods
    
    public void mostrar(){
        System.out.println("Grupo: "+nombreG);
        py.mostrar();
        System.out.println("Jefe de Grupo: ");
        jefeG.mostrar();
        System.out.println("Estudiantes del grupo: ");
        for(int i=0; i<nroEst ;i++){
            a[i].mostrar();
        }
        System.out.println("Evaluacion: ");
        for(int i=0; i<nroEst ;i++){
            System.out.println(evaluacion[i]+" ");
        }
    }
    
    //----------------a)------------
    public void mostJefe(){
        jefeG.mostrar();
    }
    
    //--------------b)-------------------
    
    //--------------C)-------------------
    
    public double promNotas(){
        int prom=0;
        for(int i=0; i<nroEst ;i++){
            prom=evaluacion[i]+prom;
        }
        prom=prom/nroEst;
        return prom;
    }
    
    //-------------d)-------------------

}
