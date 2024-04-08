

public class RotateClockwiseMatrix {
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix,matrix.length);
        printArray(matrix);
    }

    private static void rotate(int[][] matrix, int n) {
        transposeMatrixInplace(matrix,n,n);

        for (int i=0;i<n;i++){
            RreverseArray(matrix[i]);
        }
    }
    private static void RreverseArray(int[] arr) {
        int i=0;
        int j= arr.length-1;

        while (i<j){
            swipeArray(i,j,arr);
            i+=1;
            j-=1;
        }
    }

    private static void swipeArray(int i, int j, int[] arr) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


    private static void transposeMatrixInplace(int[][] matrix, int c, int r) {
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

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