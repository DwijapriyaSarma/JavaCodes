import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;{
            for(int i=0;i<=n;i++){
                if (i%2==0){
                    sum=sum-i;
                }
                else {
                    sum=sum+i;
                }
            }
            System.out.println("Sum of the nth term: "+n+"is "+sum);
        }

    }



}
