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
public class Televisor extends Electrodomestico{
    private double resolucion;
    private boolean sintonizadorTdt;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTdt, double precio, String color, char consumoEnergetico, 
            double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + ", resolucion=" + resolucion + ", sintonizadorTdt=" + sintonizadorTdt + '}';
    }
    
    
}
