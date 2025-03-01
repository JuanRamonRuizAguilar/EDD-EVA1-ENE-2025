/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compara_arreglos;
import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author Dell
 */

    public class CompararArreglosDB {
    private static final String URL = "jdbc:mysql://localhost:3306/arreglosDB";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamaño = scanner.nextInt();

        int[] arreglo1 = new int[tamaño];
        int[] arreglo2 = new int[tamaño];

        System.out.println("Ingrese valores para el primer arreglo:");
        captura(arreglo1, scanner);

        System.out.println("Ingrese valores para el segundo arreglo:");
        captura(arreglo2, scanner);

        almacenarEnDB(arreglo1, arreglo2);

        int[][] datosRecuperados = recuperarDeDB(tamaño);

        System.out.print("ARREGLO 1: ");
        impresion(datosRecuperados[0]);

        System.out.print("ARREGLO 2: ");
        impresion(datosRecuperados[1]);

        System.out.println(sonIguales(datosRecuperados[0], datosRecuperados[1]) ? "Los arreglos son IGUALES." : "Los arreglos NO son iguales.");
    }
    public static void captura(int[] arreglo, Scanner scanner) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese valor para la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }
    }
    public static void almacenarEnDB(int[] arreglo1, int[] arreglo2) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO arreglos (posicion, valor1, valor2) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            for (int i = 0; i < arreglo1.length; i++) {
                stmt.setInt(1, i);
                stmt.setInt(2, arreglo1[i]);
                stmt.setInt(3, arreglo2[i]);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static int[][] recuperarDeDB(int tamaño) {
        int[][] datos = new int[2][tamaño];
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT valor1, valor2 FROM arreglos ORDER BY posicion";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int i = 0;
            while (rs.next()) {
                datos[0][i] = rs.getInt("valor1");
                datos[1][i] = rs.getInt("valor2");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public static boolean sonIguales(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static void impresion(int[] arreglo) {
        System.out.print("[ ");
        for (int val : arreglo) {
            System.out.print("[ " + val + " ] ");
        }
        System.out.println("]");
    }
}



