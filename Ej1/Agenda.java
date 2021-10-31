
package Def4.ej1;


public class Agenda {
    
    //-> Atributos
    
    private String propietario, correo;
    private int nroContactos;
    private Contacto[] contactos;
    
    //-> Getters & Setters

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNroContactos() {
        return nroContactos;
    }

    public void setNroContactos(int nroContactos) {
        this.nroContactos = nroContactos;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    //-> Constructors
    
    public Agenda(){
        this.propietario="Andres";
        this.correo="Andres@ej.com";
        this.nroContactos=2;
        this.contactos=new Contacto[this.nroContactos];
        for(int i=0; i<this.nroContactos ;i++){
            contactos[i]=new Contacto();
        }
    }
    
    public Agenda(String p, String c, int nc){
        this.propietario=p;
        this.correo=c;
        this.nroContactos=nc;
        this.contactos=new Contacto[this.nroContactos];
        for(int i=0; i<this.nroContactos ;i++){
            contactos[i]=new Contacto();
        }
    }
    
    //-> Methods
    
    public void show(){
        System.out.println("Propietario: "+propietario);
        System.out.println("Correo: "+correo);
        for(int i=0; i<this.nroContactos ;i++){
            contactos[i].show();
        }
    }
    
    
    //------------b)----------------
    public int contarAp(String x){
        int nA=0;
        for(int i=0; i<this.nroContactos ;i++){
            if(contactos[i].getApellido().equals(x)){
                nA++;
            }
        }
        return nA;
    }
    //-------------c)-----------------
    public void mostrarEt(String x){
        for(int i=0; i<this.nroContactos ;i++){
            contactos[i].mostEt(x);
        }
    }
    //--------------d)----------------
    public void elmCont(int x){
        for(int i=0; i<nroContactos ;i++){
            if(contactos[i].verifNum(x)!=0){
                contactos[i]=null;
                System.out.println("Contacto eliminado!");
            }else{
                System.out.println("No existe contacto con el número "+x);
            }
            
        }
    }
    
}
