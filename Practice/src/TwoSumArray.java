import java.util.Arrays;

public class TwoSumArray {
    public static void main(String[] args) {
        int nums[]={8,2,11,15,7};
        int target=9;
        int arr[]=new int[2];


        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }


        System.out.println("The two sum array is: "+ Arrays.toString(arr));
    }

}
