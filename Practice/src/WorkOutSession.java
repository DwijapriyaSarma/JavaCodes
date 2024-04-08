/*here is a fitness mobile application that offers a variety of workout sessions such as cardio, strength training, and flexibility exercises. To recommend workout plans suitable for different users, the application needs to estimate the calories burned for each type of workout. The number of calories burned per minute are as follows:

        Cardio: 10 calories/minute
        Strength: 8 calories/minute
        Flexibility: 5 calories/minute
        Design and develop a Java program to simulate this scenario.

        Here are your tasks:

        Capture the workout type (Cardio/Strength/Flexibility) and duration from the user.
        Calculate the estimated calories burned based on the workout type and duration.
        Ensure the accuracy of the data and prevent accidental modification.*/


import java.util.Scanner;

public class WorkOutSession {
    private  String workoutPlane;
    private int duration;

    private static final int CALORIE_BURN_CARDIO=10;
    private static final int CALORIE_BURN_STRENGTH=8;
    private static final int CALORIE_BURN_FLEXIBILITY=5;

    private int burnCalories;

    public WorkOutSession(String workoutPlane, int duration) {
        this.workoutPlane = workoutPlane;
        this.duration = duration;
    }



    public int calculateBurnCalories(){
        switch (workoutPlane){
            case "cardio":
                burnCalories=CALORIE_BURN_CARDIO*duration;
                break;
            case "strength":
                burnCalories=CALORIE_BURN_STRENGTH*duration;
                break;
            case "flexibility":
                burnCalories=CALORIE_BURN_FLEXIBILITY*duration;
                break;
            default:
                System.out.println("Invalid workout plan");
        }

            return burnCalories;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter workOutPlan(Cardio/Strength/Flexibility)");
        String workoutPlan= sc.next();
        System.out.println("Enter duration in minute");
        int duration= sc.nextInt();
        WorkOutSession WorkOutSession= new WorkOutSession(workoutPlan, duration);
        int calculateWorkout= WorkOutSession.calculateBurnCalories();
        if(calculateWorkout!=0) {
            System.out.println("Burned calories : " +calculateWorkout);
        }else {
            System.out.println("User choose invalid option");
        }

    }
}
