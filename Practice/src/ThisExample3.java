public class ThisExample3 {
    ThisExample3(){
        this(10);
        System.out.println("0 arg cons");
    }
    ThisExample3(int a){
        this(22, 45);
        System.out.println("1 arg cons");
    }
    ThisExample3(int a, int b){
        System.out.println("2 arg cons");
    }

    public static void main(String[] args) {
        ThisExample3 c=new ThisExample3();
    }
}
