/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ta21.problem4;

import java.util.Scanner;

/**
 *
 * @author Kaycee
 */

public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter guest name: ");
        String guest = input.nextLine();

        System.out.print("Enter room number: ");
        int roomnumber = input.nextInt();

        System.out.print("Enter number of nights: ");
        int nights = input.nextInt();

        System.out.print("Enter room rate: ");
        double roomrate = input.nextDouble();

        System.out.println("Hotel Guest Record");
        System.out.println("Guest: " + guest);
        System.out.println("Room: " + roomnumber);
        System.out.println("Nights: " + nights);
        System.out.println("Room Rate: PHP " + roomrate);
    
    
    
}
}
