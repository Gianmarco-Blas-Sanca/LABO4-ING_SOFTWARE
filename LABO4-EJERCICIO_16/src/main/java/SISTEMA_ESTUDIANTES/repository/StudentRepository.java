/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_ESTUDIANTES.repository;

import java.util.ArrayList;
import SISTEMA_ESTUDIANTES.model.Student;

public class StudentRepository {
    private ArrayList<Student> estudiantes = new ArrayList<>();

    public void guardar(Student student) {
        estudiantes.add(student);
    }

    public ArrayList<Student> listar() {
        return estudiantes;
    }
}
