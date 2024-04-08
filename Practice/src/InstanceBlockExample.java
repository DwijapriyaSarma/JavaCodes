public class InstanceBlockExample {
    InstanceBlockExample(){
        System.out.println("0 arg constructor");
    }
    InstanceBlockExample(int i){
        System.out.println("1 arg constructor with arg: "+i);

    }
    InstanceBlockExample(int marks, String name){
        System.out.println("2 arg constructor with marks: "+marks+ "By"+name);

    }
    {
        System.out.println("Instance Block");

    }

    public static void main(String[] args) {
        new InstanceBlockExample();
        new InstanceBlockExample(10);
        new InstanceBlockExample(50,"Puja");
    }
}
