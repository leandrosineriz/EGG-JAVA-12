/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Class.Electrodomestico;
import Class.Televisor;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class TelevisorService extends ElectrodomesticoService{
    public Televisor CrearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e = super.CrearElectrodomestico();
        System.out.println("Ingrese la resolucion: ");
        double resolucion = leer.nextDouble();
        System.out.println("Tiene Sintonizador TDT?:");
        boolean tdt = leer.nextBoolean();
        return new Televisor(resolucion, tdt, this.PrecioFinal(e, resolucion, tdt), e.getColor(), 
                e.getConsumoEnergetico(), e.getPeso());
    }
    
    
    public double PrecioFinal(Electrodomestico e, double resolucion, boolean tdt){
        double base = super.PrecioFinal(e.getConsumoEnergetico(), e.getPeso());
        if (resolucion > 40) {
            base *= 1.3;
        }
        if (tdt) {
            base += 500;
        }
        return base;
    }
}
