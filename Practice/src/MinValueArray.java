import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println("The minimum value is:"+ans);
    }
}
