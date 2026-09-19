/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_CURSOS.monolitico;


import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCursos {

    private static ArrayList<String> cursos = new ArrayList<>();

    public static void registrar(String codigo, String nombre, int creditos) {
        String curso = codigo + " - " + nombre + " - " + creditos + " creditos";
        cursos.add(curso);
        System.out.println("Curso registrado con exito.");
    }

    public static void listar() {
        System.out.println("\n--- LISTA DE CURSOS ---");
        for (String c : cursos) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de cursos a registrar: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nCurso " + (i + 1) + ":");
            System.out.print("Codigo: ");
            String codigo = scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Creditos: ");
            int creditos = Integer.parseInt(scanner.nextLine());

            registrar(codigo, nombre, creditos);
        }

        listar();
        scanner.close();
    }
}
