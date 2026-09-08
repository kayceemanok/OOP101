/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ta21.exercise23;

/**
 *
 * @author Kaycee
 */


import java.util.Scanner;
public class Exercise23 {

      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Food Item: ");
        String foodItem = input.nextLine();

        System.out.print("Enter Category: ");
        String category = input.nextLine();

        System.out.print("Enter Price: ");
        double price = input.nextDouble();

        System.out.print("Enter Serving Size: ");
        int servingSize = input.nextInt();

        System.out.println();
        System.out.println("Displays " + foodItem + ", " + category + ", PHP " + price + ", " + "and serving size " + servingSize + "." );
        
        
    }
}
