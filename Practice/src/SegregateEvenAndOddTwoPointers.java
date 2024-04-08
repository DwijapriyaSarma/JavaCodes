import java.util.Arrays;

public class SegregateEvenAndOddTwoPointers {
    public static void main(String[] args) {
        int nums[] = {12, 34, 45, 9, 8, 90, 3};
        int n = nums.length;
        int i=0;
        int j=n-1;


        while (i < j) {
            if (nums[i] % 2== 0 && nums[j] % 2!= 0) {
                i += 1;
                j-=1;
            } else if (nums[i] %2== 0 && nums[j] %2 == 0) {
                i+=1;
            } else if (nums[i] %2!=0 && nums[j]%2 != 0) {
                j-=1;
            } else if (nums[i] %2!=0 && nums[j]%2 ==0) {

                swapsArray(i,j,nums);
                i += 1;
                j -= 1;
            }

        }
        var count=0;
        for(int k=0; k<nums.length; k++){
            if(nums[k]%2==0){
                count++;
            }
        }

        //System.out.println(count);


        Arrays.sort(nums,0,count);
        Arrays.sort(nums,count,n);

       System.out.println(Arrays.toString(nums));

        }
    private static void swapsArray(int i, int j, int[] nums) {
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }


}

