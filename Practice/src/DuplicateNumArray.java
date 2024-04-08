import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5};
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();

        Arrays.sort(arr);

        //System.out.println(Arrays.toString(arr));
        ArrayList<Integer> lis1 = new ArrayList<>();

        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                if(!lis1.contains(arr[i])){
                    lis.add(arr[i]);
                }
            }

            lis1.add(arr[i]);
        }

        System.out.println(lis);



    }
}


