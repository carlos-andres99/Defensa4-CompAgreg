
package Def4.ej1;

import java.util.Scanner;
public class Contacto {
    
    Scanner teclado=new Scanner(System.in);
    //-> Atributos
    
    private String nombre;
    private String apellido;
    private Telefono telefono[];
    
    //-> Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Telefono[] getTelefono() {
        return telefono;
    }
    public Telefono getTelefono(int i){
        return telefono[i];
    }
    public void setTelefono(Telefono[] telefono) {
        this.telefono = telefono;
    }
    
    //-> Constructors
    
    public Contacto(){
        this.nombre="Carlos";
        this.apellido="Arroyo";
        this.telefono=new Telefono[5];
        for(int i=0; i<5 ;i++){
           System.out.print("Etiqueta telefono"+(i+1)+": ");
           String et=teclado.nextLine();
           telefono[i]=new Telefono(et);
        }
    }
    
    
    //-> Methods
    
    public void show(){
        System.out.print("Nombre: "+nombre);
        System.out.println(" "+apellido);
        System.out.println("----Telefono-------");
        for (int i = 0; i < 5; i++) {
            telefono[i].show();
        }
    }
    
    //------------c)---------------
    public void mostEt(String x){
        for(int i=0; i<5 ;i++){
            if(telefono[i].verifEt(x)==true){
                this.show();
            }                
        }
    }
    //--------------d)---------------
    public int verifNum(int x){
        int cont=0;
        for(int i=0; i<5 ;i++){
            if(telefono[i].verifNum(x)==true){
                cont++;
            }
        }
        return cont;
    }

  
}
