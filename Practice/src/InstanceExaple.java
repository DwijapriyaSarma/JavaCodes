public class InstanceExaple {
    int e=  10;

    void display(){
        System.out.println(22);

    }

    public static void main(String[] args) {
        InstanceExaple InstanceExaple=new InstanceExaple();
        InstanceExaple.display();
        new InstanceExaple().display();



    }
}
