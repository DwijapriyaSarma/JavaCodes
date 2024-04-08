public class instanceExample {
    int eid;
    {
        eid=11;
    }
    void display(){
        System.out.println(eid);
    }

    public static void main(String[] args) {
        new instanceExample().display();
    }
}
