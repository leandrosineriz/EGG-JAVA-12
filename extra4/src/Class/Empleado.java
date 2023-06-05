/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author itsmi
 */
public class Empleado extends Persona {
    protected double anioIncorporacion;
    protected double despacho;

    public Empleado() {
    }

    public Empleado(double anioIncorporacion, double despacho, String nombre, String apellido, double dni, boolean casado) {
        super(nombre, apellido, dni, casado);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
    }

    public void setDespacho(double despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString() + ", anioIncorporacion=" + anioIncorporacion + ", despacho=" + despacho;
    }
    
    
}
