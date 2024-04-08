import java.util.Scanner;

public class NumericalPattern1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of row");
        int n= in.nextInt();

        for (int i=1; i<=n;i++){
            int count=0;
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
                count+=1;
            }
            int calc=n-count;
            for (int k=1;k<=calc;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}