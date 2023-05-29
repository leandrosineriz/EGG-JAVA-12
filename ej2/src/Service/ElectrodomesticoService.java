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
        
        return new Electrodomestico(this.PrecioFinal(consumo, peso), color, consumo, peso);
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
    
    protected double PrecioFinal(char consumo, double peso){
        double base = 1000;
        
        switch (consumo) {
            case 'A':
                base += 1000;
                break;
            case 'B':
                base += 800;
                break;
            case 'C':
                base += 600;
                break;
            case 'D':
                base += 500;
                break;
            case 'E':
                base += 300;
                break;
            case 'F':
                base += 100;
                break;
            default:
                throw new AssertionError();
        }
        
        if (peso >= 1 && peso <= 19) {
            base += 100;
        } else if(peso >= 20 && peso <= 49){ 
            base += 500;
        } else if(peso >= 50 && peso <= 79){
            base += 800;
        } else {
            base += 1000;
        }
        
        return base;
    }
}
