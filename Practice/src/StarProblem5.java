import java.util.Scanner;

public class StarProblem5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of row");
        int r= in.nextInt();
        System.out.println("Enter number of column");
        int c= in.nextInt();
        for (int i=r; i<=1;i++){
            for (int j=1;j<=r;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}