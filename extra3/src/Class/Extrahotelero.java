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
public abstract class Extrahotelero extends Alojamiento {
    boolean privado;
    double superficie;

    public Extrahotelero(boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.superficie = superficie;
    }

    @Override
    public double getPrecioHabitacion() {
        return 10;
    }

    @Override
    public String toString() {
        return "Extrahotelero{" + super.toString() + "privado=" + privado + ", superficie=" + superficie + '}';
    }
    
    
}
