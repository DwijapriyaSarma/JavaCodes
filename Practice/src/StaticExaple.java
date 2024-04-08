public class StaticExaple {
    static int a;
    void m2(){
        System.out.println(a);
    }
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        new StaticExaple().m2();
        System.out.println(StaticExaple.a);
    }

}
