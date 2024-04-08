public class ThisExample4 {
    void m1(ThisExample4 ThisExample){
        System.out.println("I am a method");
    }
    void m2(){
        m1(this);
    }

    public static void main(String[] args) {
        ThisExample4 thisExample4=new ThisExample4();
        thisExample4.m2();
        thisExample4.m1(thisExample4);
    }

}
