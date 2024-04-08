public class ArraySortedORnot2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        boolean b=false;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j < args.length; j++) {
                if (arr[j] > arr[j]) {
                 b=true;
                }else {
                    b=false;
                }

            }

        }
    }
}