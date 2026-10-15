package com.pluralsight;

import java.util.Scanner;

public class sandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Would you like a Regular or Large Sandwich. 1 for reg2 for lar");
        int size = myScanner.nextInt();
        double price = 0;

        if (size == 1 ){
            price = 5.45;
            System.out.println("Regular it is your price is $5.45");

        }
        else if (size == 2){
            price = 8.95;
            System.out.println("Large it is your total is $8.95");

        }
        else {
            System.out.println("Not an option BUD");
        }
        System.out.println("How old are you");
        int age = myScanner.nextInt();
        if (age <= 17){
            price = price * 0.90;
            System.out.println("You get a 10% Discount");

        }
        else if (age >= 65){
            price = price * 0.80;
            System.out.println("You get a 20% Discount" );
        }
        else {
            System.out.println("Full price Bub");
        }
        System.out.printf("Your final total is $%.2f%n", price);


    }
}
