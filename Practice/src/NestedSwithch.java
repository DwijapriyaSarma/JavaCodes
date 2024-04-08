import java.util.Scanner;

public class NestedSwithch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Employee Id: ");
        int EmpId= sc.nextInt();

        switch (EmpId){
            case 1:
                System.out.println("kamlesh");
                break;
            case 2:
                System.out.println("Maina");
                break;
            case 3:
                System.out.println("Enter a department: ");
                String department= sc.next();
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Enter a valid department");

                }
            default:
                System.out.println("Enter a valid employee id");
                break;
        }
    }
}
