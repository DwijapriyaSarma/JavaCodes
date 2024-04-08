public class PrefixSuffixSum {
    public static void main(String[] args) {
        int arr[] = {10, 30,20,10,30,20};
        int sum = sumArray(arr);

        int values[] = isPrefixAndSuffixEqual(sum, arr);

        if (values.length>0){
            System.out.println("Prefix sum and suffix sum are equal with value: "+values[0]+" and at position: "+values[1]);
        }else {
            System.out.println("Prefix sum and suffix sum are not equal");
        }
    }



    private static int [] isPrefixAndSuffixEqual(int sum, int[] arr) {
        int prefixSum = 0;
        int result[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = sum - prefixSum;
            if (prefixSum == suffixSum) {
                result[0]=prefixSum;
                result[1]=i;
                break;
            }
        }
        return result;
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
