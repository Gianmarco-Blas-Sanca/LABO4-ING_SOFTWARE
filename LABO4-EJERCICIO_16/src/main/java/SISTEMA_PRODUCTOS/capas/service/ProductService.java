/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_PRODUCTOS.capas.service;
import java.util.ArrayList;
import SISTEMA_PRODUCTOS.capas.model.Product;
import SISTEMA_PRODUCTOS.capas.repository.ProductRepository;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void registrar(Product product) {
        if (product.precio <= 0) {
            System.out.println("El precio debe ser mayor que cero.");
            return;
        }

        repository.guardar(product);
        System.out.println("Producto registrado.");
    }

    public ArrayList<Product> listar() {
        return repository.listar();
    }
}
