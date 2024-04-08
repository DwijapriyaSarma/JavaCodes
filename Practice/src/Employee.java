public class Employee {
    static int empid=0;
    String name;
    static String company= "X";

    public Employee( String name){
        Employee.empid=Employee.empid+1;
        this.name=name;
    }
    void display(){
        System.out.println("employee id is: "+Employee.empid+" and "+" Name of the employee is: "+name+" Company name is: "+Employee.company);
    }

    public static void main(String[] args) {
        Employee e1= new Employee("puja");
        e1.display();
        Employee e2= new Employee("puja1");
        e2.display();
        Employee e3= new Employee("puja2");
        e3.display();
    }
}
