import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int nums[]={2,3,4,5,8,6};
        int n= nums.length/2;
        int ans[]=new int [nums.length];
        int j=0;
        int k=n;

        for(int i=0;i< nums.length;i++){
            if(i%2==0){
                ans[i]=nums[j];
                j+=1;
            }else {
                ans[i]=nums[k];
                k+=1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
