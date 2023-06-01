/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Comparator;

/**
 *
 * @author itsmi
 */
public class Hotel extends Alojamiento implements Comparator<Hotel> {
    protected double cantHabitaciones;
    protected double nroCamas;
    protected double cantPisos;
    protected double precioHabitacion;

    public Hotel() {
        
    }

    public Hotel(double cantHabitaciones, double nroCamas, double cantPisos, String nombre, 
            String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = 50;
    }
    
    
    @Override
    public double getPrecioHabitacion() {
        return precioHabitacion+(1*cantHabitaciones);
    }

    @Override
    public String toString() {
        return "Hotel{" + super.toString() + "cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + 
                ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

    @Override
    public int compare(Hotel t, Hotel t1) {
        return Double.compare(t1.getPrecioHabitacion(), t.getPrecioHabitacion());
    }
    
    
    
}
