public class ShallowCopyExample {
    public static void main(String[] args) {
        int arr[]={5,6,7,8};
        int arr2[]=arr;
        arr2[0]=0;
        arr2[1]=1;
        System.out.println("Original array after changing arr-2");
        printArray(arr);
        System.out.println("Copied array after changing");
        printArray(arr2);
    }
    private static void printArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
