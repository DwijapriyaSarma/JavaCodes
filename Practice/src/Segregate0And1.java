import java.util.Arrays;

public class Segregate0And1 {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,0,1,0,1,0};
        int n=nums.length;
        int ans[]=new int [n];
        int j=n-1;
        for (int i=0;i<n;i++){
            if(nums[i]==1){
                ans[j]=nums[i];

                j-=1;


            }

            }
        System.out.println("The array is "+Arrays.toString(ans));
        }

}
