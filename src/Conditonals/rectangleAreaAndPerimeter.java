package Conditonals;

import java.util.Scanner;

public class rectangleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        float length = sc.nextFloat();
        System.out.println("Enter the value of width: ");
        float width = sc.nextFloat();
        float perimeter = 2*(length+width);
        System.out.println("The value of perimeter is: "+perimeter);
        float area=  length * width;
        System.out.println("The value of area is: "+area);
        if(perimeter>area)
            System.out.println("Perimeter is greater");
        if(perimeter<area)
            System.out.println("Area is greater");

    }

}
