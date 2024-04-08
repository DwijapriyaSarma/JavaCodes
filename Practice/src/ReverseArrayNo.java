import java.util.Arrays;

public class ReverseArrayNo {
    public static void main(String[] args) {
        int nums[]={100,1};
        int arr[]=new int[nums.length];

        for (int i= nums.length-1;i>=0;i--){
            arr[i]=nums[nums.length-(i+1)];

        } System.out.println("The reverse array is: "+ Arrays.toString(arr));
    }
}







