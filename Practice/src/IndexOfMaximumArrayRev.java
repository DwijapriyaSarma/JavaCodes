public class IndexOfMaximumArrayRev {
    public static void main(String[] args) {
        int arr[]={4,1,2,4,88,9,8,12,88,15,78,6};
        int x=8;
        int ans=-1;


        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]==x) {
                ans = i;
                break;
            }

        }System.out.println("The index number is: "+ans);

    }
}
