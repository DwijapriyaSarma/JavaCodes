public class ConstructorChaining {

    ConstructorChaining(){
        this(10);
        System.out.println("0 arg cons");
    }
    ConstructorChaining(int a){
        this(22, 45);
        System.out.println("1 arg cons");
    }
    ConstructorChaining(int a, int b){
        System.out.println("2 arg cons");
    }

    public static void main(String[] args) {
        ConstructorChaining c=new ConstructorChaining();
    }
}
