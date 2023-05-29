/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interface.calculosFormas;

/**
 *
 * @author itsmi
 */
public class Circulo extends FiguraGeometrica implements calculosFormas{
    private double diametro;
    private double radio;

    public Circulo(double diametro) {
        this.diametro = diametro;
        this.radio = diametro/2;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double CalcularPerimetro() {
        return PI * diametro;
    }
    
}
