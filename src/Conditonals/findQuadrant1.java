package Conditonals;
import java.util.Scanner;
public class findQuadrant1 {
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
            } else if (x > 0 && y > 0) {
                System.out.println("1st Quadrant");
            } else if (x < 0 && y > 0) {
                System.out.println("2nd Quadrant");
            } else if (x < 0 && y < 0) {
                System.out.println("3rd Quadrant");
            } else {
                System.out.println("4th Quadrant");
            }


        }
    }


