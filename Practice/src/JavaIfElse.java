public class JavaIfElse {
    public static void main(String[] args) {
        int n = 20;

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && (n < 2 || n <= 5)) {
            System.out.println("Not Weired");
        } else if (n % 2 == 0 && (n < 6 || n <= 20)) {
            System.out.println("Weired");
        } else if (n % 2 == 0 && n < 20) {
            System.out.println("Not Weired");
        }
    }
}


