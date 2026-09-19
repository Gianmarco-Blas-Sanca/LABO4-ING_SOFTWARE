/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package SISTEMA_ESTUDIANTES.capas;

import SISTEMA_ESTUDIANTES.capas.controller.StudentController;
import SISTEMA_ESTUDIANTES.capas.model.Student;
import SISTEMA_ESTUDIANTES.capas.repository.StudentRepository;
import SISTEMA_ESTUDIANTES.capas.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);

        Student student = new Student(
            "2026001",
            "María Pérez",
            "Ingeniería de Sistemas"
        );

        controller.registrar(student);
    }
}