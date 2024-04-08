import java.util.Scanner;

public class calculatorPract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        while (true){
            System.out.println("Enter two numbers: ");
            int a= sc.nextInt();
            int b=sc.nextInt();
            System.out.println("press + for addition  operation");
            System.out.println("press - for subtraction  operation");
            System.out.println("press * for multiplication  operation");
            System.out.println("press / for divide  operation");
            System.out.println("press % for modulo operation");
            System.out.println("press X for exit from the calculator");

            char ch=sc.next().trim().charAt(0);

            switch (ch){
                case '+':
                    ans= a+b;
                    break;
                case '-':
                    ans= a-b;
                    break;
                case '*':
                    ans= a*b;
                    break;
                case '/':
                    ans= a/b;
                    if(b!=0){
                        ans=a/b;
                        break;
                    }else {
                        System.out.println("Dont use 0");
                        continue;
                    }

                case '%':
                    ans= a%b;
                    if(b!=0){
                        ans=a%b;
                        break;
                    }else {
                        System.out.println("Dont use 0");
                        continue;
                    }
                case 'x':
                case 'X':
                    System.out.println("Thank you for using the calculator");
                    System.exit(0);
                default:
                    System.out.println("Invalid operation");
                    continue;

            }
            System.out.println("The answer is : "+ans);


        }
    }
}
