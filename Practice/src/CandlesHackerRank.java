public class CandlesHackerRank {
    public static void main(String[] args) {
        int arr[] = {4, 4, 1, 3};
        int max = 0;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j=0;j<arr.length;j++){
            if (arr[j]==max) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
