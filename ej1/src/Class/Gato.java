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
public class Gato extends Animal{

    public Gato(String nombre, String alimento, double edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        super.Alimentarse(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Come despacio " + this.alimento);
    }
}
