package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double userArea;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter Radius:");
        radius = input.nextDouble();
        input.close();
        while(radius <0){
            System.out.println("Please enter valid Radius:");
            radius = input.nextDouble();

        }
        userArea = Circle.getArea(radius);




        System.out.println("The area of a circle of radius " + radius + " is " + userArea);
    }
}
