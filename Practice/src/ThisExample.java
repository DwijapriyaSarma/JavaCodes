public class ThisExample {
    int i;
    void setvales (int i){
       this.i=i;
    }
    void show(){
        System.out.println("The value of i is : "+i);
    }

    public static void main(String[] args) {
        ThisExample thisExample=new ThisExample();
        thisExample.setvales(10);
        thisExample.show();
    }


}

