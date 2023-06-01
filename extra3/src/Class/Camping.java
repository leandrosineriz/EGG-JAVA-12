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
public class Camping extends Extrahotelero {
    private double maxCarpas;
    private double cantBanios;
    private boolean restaurante;

    public Camping(double maxCarpas, double cantBanios, boolean restaurante, boolean privado, double superficie, 
            String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }
    
    @Override
    public double getPrecioHabitacion() {
        return super.getPrecioHabitacion() + 10;
    }

    @Override
    public String toString() {
        return "Camping{" + super.toString() + "maxCarpas=" + maxCarpas + ", cantBanios=" + cantBanios + 
                ", restaurante=" + restaurante + '}';
    }

    public boolean isRestaurante() {
        return restaurante;
    }
    
}
