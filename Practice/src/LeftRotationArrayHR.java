import java.util.Arrays;

public class LeftRotationArrayHR {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;

        int n = arr.length;
            d = d % n;

        for (int i = 0; i <= d; i++) {
            int temp = arr[n-1];

            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}


