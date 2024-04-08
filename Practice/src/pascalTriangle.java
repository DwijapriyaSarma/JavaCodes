public class pascalTriangle {
    public static void main(String[] args) {
        int n = 4;
        int result[][] = generatePascalTriangle(n);
        printArray(result);
    }

    private static int[][] generatePascalTriangle(int n) {
        int[][] ans = new int[n][];
        for (int i=0;i<n;i++){
        //ith row i+1th columns

            /*
               ans[0]=new int [1]
               ans[1]=new int [2]
               */
        ans[i] = new int[i + 1];

        //1st and last element of every row is 1;
            ans[i][0]=ans[i][i]=1;

        for (int j=1;j<i;j++){
            ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
        }
    }
    return ans;
}
public static void printArray(int [][] a){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i] [j] +" ");
            }
            System.out.println();
        }
}
}