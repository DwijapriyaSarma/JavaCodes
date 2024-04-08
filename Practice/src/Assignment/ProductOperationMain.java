package Assignment;

import java.util.Scanner;

public class ProductOperationMain {
    public static void main(String[] args) {
        int count=0;
        int productNum=0;
        Scanner sc=new Scanner(System.in);
        while (count<10) {
            System.out.println();
            System.out.println("1 add a new product");
            System.out.println("2. Show total value");
            System.out.println("3. Exit the application");

            int option = sc.nextInt();


            if (option == 1) {
                System.out.println("Enter product id:");
                int productId = sc.nextInt();

                System.out.println("Enter product name: ");
                String productName = sc.next();

                System.out.println("Enter product price: ");
                double price = sc.nextDouble();

                productNum +=1;

                product product = new product(productId, productName, price);
                System.out.println("No of Product added successfully is: "+productNum);
                count += 1;

                if (count == 10) {
                    System.out.println("Sorry you have exhausted the quota limit which is 10");
                    break;
                }
            } else if (option == 2) {
                System.out.println("Total value of all Products : " + product.getTotalPrice()+ ", and no of total added products: "+productNum);

            } else if (option==3) {
                System.out.println("Exiting the application: ");
                break;

            } else {
                System.out.println("Invalid option, please choose either 1,2 or 3");
        }

        }
    }
}
