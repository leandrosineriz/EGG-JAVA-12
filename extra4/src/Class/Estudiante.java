/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enums.TipoCurso;
import java.util.HashSet;


/**
 *
 * @author itsmi
 */
public class Estudiante extends Persona {
    private final HashSet<TipoCurso> cursos = new HashSet();

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, double dni, boolean casado) {
        super(nombre, apellido, dni, casado);
    }
    
    public boolean addCurso(TipoCurso c) {
        return cursos.add(c);
    }

    @Override
    public String toString() {
        return super.toString() + ", cursos=" + cursos;
    }
}
