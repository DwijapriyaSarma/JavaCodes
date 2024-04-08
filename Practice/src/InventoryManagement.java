/*
Q. Create a simple inventory management application for a store that sells products. For the sake of simplicity, this application should handle one product at a time and will perform the following tasks as per the user's choice:

        1. Add a new product to the inventory.

        . A product has a unique ID, a name, and a price.
        . Once a product is added, its details like ID, name, or price cannot be changed.

        2. Display the total value (sum of the prices) of all the products added so far.

        3. The application should stop adding new products after 10 products have been added (due to storage limitations).

        4. Exit the application.

        The application should continuously run and prompt the user to select an operation until the user decides to exit or until 10 products have been added.
*/




import javax.naming.Name;
import java.util.Scanner;

public class InventoryManagement {
        private String product;

        int Unique_Id;
        String Name;
        int Price;


        public InventoryManagement(String product) {
                this.product=product;

        }
        public int calculateProducts(){
                switch (product){
                        case "Biscuit":
                                Unique_Id=1;
                                Name="Biscuit";
                                Price=100;
                                System.out.println("Price is "+Price);
                        case "Powder":
                                Unique_Id=2;
                                Name="Powder";
                                Price=450;
                        case "Cream":
                                Unique_Id=3;
                                Name="Cream";
                                Price=500;
                        case "Chocolate":
                                Unique_Id=4;
                                Name="Chocolate";
                                Price=250;
                        case "Book":
                                Unique_Id=5;
                                Name="Book";
                                Price=150;
                        case "Bottle":
                                Unique_Id=6;
                                Name="Bottle";
                                Price=120;
                        case "Comb":
                                Unique_Id=7;
                                Name="Comb";
                                Price=110;
                        case "Bag":
                                Unique_Id=8;
                                Name="Bag";
                                Price=2000;
                        case "Serum":
                                Unique_Id=9;
                                Name="Serum";
                                Price=900;
                        case "pen":
                                Unique_Id=10;
                                Name="pen";
                                Price=10;
                        case "pencil":
                                Unique_Id=11;
                                Name="pencil";
                                Price=5;


                }
                return Price;


        }

        public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                System.out.println("Enter the products: ");
                String products= in.next();
                InventoryManagement InventoryManagement=new InventoryManagement(products);
                int calculateProductsss= InventoryManagement.calculateProducts();
                System.out.println("Price of the products : "+calculateProductsss );

        }
}