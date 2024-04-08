import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int n= sc.nextInt();

        System.out.println("Enter the array element: ");
        int arr[]=new int[n];

        for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>ans){
           ans=arr[i];
        }

}
        System.out.println("The maximum value is: "+ans);
}}
