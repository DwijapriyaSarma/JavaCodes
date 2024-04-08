/*
There is a fitness mobile application that offers a variety of workout sessions such as cardio, strength training, and flexibility exercises. To recommend workout plans suitable for different users, the application needs to estimate the calories burned for each type of workout. The number of calories burned per minute are as follows:

        Cardio: 10 calories/minute
        Strength: 8 calories/minute
        Flexibility: 5 calories/minute
        Design and develop a Java program to simulate this scenario.

        Here are your tasks:

        Capture the workout type (Cardio/Strength/Flexibility) and duration from the user.
        Calculate the estimated calories burned based on the workout type and duration.
        Ensure the accuracy of the data and prevent accidental modification.
*/

import java.util.Scanner;

public class FitnessProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the workout type ");

        System.out.println("1.Cardio");
        System.out.println("2.Strength");
        System.out.println("3.Flexibility");
        
        int workout= in.nextInt();
        int Cardio=0;
        int Strength=0;
        int Flexibility=0;
        System.out.println("what is the duration of workout: ");
        int DurationOfWorkout=in.nextInt();


        switch (workout){
            case 1 :
                Cardio=10;
                Cardio=Cardio*DurationOfWorkout;
                System.out.println("Type of workout is Cardio and burned calories in Cardio: "+Cardio);
                break;
            case 2 :
                Strength=8;
                Strength=Strength*DurationOfWorkout;
                System.out.println("Type of workout is Strength and burned calories in Strength: "+Strength);
                break;
            case 3 :
                Flexibility=5;
                Flexibility=Flexibility*DurationOfWorkout;
                System.out.println("Type of workout is Flexibility and burned calories in Flexibility: "+Flexibility);
                break;
            default:
                System.out.println("Select a valid workout");

        }
        }}


