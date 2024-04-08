import java.util.Arrays;

public class GradingStudentHackerRank {
    public static void main(String[] args) {
        int grades[] = {73,67,38,33};
        int n = grades.length;

        int nums[]=new int[grades.length];

        for(int i=0; i<n; i++){
            if(grades[i]<38){
                nums[i]=grades[i];
            }else{
                int count=grades[i];
                while(count%5!=0){
                    count+=1;
                }
                if(count-grades[i]<3){
                    nums[i]=count;
                }else{
                    nums[i]=grades[i];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
