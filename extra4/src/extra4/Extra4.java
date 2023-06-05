/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;

import Class.Estudiante;
import Class.Persona;
import Class.PersonalServicio;
import Class.Profesor;
import Enums.TipoCurso;
import Enums.TipoDepartamento;
import Enums.TipoSeccion;
import Service.FacultadService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itsmi
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1 = new Estudiante("Leo", "Sineriz", 38928378, true);
        Estudiante e2 = new Estudiante("Pepe", "Gomes", 23901874, false);
        Profesor p1 = new Profesor(TipoDepartamento.LENGUAJES, 2013, 1, "Jose", "Dominguez", 28783652, true);
        Profesor p2 = new Profesor(TipoDepartamento.ARQUITECTURA, 2021, 2, "Jeni", "Dimaria", 283782678, false);
        PersonalServicio ps1 = new PersonalServicio(TipoSeccion.DECANATO, 2020, 3, "Noelia", "Messi", 18278367, true);
        PersonalServicio ps2 = new PersonalServicio(TipoSeccion.BIBLIOTECA, 2018, 4, "Dio", "Brando", 28378467, false);
        
        List<Persona> personas = new ArrayList();
        personas.add(e1);
        personas.add(e2);
        personas.add(p1);
        personas.add(p2);
        personas.add(ps1);
        personas.add(ps2);
        e1.addCurso(TipoCurso.LENGUA);
        e1.addCurso(TipoCurso.PROGRAMACION);
        e2.addCurso(TipoCurso.MATEMATICA);
        
        FacultadService fs = new FacultadService();
        fs.Menu(personas);
    }
    
}
