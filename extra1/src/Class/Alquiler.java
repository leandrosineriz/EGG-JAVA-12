/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author itsmi
 */
public class Alquiler {
    private String nombre;
    private double dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double posicionAmarre;
    private Barco barco;

    public Alquiler(String nombre, double dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, double posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(double posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double CalculoAlquiler(){
        double dias = (fechaDevolucion.getDayOfYear()+(365*(fechaDevolucion.getYear()-1)))-
                (fechaAlquiler.getDayOfYear()+(365*(fechaAlquiler.getYear()-1)));
        return dias * barco.valorModulo();
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + (int)dni + ", fechaAlquiler=" + fechaAlquiler + 
                ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    
}
