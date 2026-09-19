/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_PRODUCTOS.capas.controller;
import java.util.ArrayList;
import SISTEMA_PRODUCTOS.capas.model.Product;
import SISTEMA_PRODUCTOS.capas.service.ProductService;

public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    public void registrar(Product product) {
        service.registrar(product);
    }

    public ArrayList<Product> listar() {
        return service.listar();
    }
}
