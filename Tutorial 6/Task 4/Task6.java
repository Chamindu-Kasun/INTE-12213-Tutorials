/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task6;

import java.util.Scanner;

/**
 *
 * @author chamindu
 */
public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cake[] cakes = new Cake[20];
        int cakeCount = 0;
        
        while(cakeCount < 20){
          System.out.println("Enter cake details (1 for Order Cake, 2 for Readymade Cake, 0 to exit):");
          int choice = input.nextInt();
          
          if(choice == 0){
            break;
          }
          
          input.nextLine(); 
          
          System.out.print("Enter cake name: ");
          String name = input.nextLine();

          System.out.print("Enter cake rate: ");
          double rate = input.nextDouble();
          
          if (choice == 1) {
                System.out.print("Enter cake weight (kg): ");
                double weight = input.nextDouble();
                cakes[cakeCount] = new OrderCake(name, rate, weight);
          } else if (choice == 2) {
                System.out.print("Enter cake quantity: ");
                int quantity = input.nextInt();
                cakes[cakeCount] = new ReadyMadeCake(name, rate, quantity);
          }

          cakeCount++;
        }
        
        //Total Price
        double totalPrice = 0;
        
        for(int i = 0; i<cakeCount; i++){
           double price = cakes[i].calcPrice();
           totalPrice += price;
        }
        
        System.out.println("Total Price for all cakes: " + totalPrice);
        
        
        //Ready made cakes
        double totalReadyMadePrice = 0;
        int totalReadyMadeQuantity = 0;
        
         for (int i = 0; i < cakeCount; i++) {
            if (cakes[i] instanceof ReadyMadeCake) {
                double price = cakes[i].calcPrice();
                int quantity = ((ReadyMadeCake) cakes[i]).quantity;

                totalReadyMadePrice += price;
                totalReadyMadeQuantity += quantity;
            }
        }
         
        System.out.println("Total price for ready-made cakes : " + totalReadyMadePrice );
        System.out.println("The quantity sold for ready-made cakes : " + totalReadyMadeQuantity);
        
        
        //Max price
        double maxPrice = 0;
        Cake maxPriceCake = null;
        
        for (int i = 0; i < cakeCount; i++) {
            double price = cakes[i].calcPrice();

            if (price > maxPrice) {
                maxPrice = price;
                maxPriceCake = cakes[i];
            }
        }
        
        if (maxPriceCake != null) {
            System.out.println("Cake with the highest price:\n" + maxPriceCake.toString() + "\tPrice: " + maxPrice);
        }
        
        input.close();
    
    }
}
