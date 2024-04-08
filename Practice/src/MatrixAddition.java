public class MatrixAddition {
    public static void main(String[] args) {
        int a[][]={{2,3},{4,6}};
        int b[][]={{1,4},{2,5}};
        
        int r1= a.length;
        int c1=a[0].length;
        int r2=b.length;
        int c2=b[0].length;
        
        addMatrix(a,b,r1,r2,c1,c2);
    }

    private static void addMatrix(int[][] a, int[][] b, int r1, int r2, int c1, int c2) {
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input-Addition not possible");
            return;
        }
        int[][] sum= new int [r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArray(sum);
    }

    private static void printArray(int[][]a) {
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }

}
