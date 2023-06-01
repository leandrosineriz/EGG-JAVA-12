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
public class Hotel4 extends Hotel {
    String nombreRestaurante;
    double capacidadRestaurante;
    char gimnasio;

    public Hotel4(String nombreRestaurante, double capacidadRestaurante, char gimnasio, double cantHabitaciones, 
            double nroCamas, double cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.gimnasio = gimnasio;
    }
    
    @Override
    public double getPrecioHabitacion() {
        double valorRestaurante;
        double valorGimnasio;
        
        if (capacidadRestaurante < 30) {
            valorRestaurante = 10;
        } else if (capacidadRestaurante <= 50) {
            valorRestaurante = 30;
        } else {
            valorRestaurante = 50;
        }
        
        if (gimnasio == 'A') {
            valorGimnasio = 50;
        } else {
            valorGimnasio = 30;
        }
        
        return super.getPrecioHabitacion() + valorRestaurante + valorGimnasio;
    }

    @Override
    public String toString() {
        return "Hotel4{" + super.toString() + "nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + 
                capacidadRestaurante + ", gimnasio=" + gimnasio + '}';
    }
    
    
}
