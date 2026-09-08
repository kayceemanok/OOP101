/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ta21.problem3;

/**
 *
 * @author Kaycee
 */


import java.util.Scanner;
public class Problem3 {

   public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        
        System.out.print ("Enter Vehicle Brand: ");
                    String brand = input.next();
                    
        System.out.print ("Enter Vehicle Model: ");
                     String model = input.next();
                     
        System.out.print ("Enter Vehicle Plate Number: ");
                String plateNum = input.next();

        System.out.print ("Enter Vehicle Manifacturing Year: ");
                int year = input.nextInt();

        System.out.print ("Enter Vehicle Engine Displacement: ");
        double engineDsplm = input.nextDouble();

              System.out.println(brand);
        System.out.println("Vehicle Brand: " +model);
        System.out.println("Vehicle Model: " +plateNum);
        System.out.println( "Manifacturing Year: " + year);
        System.out.println("Vehicle Engine Displacement: " +engineDsplm);








    }
}
