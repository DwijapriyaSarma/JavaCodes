public class SwipeUsingNoV {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        a=a+b;

        System.out.println("b="+(b=a-b));
        System.out.println("a="+(a=a-b));
        }
    }

