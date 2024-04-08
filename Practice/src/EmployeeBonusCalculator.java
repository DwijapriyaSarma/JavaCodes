/*
XYZ Corporation is planning to distribute annual bonuses to its employees based on multiple conditions. As a software developer at XYZ, you are tasked to develop a program that will automate this process.

        The conditions for the bonus distribution are as follows:

        1. If an employee has been with the company for more than 5 years, they get 15% of their basic salary as a bonus.
        2. On top of this, if the employee has also met at least 90% of their sales target for the year, they receive an additional 5% bonus on their basic salary.
        3. However, punctuality is strictly enforced at XYZ. If the employee has had more than 3 late arrivals in the past month, a 3% deduction is applied to their total bonus.

        Write a program in Java that will prompt the employee to enter relevant data (years of service, basic salary, percentage of sales target achieved, number of times they have been late in the past month). Based on these inputs, your program should calculate and display the final bonus amount.

        You can assume that the initial bonus (before any deductions) won't exceed the employee's basic salary. Also, in a case where an employee has been with the company for 5 years or less, consider a base bonus of 10% instead of 15%."
*/


import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number of years with the company: ");
        int years= obj.nextInt();
        System.out.println("Enter basic salary of the Employee: ");
        int salary= obj.nextInt();
        System.out.println("Enter percentage of sales target achived of the Employee: ");
        double salestarget= obj.nextDouble();
        System.out.println("Enter the time you were late this month!");
        int lateCount= obj.nextInt();
        double bonus= 0;
        if(years>5) {
            bonus = bonus + salary * .15;
            if (salestarget >= 90) {
                bonus = bonus + salary * .05;
            }
            if (lateCount > 3) {
                bonus = bonus - (bonus * .03);
            }
        }else {
            bonus+= bonus*.10;
            if(salestarget>=90){
                bonus=bonus+salary*.05;
            }
            if(lateCount>3){
                bonus=bonus-(bonus*.03);
            }
        }
        System.out.println("Your bonus is "+bonus);


    }}