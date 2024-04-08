import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int a=sc.nextInt();
        int fact=1;

        for (int i=1;i<=a;i++){
            fact=fact*i;
            System.out.println("Factorial of term: "+i +" is "+fact);
        }

    }
}
