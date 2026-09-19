/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_PRODUCTOS.monolitico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaProductos {

    private static ArrayList<String> productos = new ArrayList<>();

    public static void registrar(String codigo, String nombre, double precio) {
        if (precio <= 0) {
            System.out.println("El precio debe ser mayor que cero.");
            return;
        }

        String producto = codigo + " - " + nombre + " - S/ " + precio;
        productos.add(producto);
        System.out.println("Producto registrado con exito.");
    }

    public static void listar() {
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        for (String p : productos) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de productos a ingresar: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto " + (i + 1) + ":");
            System.out.print("Codigo: ");
            String cod = scanner.nextLine();

            System.out.print("Nombre: ");
            String nom = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            registrar(cod, nom, precio);
        }

        listar();
        scanner.close();
    }
}
