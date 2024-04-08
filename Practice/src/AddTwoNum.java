import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        System.out.println("Enter two number for addition");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a= sc.nextInt();

        System.out.println("Enter second number: ");
        int b=sc.nextInt();

        System.out.println("Addition of two numbers are: "+(a+b));
    }
}
