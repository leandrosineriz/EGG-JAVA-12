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
public class Hotel5 extends Hotel4 {
    double cantSalonesConf;
    double cantSuites;
    double cantLimosinas;

    public Hotel5(double cantSalonesConf, double cantSuites, double cantLimosinas, String nombreRestaurante, 
            double capacidadRestaurante, char gimnasio, double cantHabitaciones, double nroCamas, double cantPisos, 
            String nombre, String direccion, String localidad, String gerente) {
        super(nombreRestaurante, capacidadRestaurante, gimnasio, cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public double getPrecioHabitacion() {
        return super.getPrecioHabitacion() + (cantLimosinas*15);
    }

    @Override
    public String toString() {
        return "Hotel5{" + super.toString() + "cantSalonesConf=" + cantSalonesConf + ", cantSuites=" + cantSuites + 
                ", cantLimosinas=" + cantLimosinas + '}';
    }
}
