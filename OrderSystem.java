/*

    Arlo Insigne
    CMIS 242
    Assignment 2
    October 18, 2022

    Purpose: Write an order system that allows users to order fruit or salty snack.
    The program returns the summary of the order along with the calculated price.

 */

import java.util.Random;
import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        System.out.println("""
             
                Menu
                1: Order a Snack
                2: Exit program
               
                """
        );

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your selection: ");
        int selection = sc.nextInt();


        if(selection == 1){

            System.out.print("Do you want Fruity Snack (1) or Salty Snack (2): ");
            int selection2 = sc.nextInt();

            if(selection2 == 1){
                String id = "";
                String size = "";
                boolean citrus = false;

                //Creating FuitSnack instance
                FruitSnack fruit = new FruitSnack(id, size, citrus);
                Scanner sc2 = new Scanner(System.in);

                //Set size attribute
                System.out.print("What size do you want: S, M, L: ");
                String s = sc2.nextLine();
                fruit.setSize(s);

                //Calculate price depending ont he chosen size
                if(fruit.getSize().equalsIgnoreCase("S")){
                    fruit.setPrice(19.99);
                } else if (fruit.getSize().equalsIgnoreCase("M")){
                    fruit.setPrice(29.99);
                } else if (fruit.getSize().equalsIgnoreCase("L")){
                    fruit.setPrice(39.99);
                }
                //Set citrus attribute
                System.out.print("Do you want citrus fruit included? true/false: ");
                boolean c = sc2.nextBoolean();
                fruit.setCitrus(c);

                //Add additional fee to current price if it is a citrus fruit
                double currentPrice = fruit.getPrice();
                if(fruit.getCitrus() == true){
                    fruit.setPrice(currentPrice + 5.99);
                }

                //Create random generator for the ID
                final String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
                final char[] numLetters = (letters).toCharArray();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < 10; i++){
                    sb.append(numLetters[new Random().nextInt(letters.length())]);
                }
                fruit.setID(sb.toString());

                //Print summary of the order
                System.out.println(fruit.toString());

            } else if (selection2 == 2){
                String id = "";
                String size = "";
                boolean nutty = false;

                //Creating salty snack instance
                SaltySnack salt = new SaltySnack(id,size,nutty);
                Scanner sc3 = new Scanner(System.in);

                System.out.print("What size do you want: S, M, L: ");
                String s = sc3.nextLine();
                salt.setSize(s);

                //Calculate price depending on the chosen size
                if(salt.getSize().equalsIgnoreCase("S")){
                    salt.setPrice(19.99);
                } else if (salt.getSize().equalsIgnoreCase("M")){
                    salt.setPrice(29.99);
                } else if (salt.getSize().equalsIgnoreCase("L")){
                    salt.setPrice(39.99);
                }

                System.out.print("Do you want nut snack included? (true/false): ");
                boolean c = sc3.nextBoolean();
                salt.setNutty(c);

                //Add additional fee to current price if it includes nut snack
                double currentPrice = salt.getPrice();
                if(salt.getNutty() == true){
                    salt.setPrice(currentPrice + 4.50);
                }

                //Create random generator for the ID
                final String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
                final char[] numLetters = (letters).toCharArray();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < 10; i++){
                    sb.append(numLetters[new Random().nextInt(letters.length())]);
                }
                salt.setID(sb.toString());

                //Print summary of the order
                System.out.println(salt.toString());

            }

        } else if (selection == 2){
            System.out.println("Thank you for using the program. Goodbye!");
            System.exit(0);
        }
    }
}
