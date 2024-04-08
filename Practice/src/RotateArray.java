import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        int n= nums.length;
        k=k%n;

        for (int i=0;i<k;i++) {
            int temp = nums[n-1];

            for (int j = n - 1; j >0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
        System.out.println("The Array is:"+Arrays.toString(nums));
    }
}


