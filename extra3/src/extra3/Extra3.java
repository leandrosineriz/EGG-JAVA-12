/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import Class.Alojamiento;
import Class.Camping;
import Class.Hotel4;
import Class.Hotel5;
import Class.Residencia;
import Services.AlojamientosService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itsmi
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel4 h1 = new Hotel4("Resto1", 50, 'A', 20, 40, 2, "Hotel1", "dir1", "loc1", "Pepe");
        Hotel5 h2 = new Hotel5(2, 2, 5, "Resto2", 100, 'B', 40, 80, 4, "Hotel2", "dir2", "loc2", "Jose");
        Camping c1 = new Camping(50, 10, true, true, 1000, "Camping1", "dir3", "loc3", "Lola");
        Camping c2 = new Camping(50, 10, false, false, 1000, "Camping2", "dir3", "loc3", "Lola");
        Residencia r1 = new Residencia(100, true, false, false, 2000, "Residencia1", "dir4", "loc4", "Pepa");
        
        List<Alojamiento> alojamientos = new ArrayList();
        alojamientos.add(h1);
        alojamientos.add(h2);
        alojamientos.add(c1);
        alojamientos.add(r1);
        alojamientos.add(c2);
        
        AlojamientosService as = new AlojamientosService();
        as.Menu(alojamientos);
    }
    
}
