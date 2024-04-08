/*Coffee Vending Machine


        You are tasked with implementing a simple program for a coffee vending machine. The machine offers different types of coffee, each with its own price. Users can select their preferred coffee by entering a corresponding code. Additionally, the machine provides an option for adding sugar.

        1. Espresso (Code: 1) - $2.50
        2. Cappuccino (Code: 2) - $3.00
        3. Latte (Code: 3) - $2.75

        If the user chooses to add sugar, an additional $0.50 is charged.

        Write a Java program using switch case to:

        Prompt the user to enter the coffee code.
        Display the selected coffee and its price.
        Ask if the user wants to add sugar.
        Calculate and display the total price including sugar (if selected).
        Remember to handle cases where the user enters an invalid code.*/


import java.util.Scanner;

public class CoffeeCode {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to the Coffee vending Machine!");

        System.out.println("Choose your Coffee");
        System.out.println("1. Espresso($2.58)");
        System.out.println("2. Cappuccino($3.00)");
        System.out.println("3. Latte($2.75)");

        int CoffeeCode = obj.nextInt();
        double coffeePrice=0;
        String coffename="";
        boolean isValid=false;

        switch (CoffeeCode) {
            case 1:
                coffeePrice=2.58;
                coffename="Espresso";
                System.out.println("You selected Espresso");
                break;
            case 2:
                coffeePrice=3.00;
                coffename="Cappuccino";
                System.out.println("You selected Cappuccino");
                break;
            case 3:
                coffeePrice=2.75;
                coffename="Latte";
                System.out.println("You selected Latte");
                break;
            default:
                System.out.println("Invalid Coffee code. Please try again");
                isValid= true;

        }
        if(!isValid){
        System.out.println("Do you want to add sugar?(yes/no)");
        String addSugar = obj.next().toLowerCase();
        double sugar= .50;

        switch (addSugar) {
            case "yes":
                coffeePrice=coffeePrice+0.50;
                System.out.println("Sugar added. Total price of the "+coffename+" is: "+coffeePrice);
                break;
            case "no":
                System.out.println("Total price of the "+coffename+" without sugar is: "+coffeePrice);
                ;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        }
    }}

