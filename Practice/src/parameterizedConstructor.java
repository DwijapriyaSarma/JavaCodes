public class parameterizedConstructor {
    public int x;
    public String name;
    public double y;
parameterizedConstructor(int x, String name, double y){
this.x=x;
this.name= name;
this.y=y;
}
    public static void main(String[]args){
        parameterizedConstructor parameterizedConstructor= new parameterizedConstructor(2,"Maina",3.0);
        System.out.println(parameterizedConstructor.x);
        System.out.println(parameterizedConstructor.name);
        System.out.println(parameterizedConstructor.y);
    }


}

