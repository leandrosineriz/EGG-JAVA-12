/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class ElectrodomesticoService {
    public Electrodomestico CrearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del electrodomestico(blanco, negro, rojo, azul y gris):");
        String color = leer.next().toLowerCase();
        color = this.ComprobarColor(color);
        System.out.println("Ingrese el Consumo Energetico(A, B, C, D, E, F): ");
        char consumo = leer.next().toUpperCase().charAt(0);
        consumo = this.ComprobarConsumoEnergetico(consumo);
        System.out.println("Ingrese el peso:");
        double peso = leer.nextDouble();
        System.out.println("Ingrese el precio:");
        double precio = leer.nextDouble();
        return new Electrodomestico(precio, color, consumo, peso);
    }
    
    public Electrodomestico CrearElectrodomestico(double precio, String color, char ConsumoElectrico, double peso){
        color = this.ComprobarColor(color);
        ConsumoElectrico = this.ComprobarConsumoEnergetico(ConsumoElectrico);
        return new Electrodomestico(precio, color, ConsumoElectrico, peso);
    }
    
    private char ComprobarConsumoEnergetico(char letra){
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        }
        return 'F';
    }
    
    private String ComprobarColor(String color){
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String c : colores) {
            if (c.equals(color)) {
                return color;
            }
        }
        return "blanco";
    }
    
    
}
