/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Class.Circulo;
import Class.FiguraGeometrica;
import Class.Rectangulo;
import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c1 = new Circulo(10);
        Circulo c2 = new Circulo(33);
        Rectangulo r1 = new Rectangulo(10, 20);
        Rectangulo r2 = new Rectangulo(30, 10);
        ArrayList<FiguraGeometrica> figuras = new ArrayList();
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);
        for (FiguraGeometrica f : figuras) {
            System.out.println(f.CalcularArea());
            System.out.println(f.CalcularPerimetro());
        }
        
    }
    
}
