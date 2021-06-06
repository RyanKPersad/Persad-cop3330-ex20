/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package Sales_tax;
import java.util.Scanner;

public class App {
    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        String order;
        String state;
        String county;
        final double county_tax1 = .005;
        final double county_tax2 = .004;
        final double wisconsin_tax = .05;
        final double illinois_tax = .08;
        double subtotal = 0;
        double state_tax = 0;
        double total;
        double total2 = 0;

        System.out.println("What is the order amount");
        order = myObj.nextLine();
        double order1 = Double.parseDouble(order);

        System.out.println("What state do you live in?");
        state = myObj.nextLine();

        if (state.equalsIgnoreCase("Wisconsin")) {
            state_tax = order1 * wisconsin_tax;
            total = order1 + state_tax;
            System.out.println("What county do you live in?");
            county = myObj.nextLine();

            if (county.equalsIgnoreCase("Eau Claire")) {
                total2 = total * county_tax1;
                subtotal = total + total2;


            } else if (county.equalsIgnoreCase("Dunn")) {
                total2 = total * county_tax2;
                subtotal = total + total2;

            }else{
                total2 = 0;
                subtotal = total + 0;



            }


        } else if (state.equalsIgnoreCase("Illinois")) {
            total = order1;
            state_tax = total * illinois_tax;
            subtotal = order1 + state_tax;

        }else{
            subtotal = order1;



        }

        String print = String.format("%.2f",state_tax);
        String print1 = String.format("%.2f",total2);
        String print2 = String.format("%.2f",subtotal);
        System.out.println("The tax is $" +print+"\nThe County tax is $"+print1+"\nThe total is $"+print2);


    }
}
