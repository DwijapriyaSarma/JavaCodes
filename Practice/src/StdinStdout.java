import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a int: ");
            int i = scan.nextInt();

        System.out.println("Enter a double: ");
            Double d = scan.nextDouble();

        System.out.println("Enter a string: ");
            scan.nextLine();
            String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
