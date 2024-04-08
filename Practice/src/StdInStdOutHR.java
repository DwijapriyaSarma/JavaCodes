import java.util.Scanner;

public class StdInStdOutHR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter a string: ");
        String myString = scanner.next();

       // System.out.println("Enter a int: ");
        int myInt = scanner.nextInt();

        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
    }
}
