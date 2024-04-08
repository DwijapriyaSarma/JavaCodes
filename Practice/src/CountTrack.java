import java.util.Scanner;

public class CountTrack {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = obj.nextInt();
        System.out.println("Enter the number of digits to count: ");
        int num=obj.nextInt();
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == num) {
                    count += 1;
                }
                n = n / 10;
            }
            System.out.println("No of same digits: " + count);
        }
    }
