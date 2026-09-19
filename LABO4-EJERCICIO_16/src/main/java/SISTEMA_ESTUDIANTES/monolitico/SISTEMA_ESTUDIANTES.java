/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_ESTUDIANTES.monolitico;

import java.util.ArrayList;

public class SISTEMA_ESTUDIANTES {

    static ArrayList<String> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        registrar(
            "2026001",
            "Maria Pérez",
            "Ingenieria de Sistemas"
        );

        registrar(
            "2026002",
            "Carlos Torres",
            "Ingenieria de Software"
        );

        listar();
    }

    static void registrar(String codigo, String nombre, String carrera) {
        String estudiante = codigo + " - " + nombre + " - " + carrera;
        estudiantes.add(estudiante);
    }

    static void listar() {
        System.out.println("LISTA DE ESTUDIANTES");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
