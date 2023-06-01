/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Class.Alojamiento;
import Class.Camping;
import Class.Hotel;
import Class.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class AlojamientosService {
    public void Menu(List<Alojamiento> alojamientos){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (true) {     
            System.out.println("*********************");
            System.out.println("MENU");
            System.out.println("1. Ver alojamientos\n"
                    + "2. Ver hoteles ordenados por precio\n"
                    + "3. Ver campings con restaurante\n"
                    + "4. Residencias con descuento");
            System.out.println("\nIngrese la opcion:");
            int x = leer.nextInt();
            
            switch (x) {
                case 1:
                    for (Alojamiento alojamiento : alojamientos) {
                        System.out.println(alojamiento);
                    }
                    break;
                case 2:
                    List<Hotel> hoteles = new ArrayList();
                    for (Alojamiento alojamiento : alojamientos) {
                        if (alojamiento instanceof Hotel) {
                            hoteles.add((Hotel) alojamiento);
                        }
                    }
                    Hotel hotel1 = new Hotel();
                    Collections.sort(hoteles, hotel1);
                    for (Hotel hotele : hoteles) {
                        System.out.println(hotele);
                        System.out.println("Precio habitacion: "+hotele.getPrecioHabitacion());
                    }
                    break;
                case 3:
                    for (Alojamiento a : alojamientos) {
                        if (a instanceof Camping) {
                            if (((Camping) a).isRestaurante()) {
                                System.out.println(a);
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento a : alojamientos) {
                        if (a instanceof Residencia) {
                            if (((Residencia) a).isDescuentoGremio()) {
                                System.out.println(a);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            System.out.println("");
        }
    }
}
