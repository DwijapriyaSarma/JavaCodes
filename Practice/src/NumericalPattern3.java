import java.util.Scanner;

public class NumericalPattern3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of row");
        int r= in.nextInt();

        for (int i=r; i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}

/*
1234
123
12
1
* */