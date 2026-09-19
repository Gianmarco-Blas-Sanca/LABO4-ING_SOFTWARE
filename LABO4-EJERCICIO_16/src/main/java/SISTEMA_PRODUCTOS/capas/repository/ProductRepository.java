/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_PRODUCTOS.capas.repository;
import java.util.ArrayList;
import  SISTEMA_PRODUCTOS.capas.model.Product;

public class ProductRepository {
    private ArrayList<Product> productos = new ArrayList<>();

    public void guardar(Product product) {
        productos.add(product);
    }

    public ArrayList<Product> listar() {
        return productos;
    }
}
