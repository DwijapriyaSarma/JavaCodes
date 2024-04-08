package LeetcodePractice;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[]={4,1,2,1,2};
        int k=0;

        for(int i=0;i< nums.length;i++){
           k^=nums[i];
                }
        System.out.println(k);}



    }


