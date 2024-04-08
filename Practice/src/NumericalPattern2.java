import java.util.Scanner;

public class NumericalPattern2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int r= in.nextInt();

        for (int i=1; i<=r;i--){
            for (int j=1;j<=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}