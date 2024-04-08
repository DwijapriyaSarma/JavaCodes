public class ThisExample5 {
    ThisExample5 (ThisExample5 td){
        System.out.println("Test class constructor");
    }
    ThisExample5(){
        new ThisExample5(this);
    }

    public static void main(String[] args) {
        ThisExample5 thisExample5=new ThisExample5();
    }
}
