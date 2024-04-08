import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,9,1};
        RreverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void RreverseArray(int[] arr) {
        int i=0;
        int j= arr.length-1;

        while (i<j){
            swipeArray(i,j,arr);
            i+=1;
            j-=1;
        }
    }

    private static void swipeArray(int i, int j, int[] arr) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


}
