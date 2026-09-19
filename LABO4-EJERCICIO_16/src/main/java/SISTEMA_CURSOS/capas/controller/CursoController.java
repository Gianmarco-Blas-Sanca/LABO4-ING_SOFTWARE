/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISTEMA_CURSOS.capas.controller;

import java.util.ArrayList;
import SISTEMA_CURSOS.capas.model.Curso;
import SISTEMA_CURSOS.capas.service.CursoService;
public class CursoController{
    private CursoService service;
    
    public  CursoController(CursoService service){
        this.service= service;
    }
    
    public void registrar(Curso curso){
        service.registrar(curso);
        
    }
    
    public ArrayList<Curso> listar(){
        return service.listar();
    }
    
    
}
        
