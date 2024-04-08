import java.util.Arrays;

public class MinAndMaxArrayVal {
    public static void main(String[] args) {
        int arr[]={2,4,8,6,1,5};
        extractedMinAndMax(arr);
    }

    private static void extractedMinAndMax(int[] arr) {
        int ans=Integer.MAX_VALUE;
        int res=Integer.MIN_VALUE;
        int result[]=new int[2];

        for(int i = 0; i< arr.length; i++){
            if(arr[i]<ans){
            ans= arr[i];

        }
        for (int j = 0; j< arr.length; j++){
            if(arr[j]>res){
                res= arr[j];

            }
        }

        }
        result[0]=ans;
        result[1]=res;
        System.out.println("The array is: "+ Arrays.toString(result));
    }

}
