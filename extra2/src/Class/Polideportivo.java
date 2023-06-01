/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import ENUMS.TipoInstalacion;

/**
 *
 * @author itsmi
 */
public class Polideportivo extends Edificio {
    private String nombre;
    private TipoInstalacion tipo;

    public Polideportivo(String nombre, TipoInstalacion tipo, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public TipoInstalacion getTipo() {
        return tipo;
    }

    @Override
    public double CalcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public double CalcularVolumen() {
        return ancho*largo*alto;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString() + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
}
