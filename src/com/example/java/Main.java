package com.example.java;
import sun.font.TrueTypeFont;

import  java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    //tip calculator program
    //ask user for cost of items and then display total cost.. also a tip recommendation

    public static void main(String[] args) {

        int currentItem, addTip;
        double totalCost, itemCost;
        String totalOut;    //used for formatting purposes
        double tipAmount = .17;
        double salesTax = .025;
        double[] items = new double[15];

        Scanner input = new Scanner(System.in);

        currentItem = 0; //set to zero for the start of program to work
        totalCost = 0;  //set to zero for a new start

                //will continue to loop until 0 which means all the items have been added to array
        do {
            System.out.println("\nPlease enter cost of item: ");
            System.out.println("Enter 0 when finished: ");
            itemCost = input.nextDouble();

            items[currentItem] = itemCost;  //will add the item cost to current array number

            System.out.println("Item added!");
            currentItem++;  //will increase after every input to move to next empty spot in array.

        }while (itemCost != 0);
            //will a use the for loop to add up the items added to the array
        for (int i = 0; i < items.length; i++){
            totalCost = totalCost + items[i];
        }
            //will format the outputs neatly for displaying currency.
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
            //unformatted totalCost will be added to the formatted totalOut
        totalOut = nf.format(totalCost);
            //will display the total before taxes are added.
        System.out.println("\nSub Total: $" + totalOut);
        System.out.println("Tax: 2.5%");
        totalCost = totalCost + (totalCost * salesTax);
        System.out.println("========");
            //will display the total after taxes are added.
        totalOut = nf.format(totalCost);
        System.out.println("Total: $" + totalOut);
            //asks the user if they would like to add a tip to the total cost.
        System.out.println("\nWould you like to add a 17.5% tip? ");
        System.out.println("0: No");
        System.out.println("1: Yes");

        addTip = input.nextInt();
            //will determine if a tip will be added or not then displayed
        if (addTip == 1){
            totalCost = totalCost + (totalCost * tipAmount);
            totalOut = nf.format(totalCost);
            System.out.println("\nTotal with tip: $" + totalOut);
        }else System.out.println("\nTotal without tip: $" + totalOut);














    }
}
