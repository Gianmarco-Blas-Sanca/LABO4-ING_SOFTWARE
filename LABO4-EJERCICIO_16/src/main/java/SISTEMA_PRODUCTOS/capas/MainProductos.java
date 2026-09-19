/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_PRODUCTOS.capas;
import java.util.ArrayList;
import java.util.Scanner;
import SISTEMA_PRODUCTOS.capas.controller.ProductController;
import SISTEMA_PRODUCTOS.capas.model.Product;
import SISTEMA_PRODUCTOS.capas.repository.ProductRepository;
import SISTEMA_PRODUCTOS.capas.service.ProductService;

public class MainProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductRepository repo = new ProductRepository();
        ProductService service = new ProductService(repo);
        ProductController controller = new ProductController(service);

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

            Product p = new Product(cod, nom, precio);
            controller.registrar(p);
        }

        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        ArrayList<Product> lista = controller.listar();
        for (Product p : lista) {
            System.out.println(p.codigo + " - " + p.nombre + " - S/ " + p.precio);
        }

        scanner.close();
    }
}
