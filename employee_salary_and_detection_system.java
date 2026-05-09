import java.lang.System;
import java.util.Scanner;
class employee_salary_and_detection_system
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Employee count : ");
        int employee_count = scan.nextInt();
        int salary[] = new int[employee_count];
        int late[] = new int[employee_count];
        int leave[] = new int[employee_count];
        int fine[] = new int[employee_count];
        int final_salary[] = new int[employee_count];
        int employee_fine = 0;
        int highest_salary = 0;
        int lowest_salary = 0;
        int total_salary = 0;
        for(int i=0;i<employee_count;i++)
        {
            System.out.println("Employee : "+(i+1));
            System.out.print("Enter your Basic Salary : ");
            salary[i] = scan.nextInt();
            System.out.print("Enter number of late days : ");
            late[i] = scan.nextInt();
            System.out.print("Enter number of days you took leave : ");
            leave[i] = scan.nextInt();
            if(late[i]>0)
            {
               fine[i] += late[i]*200;
            }
            if(leave[i]>0)
            {
               fine [i] += leave[i]*500;
            }
            if(late[i]>0 || leave[i]>0)
            {
                employee_fine+=1;
            }
            final_salary[i] = salary[i]-fine[i];
            System.out.println("Your Salary is : "+final_salary[i]);
        }
        highest_salary = final_salary[0];
        lowest_salary = final_salary[0];
        for(int i=0;i<employee_count;i++)
        {
            if(final_salary[i]>highest_salary)
            {
                highest_salary = final_salary[i];
            }
            if(final_salary[i]<lowest_salary)
            {
                lowest_salary = final_salary[i];
            }
            total_salary += final_salary[i];
        }
        System.out.println("----------------Salary Report-------------");
        System.out.println("Total Employees   : "+employee_count);
        System.out.println("Total Salary paid : "+total_salary);
        System.out.println("Highest Salary    : "+highest_salary);
        System.out.println("Lowest Salary     : "+lowest_salary);
        System.out.println("Fined Employees   : "+employee_fine);

    }
}
