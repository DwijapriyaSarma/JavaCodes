import java.util.Arrays;

public class Segregate0And1WithOutSpace {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,0,1,0,1,0};
        int n=nums.length;
        int zeroCount=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                zeroCount+=1;
            }
        }

        for(int i=0; i<n;i++){
            if(i<zeroCount){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }

        System.out.println(Arrays.toString(nums));


    }
}
