import java.util.Stack;

public class NewExample {
    int a= 10;
    static int b= 20;
    void m1(int a){
        System.out.println("Instance Method");
    }
    static void m2(String str){
        System.out.println("Static Method");
    }
    NewExample(){
        System.out.println("0 arg cons");
    }
    NewExample(int a){
        System.out.println("1 arg cons");
    }
    {
        System.out.println("Instance Block-1");
    }
    static {
        System.out.println("Static block -1");
    }

    public static void main(String[] args) {
        NewExample m= new NewExample();
        NewExample m1= new NewExample(10);
        m.m1(10);
        NewExample.m2("tiktik");

    }
}
