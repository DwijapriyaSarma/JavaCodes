public class IndexOfMaximumArray {
    public static void main(String[] args) {
        int arr[]={4,1,2,4,9,4,12,13};
        int x=4;
        int ans=-1;


        for(int i=0;i< arr.length;i++){
            if(arr[i]==x) {
                ans = i;
            }
        }
        System.out.println("The index number is: "+ans);
    }
}
