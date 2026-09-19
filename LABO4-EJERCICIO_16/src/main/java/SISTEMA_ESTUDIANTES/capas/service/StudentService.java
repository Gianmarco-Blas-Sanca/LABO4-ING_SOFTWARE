/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_ESTUDIANTES.capas.service;

import SISTEMA_ESTUDIANTES.capas.model.Student;
import SISTEMA_ESTUDIANTES.capas.repository.StudentRepository;
import java.util.ArrayList;

public class StudentService {
    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void registrar(Student student) {
        if (student.codigo == null || student.codigo.isEmpty()) {
            System.out.println("El código es obligatorio.");
            return;
        }

        if (student.nombre == null || student.nombre.isEmpty()) {
            System.out.println("El nombre es obligatorio.");
            return;
        }

        repository.guardar(student);
        System.out.println("Estudiante registrado.");
    }
    
    public ArrayList<Student> listar() {
    return repository.listar();
}
}
