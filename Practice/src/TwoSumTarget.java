import java.util.Scanner;

public class TwoSumTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(" Enter target: ");
        int t=sc.nextInt();

        for(int i=0;i<n;i++){
        if(arr[0]+arr[1]==t);
            System.out.println(t);
            break;
    }
        if (arr[0]+arr[2]==t);
        System.out.println(t);

}}
