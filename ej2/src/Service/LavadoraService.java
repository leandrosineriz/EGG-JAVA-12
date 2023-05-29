/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.Electrodomestico;
import Class.Lavadora;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class LavadoraService extends ElectrodomesticoService{
    public Lavadora CrearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e = super.CrearElectrodomestico();
        System.out.println("Ingrese la carga: ");
        double carga = leer.nextDouble();
        return new Lavadora(carga, this.PrecioFinal(e, carga), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
    }
    
    
    public double PrecioFinal(Electrodomestico e, double carga){
        double base = super.PrecioFinal(e.getConsumoEnergetico(), e.getPeso());
        if (carga > 30) {
            base += 500;
        }
        return base;
    }
}
