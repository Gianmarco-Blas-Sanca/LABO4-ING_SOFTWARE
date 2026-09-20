/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_ESTUDIANTES.capas.controller;
import java.util.ArrayList;
import SISTEMA_ESTUDIANTES.capas.model.Student;
import SISTEMA_ESTUDIANTES.capas.service.StudentService;

public class StudentController {
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    public void registrar(Student student) {
        service.registrar(student);
    }
    
    public ArrayList<Student> listar() {
    return service.listar();
    }
}
