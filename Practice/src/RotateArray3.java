import java.util.Arrays;

public class RotateArray3 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7,};
       reverseArray(nums);
       reverseArray2(nums);
       reverseArray3(nums);
        System.out.println(Arrays.toString(nums));
   }
   private static void reverseArray(int [] nums){

        int k=3;
        int n = nums.length;
        k=k%n;
        int i=0;
        int j= n-k-1;
        while (i<j){
            swapArray(i,j,nums);
            i+=1;
            j-=1;
        }
    }
    private static void swapArray(int i,int j,int nums[]){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;

}

    private static void reverseArray2(int [] nums){

        int k=3;
        int n = nums.length;
        k=k%n;
        int i=n-k;
        int j= n-1;
        while (i<j){
            swapArray2(i,j,nums);
            i+=1;
            j-=1;
        }
    }
    private static void swapArray2(int i,int j,int nums[]){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    private static void reverseArray3(int [] nums){

        int k=3;
        int n = nums.length;
        k=k%n;
        int i=0;
        int j= n-1;
        while (i<j){
            swapArray3(i,j,nums);
            i+=1;
            j-=1;
        }
    }
    private static void swapArray3(int i,int j,int nums[]) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}
