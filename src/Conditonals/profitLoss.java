package Conditonals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost: ");
        float cp = sc.nextFloat();
        System.out.println("Enter selling price: ");
        float sp = sc.nextFloat();
        if(sp>cp)
            System.out.println("Profit!"+(sp-cp));
        if(sp<cp)
            System.out.println("Loss!"+(cp-sp));
        else System.out.println("NULL");


    }
}
