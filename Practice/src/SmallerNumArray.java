public class SmallerNumArray {
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
        int ans[]=new int[nums.length];
        int count= 0;

        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums.length;j++) {
                if (j != i && nums[j] < nums[i]) {

                    count+=nums[j];
                    ans[i] = count;


                }


            }

        }

    }

}
