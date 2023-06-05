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
public class Persona {
    protected String nombre;
    protected String apellido;
    protected double dni;
    protected boolean casado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, double dni, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.casado = casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isCasado() {
        return casado;
    }
    
    

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", casado=" + casado;
    }
}
