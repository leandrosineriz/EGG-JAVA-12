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
    
    @Override
    public Televisor CrearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e = super.CrearElectrodomestico();
        System.out.println("Ingrese la resolucion: ");
        double resolucion = leer.nextDouble();
        System.out.println("Tiene Sintonizador TDT?:");
        boolean tdt = leer.nextBoolean();
        return new Televisor(resolucion, tdt, e.getPrecio(), e.getColor(), 
                e.getConsumoEnergetico(), e.getPeso());
    }
    
    public Televisor CrearElectrodomestico(double precio, String color, char ConsumoElectrico, double peso, 
            double resolucion, boolean tdt){
        Electrodomestico e = super.CrearElectrodomestico(precio, color, ConsumoElectrico, peso);
        
        return new Televisor(resolucion, tdt, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
    }
    
}
