import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for (int i=2;i<=n;i++)
        {
            int sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println("nth fibonacci series is: "+b);
    }
}
