public class RemoveElementArray {
    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                arr[i]=nums[j];
                j++;

    }
}
        System.out.println("The array is: "+arr);
    }}
