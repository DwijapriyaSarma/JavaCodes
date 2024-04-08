import java.util.ArrayList;

public class CompareTheTriplates {
    public static void main(String[] args) {
        int arr1[] = {17, 27,28, 30};
        int arr2[] = {99, 27,16, 8};
        ArrayList<Integer> lis = new ArrayList<>();
        int Alice = 0;
        int Bob = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                Alice++;
            }
            if (arr1[i] < arr2[i]) {
                Bob++;
            }


        }
        System.out.println(Alice);
        System.out.println(Bob);

    }
}