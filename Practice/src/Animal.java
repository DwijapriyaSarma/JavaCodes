/*
Q You are creating a system to manage a zoo. Each animal in the zoo has a name, an age, and a specific sound it makes. Additionally, you want to keep track of the total number of animals in the zoo.

        1. Implement a Java program that defines an Animal class to represent each animal. Use a constructor to set the name, age, and sound of the animal. Ensure that the animal's age cannot be negative.7 marks

        2. Include a static method in the Animal class to display the total number of animals in the zoo. 5

        3. Test your program by creating instances of different animals, displaying their details, and checking the total number of animals in the zoo. 5
*/
public class Animal{
    private String name;
    public int age ;
    public String sound;
    private static  int animalCount=0;
    public Animal(String name, int age, String sound){
        if(age>=0){
        this.name= name;
        this.age=age;
        this.sound=sound;
        Animal.animalCount +=1;
    }
        else {
            System.out.println("Animal age cannot be negative");
        }
    }
    void display(){
        if (this.name != null && this.age >=0 && this.sound != null){
            System.out.println("Name of the Animal: " + name);
            System.out.println("Age of the Animal: " + age);
            System.out.println("Sound of the animal: " + sound);

            System.out.println("\n");
        }
    }

    public static void trackAnimalCount() {
        System.out.println("Count of the animals: " + animalCount);

    }
    public static void main(String[] args) {
        Animal a= new Animal("tiger",5,"roar");
        Animal a1= new Animal("Elephant", 2, "trumpet");
        Animal a2= new Animal("Dog", 3,"Bow bow");
        Animal a3= new Animal("Lion", -1,"xsdw");

        a.display();
        a1.display();
        a2.display();
        a3.display();
        Animal.trackAnimalCount();
    }
}