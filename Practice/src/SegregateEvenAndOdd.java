import java.util.Arrays;

public class SegregateEvenAndOdd {
    public static void main(String[] args) {
        int arr[] = {12, 34, 45, 9, 8, 90, 3};
        int n = arr.length;
        int nums[] = new int[arr.length];
        int j=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
            nums[j]=arr[i];
            j++;
            count+=1;
            }
        }

        Arrays.sort(nums,0,count);



        for (int i=0;i<n;i++){
            if(arr[i]%2!=0){
                nums[j]=arr[i];
                j++;

            }
        }

        Arrays.sort(nums,count,n);
        System.out.println("The array is"+ Arrays.toString(nums));
        }
}


