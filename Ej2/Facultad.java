
package Def4.ej2;

public class Facultad {
    
    //-> Atributos
    
    private String nombre;
    private int nroCa;
    private Carrera[] carreras;
    private Biblioteca B;
    
    //-> Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCa() {
        return nroCa;
    }

    public void setNroCa(int nroCa) {
        this.nroCa = nroCa;
    }

    public Carrera[] getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera[] carreras) {
        this.carreras = carreras;
    }

    public Biblioteca getB() {
        return B;
    }

    public void setB(Biblioteca B) {
        this.B = B;
    }
    
    //-> Constructors
    
    public Facultad(){
        this.nombre="Fac. Ingenieria";
        this.nroCa=2;
        this.carreras=new Carrera[nroCa];
        for(int i=0; i<nroCa ;i++){
            carreras[i]=new Carrera();
        }
    }
    
    //-> Methods
    
    public void show(){
        System.out.println("Facultad: "+nombre);
        System.out.println("Carreras: ");
        for(int i=0; i<nroCa ;i++){
            carreras[i].show();
        }
        System.out.println("Biblioteca: ");

    }
    public void AgregarB(Biblioteca bib){
        B=bib;
    }
    //-----------------b)---------------------------
    public int contEst(){
        int nEst=0;
        for(int i=0; i<nroCa ;i++){
            nEst=carreras[i].getNroEstudiantes()+nEst;
        }
        return nEst;
    }
    //------------------c)--------------------------
    public int carrerX(String x){
        int cont=0;
        for(int i=0; i<nroCa ;i++){
            if(carreras[i].getNombre().equalsIgnoreCase(x)){
                cont++;
            }
        }
        return cont;
    }
    
    public void mostEnc(){
        System.out.println(B.getEncargado());
    }
   
}
