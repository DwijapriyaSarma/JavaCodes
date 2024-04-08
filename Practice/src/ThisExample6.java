public class ThisExample6 {
ThisExample6 m1(){
    return this;  //return reference of the current object
}

    public static void main(String[] args) {
        ThisExample6 thisExample6=new ThisExample6();
        System.out.println(thisExample6);
        System.out.println(thisExample6.m1());
    }
}
