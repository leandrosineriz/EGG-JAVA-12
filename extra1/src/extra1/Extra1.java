/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
 * nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
 * amarre y el barco que lo ocupará.
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 * Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
 * • Número de mástiles para veleros.
 * • Potencia en CV para barcos a motor.
 * • Potencia en CV y número de camarotes para yates de lujo.
 * Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
 * alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
 * multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
 * sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
 * en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
 * el número de camarotes.
 * Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
 * métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
 * precio final de su alquiler.
 */
package extra1;
import Class.Alquiler;
import Class.Barco;
import Class.BarcoMotor;
import Class.Velero;
import Class.YateLujo;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itsmi
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate a = LocalDate.of(1996, Month.JANUARY, 1);
        LocalDate b = LocalDate.of(1995, Month.FEBRUARY, 1);
        Velero v1 = new Velero(1, 10, a, 5);
        BarcoMotor bm1 = new BarcoMotor(500, 2, 20, b);
        YateLujo yl1 = new YateLujo(20, 1000, 3, 100, b);
        Alquiler a1 = new Alquiler("Pepe", 38987289, LocalDate.of(2023, Month.JANUARY, 1), 
                LocalDate.of(2023, Month.MAY, 20), 1, v1);
        Alquiler a2 = new Alquiler("Pepe", 38987289, LocalDate.of(2022, Month.JANUARY, 1), 
                LocalDate.of(2023, Month.JANUARY, 1), 2, bm1);
        Alquiler a3 = new Alquiler("Pepe", 38987289, LocalDate.of(2023, Month.JANUARY, 1), 
                LocalDate.of(2023, Month.JANUARY, 20), 3, yl1);
        List<Alquiler> alquileres = new ArrayList();
        alquileres.add(a1);
        alquileres.add(a2);
        alquileres.add(a3);
        for (Alquiler alq : alquileres) {
            System.out.println(alq);
            System.out.println(alq.CalculoAlquiler());
        }
    }
}
