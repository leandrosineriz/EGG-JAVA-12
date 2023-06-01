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
public class Residencia extends Extrahotelero {
    private double cantHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Residencia(double cantHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }
    
    @Override
    public double getPrecioHabitacion() {
        return super.getPrecioHabitacion() + 30;
    }

    @Override
    public String toString() {
        return "Residencia{" + super.toString() + "cantHabitaciones=" + cantHabitaciones + ", descuentoGremio=" + 
                descuentoGremio + ", campoDeportivo=" + campoDeportivo + '}';
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }
}
