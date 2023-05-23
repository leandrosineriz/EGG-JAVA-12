/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import Class.Animal;
import Class.Gato;
import Class.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itsmi
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro1 = new Perro("Rocky", "Croquetas", 8, "Boxer");
        Animal gato1 = new Gato("Luna", "pasta de pescado", 3, "Naranjoso");
        List<Animal> animales = new ArrayList();
        animales.add(perro1);
        animales.add(gato1);
        
        for (Animal a : animales) {
            a.Alimentarse();
        }
    }
    
}
