/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_heap;

/**
 *
 * @author Dell
 */
public class EVA1_3_HEAP {
    public static void main(String[] args) {
       // TODO code application logic here
      Prueba Prueba = new Prueba();
        System.out.println(Prueba.x);
        Prueba Prueba2;//NECEITO UN RESPALDO DE PRUEBA.X = 100
        Prueba2 = Prueba;//NO FUNCIONEA , SE DUPLCA LA MISMA DIRECCION 
        Prueba Prueba2 = new Prueba();
        Prueba2.x = Prueba.x;
        System.out.println(Prueba2.x);
        Prueba.x = 200;
        System.out.println(Prueba.x);
        System.out.println(Prueba2.x);
        System.out.println(Prueba);
        System.out.println(Prueba2);
        if (Prueba == Prueba2)
            System.out.println("Objetos iguales");
        else
            System.out.println("Objetos distintos");
    }
    
}
class Prueba{
    int x = 100;
} 
