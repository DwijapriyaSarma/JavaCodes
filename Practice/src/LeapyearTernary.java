public class LeapyearTernary {
    public static void main(String[] args) {
        int year = 2032;
        System.out.println(year%400==0 || (year%4==0 && 100!=0)? "leap year" :"Normal year");
    }
}
