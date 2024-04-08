public class TransposeMatrix2 {
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3},{4,5,6},{7,8,9}};
        transposeMatrixInplace(matrix,matrix[0].length,matrix.length);
    }

    private static void transposeMatrixInplace(int[][] matrix, int c, int r) {
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        printArray(matrix);
    }

    private static void printArray(int[][] a) {
        for (int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
