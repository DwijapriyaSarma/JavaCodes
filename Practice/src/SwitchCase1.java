import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a fruit name: ");
        String fruit= sc.next();

        switch (fruit){

            case "Mango":
                System.out.println("King og the fruit");
                break;
            case "Apple":
                System.out.println("tiktik");
                break;
            default:
                System.out.println("Hello");
                break;
            }
        }
    }

