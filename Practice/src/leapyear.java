public class leapyear {
    public static void main(String[] args) {

        int year = 1700;
        if (year % 400 ==0 || (year % 4 == 0 && 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Normal year");
        }
    }
}
