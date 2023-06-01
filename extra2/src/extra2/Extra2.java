/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
 * edificio tendrá como métodos:
 * • Método calcularSuperficie(): calcula la superficie del edificio.
 * • Método calcularVolumen(): calcula el volumen del edifico.
 * Estos métodos serán abstractos y los implementarán las siguientes clases:
 * • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
 * Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
 * por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
 * los atributos del padre.
 * De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
 * usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
 * (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
 * cuantas personas entrarían en un piso y cuantas en todo el edificio.
 *
 * 16
 * Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
 * dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
 * métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
 * superficie y el volumen de cada edificio.
 * Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
 * techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
 * cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package extra2;

import Class.EdOficinas;
import Class.Edificio;
import Class.Polideportivo;
import ENUMS.TipoInstalacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itsmi
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Polideportivo p1 = new Polideportivo("P1", TipoInstalacion.TECHADO, 1000, 500, 10);
        Polideportivo p2 = new Polideportivo("P1", TipoInstalacion.ABIERTO, 2000, 1000, 20);
        Polideportivo p3 = new Polideportivo("P1", TipoInstalacion.ABIERTO, 2000, 1000, 20);
        Polideportivo p4 = new Polideportivo("P1", TipoInstalacion.ABIERTO, 2000, 1000, 20);
        EdOficinas eo1 = new EdOficinas(4, 6, 3, 100, 100, 10);
        EdOficinas eo2 = new EdOficinas(8, 12, 6, 200, 200, 20);
        
        List<Edificio> edificios = new ArrayList();
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(p3);
        edificios.add(p4);
        edificios.add(eo1);
        edificios.add(eo2);
        int cantTechados = 0;
        int cantAbiertos = 0;
        for (Edificio e : edificios) {
            System.out.println(e);
            if (e instanceof Polideportivo) {
                if (((Polideportivo) e).getTipo() == TipoInstalacion.TECHADO) {
                    cantTechados+=1;
                } else {
                    cantAbiertos+=1;
                }
            } else if (e instanceof EdOficinas){
                ((EdOficinas) e).CantPersonas();
            }
            System.out.println("*************************");
        }
        System.out.println("Cantidad de techados: " + cantTechados);
        System.out.println("Cantidad de abiertos: " + cantAbiertos);
    }

}
