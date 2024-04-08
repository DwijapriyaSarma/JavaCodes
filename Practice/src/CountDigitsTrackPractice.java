import java.util.Scanner;

public class CountDigitsTrackPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n= sc.nextInt();

        System.out.println("No of digits count: ");
        int num=sc.nextInt();
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem==num){
                count+=1;
            }
            n=n/10;
        }
        System.out.println("total digits of the num: "+count);
    }
}
