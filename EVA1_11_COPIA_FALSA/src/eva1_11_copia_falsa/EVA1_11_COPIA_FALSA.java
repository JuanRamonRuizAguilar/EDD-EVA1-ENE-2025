/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_copia_falsa;

/**
 *
 * @author Dell
 */
public class EVA1_11_COPIA_FALSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int datos[] = new int [10];
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random()*100);
    }
        for (int valor : datos) {
            System.out.println("[" + valor + "]");        
}
        System.out.println("");
        datos = new int[5];
        System.out.println(datos);
        for (int valor : datos) {
            System.out.println("[" + valor + "]");
    }
        System.out.println("");
        int[] copia = datos;
        System.out.println(copia);
}
}
