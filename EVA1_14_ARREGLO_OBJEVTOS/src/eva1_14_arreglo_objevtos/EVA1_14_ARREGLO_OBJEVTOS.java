/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_arreglo_objevtos;

/**
 *
 * @author Dell
 */
public class EVA1_14_ARREGLO_OBJEVTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona datos[] = new Persona[5];
        //datos[0] = new Persona();
        //datos[1] = new Persona();
        //datos[2] = new Persona();
        //datos[3] = new Persona();
        //datos[4] = new Persona();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Persona();
        }
    }
    
}
class Persona{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
