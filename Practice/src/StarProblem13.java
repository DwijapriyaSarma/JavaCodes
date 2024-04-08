import java.util.Scanner;

    public class StarProblem13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of row: ");
            int r = sc.nextInt();

            for (int i = r; i >=1; i--) {
                for (int j = 1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    /*

     ****
     ***
     **
     *

     */

