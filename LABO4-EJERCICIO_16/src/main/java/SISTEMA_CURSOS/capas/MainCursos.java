/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_CURSOS.capas;

import java.util.ArrayList;
import java.util.Scanner;
import SISTEMA_CURSOS.capas.controller.CursoController;
import SISTEMA_CURSOS.capas.model.Curso;
import SISTEMA_CURSOS.capas.repository.CursoRepository;
import SISTEMA_CURSOS.capas.service.CursoService;

public class MainCursos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CursoRepository repo = new CursoRepository();
        CursoService service = new CursoService(repo);
        CursoController controller = new CursoController(service);

        System.out.print("Cantidad de cursos a registrar: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nCurso " + (i + 1) + ":");
            System.out.print("Codigo: ");
            String cod = scanner.nextLine();

            System.out.print("Nombre: ");
            String nom = scanner.nextLine();

            System.out.print("Creditos: ");
            int cred = Integer.parseInt(scanner.nextLine());

            Curso c = new Curso(cod, nom, cred);
            controller.registrar(c);
        }

        System.out.println("\n--- LISTA DE CURSOS REGISTRADOS ---");
        ArrayList<Curso> lista = controller.listar();
        for (Curso c : lista) {
            System.out.println(c.codigo + " - " + c.nombre + " - " + c.creditos + " creditos");
        }

        scanner.close();
    }
}

