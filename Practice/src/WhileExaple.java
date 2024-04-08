import java.util.Scanner;

public class WhileExaple {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char input=sc.next().trim().charAt(0);

        while (true){
        System.out.println("Maina");
        if(input=='x' || input=='X'){
            break;
        }
    }
}}
