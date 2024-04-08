import java.util.Scanner;

public class NumericalPattern4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of row");
        int r= in.nextInt();

        for (int i=1; i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
           
            }
            System.out.println();
        }
    }
}
/*
1
12
123
1234
* */