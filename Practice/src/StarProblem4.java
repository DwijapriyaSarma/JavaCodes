import java.util.Scanner;

public class StarProblem4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of row");
        int r= in.nextInt();
        System.out.println("Enter number of column");
        int c= in.nextInt();
        for (int i=1; i<=r;i++){
            for (int j=c;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}