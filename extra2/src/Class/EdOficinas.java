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
public class EdOficinas extends Edificio {
    private double nroOficinas;
    private double cantPersOficina;
    private double nroPisos;

    public EdOficinas(double nroOficinas, double cantPersOficina, double nroPisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nroOficinas = nroOficinas;
        this.cantPersOficina = cantPersOficina;
        this.nroPisos = nroPisos;
    }

    @Override
    public double CalcularSuperficie() {
        return ancho*largo*nroPisos;
    }

    @Override
    public double CalcularVolumen() {
        return ancho*largo*alto*nroPisos;
    }
    
    public void CantPersonas() {
        System.out.println("Cantidad de personas por piso: " + cantPersOficina*nroOficinas);
        System.out.println("Cantidad de personas edificio: " + cantPersOficina*nroOficinas*nroPisos);
    }

    @Override
    public String toString() {
        return "EdOficinas{" + super.toString() + "nroOficinas=" + nroOficinas + ", cantPersOficina=" + 
                cantPersOficina + ", nroPisos=" + nroPisos + '}';
    }
    
    
}
