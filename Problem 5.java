/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ta21.exercise5;

/**
 *
 * @author Kaycee
 */


import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String brand;
        String model;
        int ram;
        int storage;
        double price;

        System.out.print("Enter brand: ");
        brand = input.nextLine();

        System.out.print("Enter model: ");
        model = input.nextLine();

        System.out.print("Enter RAM in GB: ");
        ram = input.nextInt();

        System.out.print("Enter storage in GB: ");
        storage = input.nextInt();

        System.out.print("Enter price: ");
        price = input.nextDouble();

         System.out.println("\nSmartphone Specification Record");
        System.out.println("Brand: " + brand + "; Model: " + model);
        System.out.println("RAM: " + ram + " GB; Storage: " + storage + " GB;");
        System.out.println("Price: PHP " + price);

   
        
        input.close();
    }
}
    
