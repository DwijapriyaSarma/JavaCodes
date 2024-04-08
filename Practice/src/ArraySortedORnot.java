public class ArraySortedORnot {
    public static void main(String[] args) {
        int arr[] = {10,40, 20, 30, 40};
        boolean b = true;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                break;
            }
            if (arr[i] > arr[i + 1]) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}

