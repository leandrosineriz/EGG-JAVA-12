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
public class YateLujo extends BarcoMotor{
    private double nroCamarotes;

    public YateLujo(double nroCamarotes, double potenciaCv, double matricula, double eslora, LocalDate anioFabricacion) {
        super(potenciaCv, matricula, eslora, anioFabricacion);
        this.nroCamarotes = nroCamarotes;
    }
    
    @Override
    public double valorModulo() {
        return super.valorModulo()+nroCamarotes;
    }

    public double getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(double nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return "YateLujo{" + super.toString() + "nroCamarotes=" + nroCamarotes + '}';
    }
    
    
}
