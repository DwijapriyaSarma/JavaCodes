import javax.imageio.stream.ImageInputStream;

public class ConstructorFun {
    int a;
    String name;
    double b;
     ConstructorFun(int a, String name, double b){
         this.a=a;
         this.name=name;
         this.b=b;
     }
     void display(){
         System.out.println("int is: " +a+" name is: "+name+" b is : "+b);}

    public static void main(String[] args) {
        ConstructorFun ConstructorFun= new ConstructorFun(3,"Mi", 2.0);
        ConstructorFun.display();
    }


}
