public class sameDigitInArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 5,40,5};
        int count =0;
        int num=5;
        for(int i=0;i< arr.length;i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("num of same digits in the array: " +count);
    }

}


