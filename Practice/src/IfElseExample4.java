public class IfElseExample4 {
    public static void main(String[] args) {
        int year = 1000;
        if (year%400==0 || (year%4==0 && 100!=0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Non leap year");
        }

    }
}