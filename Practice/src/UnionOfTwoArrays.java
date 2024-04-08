import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {85, 25, 1, 32, 54, 6};
        int arr2[] = {85, 2, 54};

        Set<Integer> ss=new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            ss.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            ss.add(arr2[i]);
        }

       // System.out.println(ss);
        System.out.println(ss.size());
        
    }}