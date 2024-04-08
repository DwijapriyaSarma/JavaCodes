import java.util.Scanner;

public class NumericalPattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int r=sc.nextInt();

        for(int i=1; i<=r; i++){
            for (int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+"");
            }
            for (int q=i-1;q>=1;q--){
                System.out.print(q+"");
            }
            System.out.println();
        }
    }
    }

/*
   1
  121
 12121
1212121
* */