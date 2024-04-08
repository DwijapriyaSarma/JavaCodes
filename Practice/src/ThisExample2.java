public class ThisExample2 {
    public int i;
    void setvales (int i){
        this.i=i;
    }
    void show(){
        this.display();
        System.out.println("The value of i is : " +i);
    }
    void display()
    {
        System.out.println("Hi I am Display method");
    }
    public static void main(String[] args) {
        ThisExample2 thisExample=new ThisExample2();
        thisExample.setvales(10);
        thisExample.show();
    }

}
