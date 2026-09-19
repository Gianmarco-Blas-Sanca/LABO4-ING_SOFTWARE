/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_CURSOS.capas.service;

import java.util.ArrayList;
import SISTEMA_CURSOS.capas.model.Curso;
import SISTEMA_CURSOS.capas.repository.CursoRepository;

public class CursoService {
    private CursoRepository repository;

    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }

    public void registrar(Curso curso) {
        if (curso.codigo == null || curso.codigo.isEmpty()) {
            System.out.println("El codigo del curso es obligatorio.");
            return;
        }
        if (curso.creditos <= 0) {
            System.out.println("Los creditos deben ser mayores a cero.");
            return;
        }

        repository.guardar(curso);
        System.out.println("Curso registrado correctamente.");
    }

    public ArrayList<Curso> listar() {
        return repository.listar();
    }
}
