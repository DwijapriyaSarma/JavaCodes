import java.util.Arrays;

public class RotateArray2 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int ans[]=new int[nums.length];
        int n= nums.length;
        int k=3;
        k=k%n;
        int j=0;

        for (int i=n-k;i<n;i++){
            ans[j]=nums[i];
            j+=1;
        }

        for (int i=0;i<n-k;i++){
            ans[j]=nums[i];
            j+=1;
        }
        System.out.println("The array is"+ Arrays.toString(ans));
    }

}
