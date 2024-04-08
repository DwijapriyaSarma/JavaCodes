import java.util.ArrayList;
import java.util.Arrays;

public class ValueEqualToIndexArray {
    public static void main(String[] args) {
        int arr[]={15, 2, 45, 12, 7};
        int n= arr.length;
        ArrayList<Integer> lis =new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                lis.add(arr[i] );
            }

        }
        System.out.println(lis);
    }

}
