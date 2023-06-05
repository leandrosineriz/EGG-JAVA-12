/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enums.TipoDepartamento;

/**
 *
 * @author itsmi
 */
public class Profesor extends Empleado{
    private TipoDepartamento departamento;

    public Profesor() {
    }

    public Profesor(TipoDepartamento departamento, double anioIncorporacion, double despacho, String nombre, 
            String apellido, double dni, boolean casado) {
        super(anioIncorporacion, despacho, nombre, apellido, dni, casado);
        this.departamento = departamento;
    }

    public void setDepartamento(TipoDepartamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", departamento=" + departamento;
    }
}
