/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Class.Electrodomestico;
import Service.LavadoraService;
import Service.TelevisorService;
import Class.Televisor;
import Class.Lavadora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itsmi
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        
        Televisor t1 = ts.CrearElectrodomestico(1000, "blanco", 'A', 50, 50, true);
        Televisor t2 = ts.CrearElectrodomestico(2000, "verde", 'B', 100, 30, false);
        Televisor t3 = ts.CrearElectrodomestico(3000, "rojo", 'F', 20, 10, true);
        Lavadora l1 = ls.CrearElectrodomestico(2000, "negro", 'C', 10, 30);
        Lavadora l2 = ls.CrearElectrodomestico(4000, "gris", 'D', 40, 60);
        Lavadora l3 = ls.CrearElectrodomestico(6000, "azul", 'E', 200, 90);
        List<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
        electrodomesticos.add(t3);
        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(l3);
        double precioFinal = 0;
        for (Electrodomestico e : electrodomesticos) {
            precioFinal+=e.PrecioFinal();
            System.out.println(e + " - " + e.PrecioFinal());
        }
        System.out.println(precioFinal);
        
    }
    
}
