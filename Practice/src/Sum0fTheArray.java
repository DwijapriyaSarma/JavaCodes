import java.util.Arrays;

public class Sum0fTheArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,7};
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum is: "+sum);
    }

}
