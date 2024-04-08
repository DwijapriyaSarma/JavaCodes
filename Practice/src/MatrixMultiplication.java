public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
        int b[][]={{5,6},{0,7}};
        
        int r1= a.length;
        int c1=a[0].length;
        int r2=b.length;
        int c2=b[0].length;
        
        multiplicationMatrix(a,b,r1,r2,c1,c2);
    }

    private static void multiplicationMatrix(int[][] a, int[][] b, int r1, int r2, int c1, int c2) {
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input-multiplication not possible");
            return;
        }
        int[][] multiplication= new int [r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                multiplication[i][j]=a[i][j]*b[i][j]+a[j][i]*b[i][j];
            }
        }
        printArray(multiplication);
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
