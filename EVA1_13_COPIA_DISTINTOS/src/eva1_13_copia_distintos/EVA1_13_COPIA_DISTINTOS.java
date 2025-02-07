/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_copia_distintos;

/**
 *
 * @author Dell
 */
public class EVA1_13_COPIA_DISTINTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[] = new int [20];
        
        System.out.print(datos);
        for (int i = 0; i < datos.length; i++) {
        datos[i] = (int)(Math.random()*100);
    }
        for (int i = 0; i < 10; i++) {
    System.out.print(datos[i] + " ");
}
        System.out.println("");
  for (int valor : datos) {
            System.out.print("[" + valor + "]");        
}  
        System.out.println("");
        int copia[] = new int [10];
        for (int i = 0; i < 10; i++) {
            copia[i] = datos[i];
            System.out.print("[" + copia[i] + "]"); 
        }
}
}
