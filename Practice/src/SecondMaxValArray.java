public class SecondMaxValArray {
    public static void main(String[] args) {
        int arr[] = {1,4,7,99,78,6};
        int max= maxEle(arr);
        int secondMax = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){  //2nd part

            if(arr[i]!=max){
                if(arr[i]>secondMax){
                    secondMax=arr[i];
                }
            }
        }
        if (secondMax==Integer.MIN_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(secondMax);
        }
    }


        private static int maxEle(int[] arr){  //1st part
            int max=Integer.MIN_VALUE;
            for (int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
return max;
        }

}


