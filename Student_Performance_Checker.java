import java.lang.System;
import java.util.Scanner;
class Student_Performance_Checker
{
    public static void main(String args[])
    {
        int pass =0;
        int fail =0;
        int fine =0;
        int fine_amount =0;
        int fine_students = 0;
        int not_eligible = 0;
        int diciplince_warning =0;
        int total_mark = 0;
        int average_mark =0; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Students in your class : ");
        int students_count = scan.nextInt();
        int mark[] = new int[students_count];
        int attendence[] = new int[students_count];
        int late[] = new int[students_count];
        int highest_mark=0;
        int lowest_mark=0;
        for(int i=0;i<students_count;i++)
        {
            System.out.println("Student "+(i+1));
            System.out.print("Enter your mark : ");
            mark[i]=scan.nextInt();
            if(mark[i]>=40)
            {
                pass+=1;
            }
            else
            {
                fail+=1;
            }
            System.out.print("Enter your attendence percentage : ");
            attendence[i]=scan.nextInt();
            if(attendence[i]<75)
            {
                System.out.print("Medical Certificate 0 = YES , 1 = NO : ");
                int medical_cert=scan.nextInt();
                if(medical_cert==1)
                {
                    not_eligible+=1;
                }
            }
            System.out.print("How many days you came late to class : ");
            late[i]=scan.nextInt();
            if(late[i]>=1 && late[i]<=3)
            {
                fine_amount += late[i] * 100;
                fine_students +=1;
            }
            else if(late[i]>3)
            {
                diciplince_warning +=1;
            }
        }
        highest_mark = mark[0];
        lowest_mark = mark[0];
        for(int i=0;i<students_count;i++)
        {
            total_mark+=mark[i];
            if(mark[i]>highest_mark)
            {
                highest_mark = mark[i];
            }
            if(mark[i]<lowest_mark)
            {
                lowest_mark = mark[i];
            }

        }
        average_mark = total_mark/students_count;
        System.out.print("-----------Class Report--------------");
        System.out.println("Total Students        : "+students_count);
        System.out.println("Passed Students       : "+pass);
        System.out.println("Failed Students       : "+fail);
        System.out.println("Students with warning : "+diciplince_warning);
        System.out.println("Not Eligible for Exam : "+not_eligible);
        System.out.println("Class Average mark    : "+average_mark);
        System.out.println("Highest Mark          : "+highest_mark);
        System.out.println("Lowest Mark           : "+lowest_mark);
        
    }
}
