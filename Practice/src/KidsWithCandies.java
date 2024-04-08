public class KidsWithCandies {
    public static void main(String[] args) {
        int nums[] = {2, 3, 5, 1, 3};
        boolean ans[] = new boolean[nums.length];
        int ExtraCandies = 3;
        int max=-1;

        for (int i = 0; i < nums.length; i++) {
            if (i >max) {
                max=i;
            }
        }
        for (int j=0; j< nums.length;j++){
            if(j+ExtraCandies>max){
                ans[j]=true;
            }else {
                ans[j]=false;
            }
        }



    }
}