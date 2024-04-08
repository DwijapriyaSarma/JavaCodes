import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter years of service: ");
        int years= sc.nextInt();

        System.out.println("Enter basic salary: ");
        int salary= sc.nextInt();

        System.out.println("Enter percentage of sales target: ");
        float salesTarget=sc.nextInt();

        System.out.println("No of time they have been late: ");
        int late=sc.nextInt();

        int bonus=0;

        if (years>5){
            bonus=bonus+salary*(15/100);
            if (salesTarget>90){
                bonus=bonus+salary*5;
            }
            if (late>3)
                bonus=bonus+salary*(3/100);
           /* else{
                bonus=
            }*/
    }

}}
