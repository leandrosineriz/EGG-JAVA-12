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
public class BarcoMotor extends Barco{
    protected double potenciaCv;

    public BarcoMotor(double potenciaCv, double matricula, double eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
    }
    
    @Override
    public double valorModulo() {
        return super.valorModulo()+potenciaCv;
    }

    public double getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(double potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + super.toString() + "potenciaCv=" + potenciaCv + '}';
    }
    
    
}
