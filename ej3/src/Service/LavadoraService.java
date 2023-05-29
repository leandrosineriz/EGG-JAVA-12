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
    
    @Override
    public Lavadora CrearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e = super.CrearElectrodomestico();
        System.out.println("Ingrese la carga: ");
        double carga = leer.nextDouble();
        return new Lavadora(carga, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
    }
    
    public Lavadora CrearElectrodomestico(double precio, String color, char ConsumoElectrico, double peso, double carga){
        
        Electrodomestico e = super.CrearElectrodomestico(precio, color, ConsumoElectrico, peso);
        
        return new Lavadora(carga, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
    }
    
}
