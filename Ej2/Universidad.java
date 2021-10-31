
package Def4.ej2;

public class Universidad {
    
    //-> Atributos 
    
    private String nombre, ciudad;
    private int nroFac;
    private Facultad[] facultad;
    
    //-> Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNroFac() {
        return nroFac;
    }

    public void setNroFac(int nroFac) {
        this.nroFac = nroFac;
    }

    public Facultad[] getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad[] facultad) {
        this.facultad = facultad;
    }
    
    //-> Constructors
    
    
    public Universidad(){
        this.nombre="Umsa";
        this.ciudad="La Paz";
        this.nroFac=2;
        this.facultad=new Facultad[this.nroFac];
        for(int i=0; i<nroFac ;i++){
            facultad[i]=new Facultad();
        }
    }
    
    //-> Methods
    
    public void show(){
        System.out.println("Universidad: "+nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Facultades: ");
        for(int i=0; i<nroFac ;i++){
            facultad[i].show();
        }
    }
    
    //-------------------b)------------------------
    public void mayorU(Universidad x){
        int est1=0, est2=0;
        
        for(int i=0; i<this.nroFac ;i++){
            est1=est1+facultad[i].contEst();
        }
        for(int j=0; j<x.nroFac ;j++){
            est2=est2+x.facultad[j].contEst();
        }
        
        if(est1>est2){
            System.out.println("La universidad con mas estudiantes es: "+this.nombre);
        }else if(est2>est1){
            System.out.println("La universiad con mas estudiantes es: "+x.nombre);
        }else{
            System.out.println("Ambas universidades tienen la misma contidad de estudiantes");
        }       
    }
    
    //------------------c)-------------------------
    public void verfCarrX(String x){
        int cont=0;
        for(int i=0; i<nroFac ;i++){
            cont=cont+facultad[i].carrerX(x);
        }
        if(cont!=0){
            System.out.println("La universidad: "+this.nombre+" si tiene la carrera: "+x);
        }else{
            System.out.println("La universidad: "+this.nombre+" No tiene la carrera: "+x);
        }
    }
    
    
    public void encargX(String x){
        for(int i=0; i<nroFac ;i++){
            if(facultad[i].getNombre().equals(x)){
                facultad[i].mostEnc();
            }
        }
    }
}
