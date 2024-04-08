public class ReverseMatrix {
    public static void main(String[] args) {
        int Matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        ReverseTheMatrix(Matrix,Matrix[0].length,Matrix.length);
    }

    private static void ReverseTheMatrix(int[][] Matrix,int c,int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                while (i < j) {
                    swapArray(i, j, Matrix);
                    i += 1;
                    j -= 1;
                }
            }
        }
        printArray(Matrix);
    }

    private static void swapArray(int i, int j, int[][] Matrix) {
       int temp=Matrix[i][j];
        Matrix[i][j]=Matrix[j][i];
        Matrix[j][i]=temp;
    }
    private static void printArray(int[][] a) {
        for (int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
}}}