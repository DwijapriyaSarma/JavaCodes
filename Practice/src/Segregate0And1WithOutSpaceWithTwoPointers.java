import java.util.Arrays;

public class Segregate0And1WithOutSpaceWithTwoPointers {
    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 0, 1, 0, 1, 0};
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (nums[i] == 0 && nums[j] == 0) {
                i += 1;
            } else if (nums[i] == 0 && nums[j] == 1) {
                i += 1;
                j -= 1;
            } else if (nums[i] == 1 && nums[j] == 1) {

                j -= 1;
            } else if (nums[i] == 1 && nums[j] == 0) {

                swapArray(i,j,nums);
                i += 1;
                j -= 1;
            }
        }

        System.out.println(Arrays.toString(nums));


    }

    private static void swapArray(int i, int j, int[] arr) {

        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
