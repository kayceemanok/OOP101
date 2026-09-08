/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ta21.exercise1;

/**
 *
 * @author Kaycee
 */


import java.util.Scanner;
public class Exercise1 {

      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student Number: ");
        String studentNumber = input.nextLine();

        System.out.print("Enter Program: ");
        String program = input.nextLine();

        System.out.print("Enter Year Level: ");
        int yearLevel = input.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Program: " + program);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("GPA: " + gpa);

      }
}
