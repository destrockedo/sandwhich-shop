package com.pluralsight;

import java.util.Scanner;

public class sandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Would you like a Regular or Large Sandwich");
        int size = myScanner.nextInt();

        if (size == 1 ){
            System.out.println("Regular it is your price is $5.45");

        }
        else if (size == 2){
            System.out.println("Large it is your total is $8.95");

        }
        else {
            System.out.println("Not an option BUD");
        }


    }
}
