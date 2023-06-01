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
public abstract class Edificio {
    protected double ancho;
    protected double largo;
    protected double alto;

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }
    
    public abstract double CalcularSuperficie();
    public abstract double CalcularVolumen();

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + '}';
    }
    
    
}
