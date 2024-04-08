import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int ans=0;
        while (true){
            System.out.println("Dear user please enter two numbers to perform operation in calculator");
            int a=in.nextInt();
            int b= in.nextInt();
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("* for multiplication");
            System.out.println("/ for division");
            System.out.println("% for modulo operation");
            System.out.println("x or X to off the calculator");
            char ch= in.next().trim().charAt(0);
            switch (ch){
                case '+':
                    ans= a+b;
                    break;
                case '-':
                    ans=a-b;
                    break;
                case '*':
                    ans= a*b;
                    break;
                case '/':
                    if(b!=0){
                    ans= a/b;
                    break;}
                    else {
                        System.out.println("The operation could cause division by zero exception hence skipping iteration");
                        continue;
                    }
                case '%':
                    if(b!=0){
                        ans= a%b;
                        break;}
                    else {
                        System.out.println("The operation could cause division by zero exception hence skipping iteration");
                        continue;
                    }
                case 'x':
                case 'X':
                    System.out.println("Thank you for using the calculator");
                    System.exit(0);
                default:
                    System.out.println("Invalid operation please try again");
                    continue;
            }
            System.out.println("The answer is:"+ans);
    }
}}
