import java.util.ArrayList;

public class MinMaxSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int Minsum=0;
        int MaxSum=0;


        for (int i=0;i<arr.length;i++){
            sum+=arr[i];

            if (arr[i]<min){
                min=arr[i];
            }

            if (arr[i]>max){
                max=arr[i];
            }

        }
        Minsum=sum-min;
        MaxSum=sum-max;



        System.out.println(Minsum);
        System.out.println(MaxSum);
    }
}
