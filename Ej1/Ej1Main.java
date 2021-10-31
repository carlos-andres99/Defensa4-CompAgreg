
package Def4.ej1;


public class Ej1Main {


    public static void main(String[] args) {
    
        Agenda Agend=new Agenda();
        System.out.println("------------b)------------");
        System.out.println(Agend.contarAp("Arroyo")+" contactos con el apellido 'Arroyo'");
        System.out.println("-------------c)--------------");
        System.out.println("Contactos con la etiqueta 'trabajo': ");
        Agend.mostrarEt("trabajo");
        System.out.println("--------------d)-------------");
        Agend.elmCont(1234);
    }
    
}
