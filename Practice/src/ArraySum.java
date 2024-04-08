import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println("the sum of the array: " +sum);


        }

}