
package Def4.ej1;

public class Telefono {
    
    //->Atributos
    
    private int numero;
    private String etiqueta;
    
    //-> Getters & Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    //-> Constructors
    
    public Telefono(String et){
        this.numero=1234;
        this.etiqueta=et;
    }
    
    // -> Methods
    
    public void show(){
        System.out.println("Número: "+numero);
        System.out.println("Etiqueta: "+etiqueta);
        
    }
    //-------------c)------------------
    public boolean verifEt(String x){
        return this.etiqueta.equalsIgnoreCase(x);
    }
    //---------------d)-----------------
    public boolean verifNum(int x){
        return this.numero==x;
    }
}
