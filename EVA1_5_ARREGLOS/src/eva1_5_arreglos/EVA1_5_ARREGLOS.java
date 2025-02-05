/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_arreglos;

/**
 *
 * @author Dell
 */
public class EVA1_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int[10];
        // int [] a, b, c; tres arreglos de tipo entero
        // int a, b[], c, una arreglo de tipo entreo
        // ACCESO ALETRORIO 
        datos[0] = 100;
        datos[1] = 200;
        //datos[10] = 1000; // GENERA EXPRECION (LLEGA HASTA 9)
        datos[9] = 1000;
        // USO DE CICLO DE MANEJRAR ARREGLOS 
        for (int i = 0; i < 10; i++) { //ASIGANCION DE DATOS 
            datos[i] = 100;   
        }
        for (int i = 0; i < 10; i++) { // LECTRURA 
            System.out.print("["+ datos[i] + "]" ); 
        }
    }
    
}
