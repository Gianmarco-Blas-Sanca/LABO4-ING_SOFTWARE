/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package SISTEMA_ESTUDIANTES;

import java.util.Scanner;
import SISTEMA_ESTUDIANTES.controller.StudentController;
import SISTEMA_ESTUDIANTES.model.Student;
import SISTEMA_ESTUDIANTES.repository.StudentRepository;
import SISTEMA_ESTUDIANTES.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);

        System.out.print("Ingrese la cantidad de estudiantes a registrar: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Datos del estudiante " + (i + 1) + " ---");
            
            System.out.print("Codigo: ");
            String codigo = scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Carrera: ");
            String carrera = scanner.nextLine();

            Student student = new Student(codigo, nombre, carrera);
            controller.registrar(student);
        }

        scanner.close();
        
        System.out.println("\nLISTA DE ESTUDIANTES REGISTRADOS");
        for (Student s : controller.listar()) {
        System.out.println(s.codigo + " - " + s.nombre + " - " + s.carrera);
         }
        
    }
        
        
}