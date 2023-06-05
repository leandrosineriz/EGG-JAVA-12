/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.Empleado;
import Class.Estudiante;
import Class.Persona;
import Class.PersonalServicio;
import Class.Profesor;
import Enums.TipoCurso;
import Enums.TipoDepartamento;
import Enums.TipoSeccion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class FacultadService {
    public void Menu(List<Persona> personas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        while (true) {            
            System.out.println("**********************\n"
                    + "                MENU\n"
                    + "1. Cambio del estado civil de una persona.\n"
                    + "2. Reasignación de despacho a un empleado.\n"
                    + "3. Matriculación de un estudiante en un nuevo curso.\n"
                    + "4. Cambio de departamento de un profesor.\n"
                    + "5. Traslado de sección de un empleado del personal de servicio.\n"
                    + "6. Imprimir toda la información de cada tipo de individuo.");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    this.CambioEstadoCivil(personas);
                    break;
                case 2:
                    this.ReasignarDespacho(personas);
                    break;
                case 3:
                    this.MatricularNuevoCurso(personas);
                    break;
                case 4:
                    this.ReasignarDepartamento(personas);
                    break;
                case 5:
                    this.TransladoSeccionPS(personas);
                    break;
                case 6:
                    this.MostrarTodos(personas);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
    
    private void CambioEstadoCivil(List<Persona> personas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x = 1;
        for (Persona p : personas) {
            System.out.println(x + " " + p.getNombre() + " " + p.getApellido());
            x++;
        }
        System.out.println("Seleccione la persona a modificar: ");
        int opc = leer.nextInt() - 1;
        Persona p = personas.get(opc);
        if (p.isCasado()) {
            p.setCasado(false);
        } else {
            p.setCasado(true);
        }
        System.out.println("Estado civil modificado.");
    }
    
    private void MostrarTodos(List<Persona> personas) {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
    
    private void ReasignarDespacho(List<Persona> personas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x = 1;
        List<Empleado> emps = new ArrayList();
        for (Persona p : personas) {
            if (p instanceof Empleado) {
                emps.add((Empleado)p);
                System.out.println(x + " " + p.getNombre() + " " + p.getApellido());
                x++;
            }
        }
        System.out.println("Seleccione el Empleado a modificar: ");
        int opc = leer.nextInt() - 1;
        Empleado p = (Empleado)emps.get(opc);
        System.out.println("Ingrese el nuevo numero de despacho: ");
        opc = leer.nextInt();
        p.setDespacho(opc);
        
    }
    
    private void ReasignarDepartamento(List<Persona> personas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x = 1;
        List<Profesor> profs = new ArrayList();
        for (Persona p : personas) {
            if (p instanceof Profesor) {
                profs.add((Profesor)p);
                System.out.println(x + " " + p.getNombre() + " " + p.getApellido());
                x++;
            }
        }
        System.out.println("Seleccione el Empleado a modificar: ");
        int opc = leer.nextInt() - 1;
        Profesor p = profs.get(opc);
        x = 1;
        for (TipoDepartamento td : TipoDepartamento.values()) {
            System.out.println(x + " " + td);
            x++;
        }
        System.out.println("Seleccione el Departamento a asignar: ");
        opc = leer.nextInt() - 1;
        p.setDepartamento(TipoDepartamento.values()[opc]);
        System.out.println("Departamento asignado.");
    }
    
    private void MatricularNuevoCurso(List<Persona> personas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x = 1;
        List<Estudiante> ests = new ArrayList();
        for (Persona p : personas) {
            if (p instanceof Estudiante) {
                ests.add((Estudiante)p);
                System.out.println(x + " " + p.getNombre() + " " + p.getApellido());
                x++;
            }
        }
        System.out.println("Seleccione el Estudiante: ");
        int opc = leer.nextInt() - 1;
        Estudiante p = ests.get(opc);
        x = 1;
        for (TipoCurso td : TipoCurso.values()) {
            System.out.println(x + " " + td);
            x++;
        }
        System.out.println("Seleccione el Curso a matricular: ");
        opc = leer.nextInt() - 1;
        if (p.addCurso(TipoCurso.values()[opc])) {
            System.out.println("Curso matriculado.");
        } else {
            System.out.println("Ya se encuentra matriculado en el curso.");
        }
        
    }
    
    private void TransladoSeccionPS(List<Persona> personas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x = 1;
        List<PersonalServicio> ests = new ArrayList();
        for (Persona p : personas) {
            if (p instanceof PersonalServicio) {
                ests.add((PersonalServicio)p);
                System.out.println(x + " " + p.getNombre() + " " + p.getApellido());
                x++;
            }
        }
        System.out.println("Seleccione el miembro del personal de servicio a modificar: ");
        int opc = leer.nextInt() - 1;
        PersonalServicio p = ests.get(opc);
        x = 1;
        for (TipoSeccion td : TipoSeccion.values()) {
            System.out.println(x + " " + td);
            x++;
        }
        System.out.println("Seleccione la nueva seccion: ");
        opc = leer.nextInt() - 1;
        p.setSeccion(TipoSeccion.values()[opc]);
        System.out.println("Seccion modificada.");
        
    }
}
