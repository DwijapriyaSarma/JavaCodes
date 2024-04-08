package Inheritance;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int grade[];
    private static int student=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public Student(String name, int age, String gender, int[] grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        student++;
    }

    public double AvgGrade() {
        double sum=0;
        for (int grades : grade) {
            sum += grades;
        }
        return sum/grade.length;

    }
    public static int totalStudent(){
        return Student.student;

    }
}
class collageStudent extends Student{
    String major;

    public collageStudent(String name, int age, String gender, int[] grade, String major) {
        super(name, age, gender, grade);
        this.major=major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
public void studentDetails(){
    System.out.println("Name: "+getName() +"age: "+getAge()+"gender: "+getGender()+"grade: "+getGrade()+"Avg grade: "+AvgGrade() +"major: "+getMajor());
}
}

   class Main{
       public static void main(String[] args) {
           collageStudent collageStudent1=new collageStudent("Puja",19,"female", new int[]{1,2,6,8},"c.s");
           collageStudent collageStudent2=new collageStudent("Riya",19,"female", new int[]{91,82,96,78},"c.s");
           collageStudent collageStudent3=new collageStudent("Janu",19,"female", new int[]{91,92,68,89},"c.s");
           collageStudent collageStudent4=new collageStudent("Hrishi",19,"male", new int[]{17,2,6,8},"c.s");
           collageStudent collageStudent5=new collageStudent("Vabna",19,"female", new int[]{19,20,96,8},"c.s");

           collageStudent collageStudents[]={collageStudent1,collageStudent2,collageStudent3,collageStudent4,collageStudent5}; //non-primitive array
           System.out.println("Total student: "+collageStudent.totalStudent());

           for (collageStudent collageStudent: collageStudents){
               if (collageStudent.AvgGrade()>85){
                   collageStudent.studentDetails();
               }
           }
       }

   }

   /* Create a Java program using concepts of OOP such as encapsulation, data hiding, constructors, inheritance, usage of static, along with conditional statements, looping and arrays.

The task is to:

1. Implement a superclass 'Student' with private attributes: 'name', 'age', 'gender' and 'grades' (which is an array). The class should have a constructor, getters and setters for encapsulation & data hiding. Also, include a method called averageGrade that computes and returns the average of all the grades of a student.

2. Create a static method in the 'Student' class which counts and returns the number of Student instances created.

3. Make a subclass 'CollegeStudent' which extends 'Student'. Add a new field 'major'. Add appropriate constructors including a method to print all the details of the student including average grade and major.

4. In a 'Main' class, create multiple instances of 'CollegeStudent', store them in an array. Then, for each student in the array, print their details by using a loop and conditional statements to find, and print only the students who have average grade higher than 85.*/