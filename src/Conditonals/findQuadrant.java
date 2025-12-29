package Conditonals;

import java.util.Scanner;

public class findQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("The point is on the origin");
        } else if (x == 0) {
            System.out.println("The point lies on the y-axis");
        } else if (y == 0) {
            System.out.println("The point lies on the x-axis");
        } else {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("1st Quadrant");
                } else {
                    System.out.println("4th Quadrant");
                }
            } else { // x < 0
                if (y > 0) {
                    System.out.println("2nd Quadrant");
                } else {
                    System.out.println("3rd Quadrant");
                }
            }
        }

        //sc.close();
    }
}




