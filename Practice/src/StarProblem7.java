import java.util.Scanner;

public class StarProblem7 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of row");
        int n= in.nextInt();

        for (int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}