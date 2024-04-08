import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int add=0;
        while(n>0){
            int rem=n%10;
            add=add+rem;
            n=n/10;
        }
        System.out.println("The addition of digits: "+add);
    }
}
