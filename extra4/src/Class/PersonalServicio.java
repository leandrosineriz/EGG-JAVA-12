/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enums.TipoSeccion;

/**
 *
 * @author itsmi
 */
public class PersonalServicio extends Empleado {
    private TipoSeccion seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(TipoSeccion seccion, double anioIncorporacion, double despacho, String nombre, String apellido, double dni, boolean casado) {
        super(anioIncorporacion, despacho, nombre, apellido, dni, casado);
        this.seccion = seccion;
    }

    public void setSeccion(TipoSeccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", seccion=" + seccion;
    }
}
