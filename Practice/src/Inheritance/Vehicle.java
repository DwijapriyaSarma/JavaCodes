package Inheritance;

public class Vehicle {
    private String colour;
    public String make;
    private String model;
    private static int vehicleCount=0;


    public String getColour() {
        return colour ;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Vehicle(String colour, String make, String model) {
        this.colour = colour;
        this.make = make;
        this.model = model;
        vehicleCount++;
    }

    public static void CountVehicle() {
        System.out.println("The no of vehicle: "+Vehicle.vehicleCount);
    }
}
    class car extends Vehicle {
        int speed;


        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public car(String colour, String make, String model, int speed) {
            super(colour, make, model);
            this.speed=speed;
        }

        void displaySpeed(){
            System.out.println("speed of the car is: "+this.speed);
        }
    }

       class test{
           public static void main(String[] args) {
               car car=new car("red","Honda","XYZ",30);
               car car2=new car("Blue","Hundai","ABX",80);
               car car3=new car("BLACK","Safari","XpZ",60);

               car.displaySpeed();
               car2.displaySpeed();
               car3.displaySpeed();

               Vehicle.CountVehicle();

           }
       }

       /*1. Create a class named 'Vehicle' with private attributes: 'color', 'make' and 'model'. Include a constructor to set these values and use getters and setters to encapsulate the data access (demonstrate the concept of encapsulation and data hiding).

2. Next, create a static method in the same class that counts and outputs the number of objects that are created from the 'Vehicle' class (demonstrate the use of static).

3. Afterwards, create a subclass 'Car' that inherits from the 'Vehicle' class (demonstrate inheritance).

4. Also, add an additional attribute 'speed' in the 'Car' subclass and include a method which displays the speed of the Car.
*/