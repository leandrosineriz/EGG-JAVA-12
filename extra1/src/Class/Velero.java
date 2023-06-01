/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.time.LocalDate;

/**
 *
 * @author itsmi
 */
public class Velero extends Barco{
    private double nroMastiles;

    public Velero(double matricula, double eslora, LocalDate anioFabricacion, double nroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }
    

    @Override
    public double valorModulo() {
        return super.valorModulo()+nroMastiles;
    }

    public double getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(double nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + "nroMastiles=" + nroMastiles + '}';
    }
    
    
}
