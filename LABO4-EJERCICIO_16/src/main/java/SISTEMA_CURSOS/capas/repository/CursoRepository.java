/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_CURSOS.capas.repository;



import java.util.ArrayList;
import SISTEMA_CURSOS.capas.model.Curso;

public class CursoRepository {
    private ArrayList<Curso> cursos = new ArrayList<>();

    public void guardar(Curso curso) {
        cursos.add(curso);
    }

    public ArrayList<Curso> listar() {
        return cursos;
    }
}
