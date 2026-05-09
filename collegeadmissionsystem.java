import java.lang.System;
import java.util.Scanner;
class collegeadmissionsystem
{
    String studentname;
    int age;
    String fathername;
    int mark;
    int stream;
    int department;
    String eligible;
    int fees;
    String eligiblestream;
    void getdetails(Scanner scan)
    {
        System.out.print("Enter Student Name : ");
        studentname = scan.nextLine();
        System.out.print("Enter Student age : ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Your Father Name : ");
        fathername = scan.nextLine();
        System.out.print("Enter Your 12th mark : ");
        mark = scan.nextInt();
    }
    void stream(Scanner scan)
    {
        System.out.println("--->Enter Which Stream you have studied in School(1-3)<---");
        System.out.println("--->1. Bio Maths       <---");
        System.out.println("--->2. Computer Science<---");
        System.out.println("--->3. Commerce        <---");
        stream = scan.nextInt();
    }
    void department(Scanner scan)
    {
        System.out.println("-_-_-Enter which department you want in our college(1-4)-_-_-");
        System.out.println("-_-_-1. Computer Science     -_-_-");
        System.out.println("-_-_-2. Computer Application -_-_-");
        System.out.println("-_-_-3. Mathematics          -_-_-");
        System.out.println("-_-_-4. Commerce             -_-_-");
        department = scan.nextInt();    
    }
    void eligibility()
    {
        if(department==1)
        {
            if(mark>=420 && (stream==1 || stream==2))
            {
                eligible = "Yes you are Eligible for this department!!!";
                eligiblestream="Computer Science";
                
            }
            else if(mark>420 && stream==3)
            {
                eligible = "You are not Eligible for this Department because you are from commerce stream , prefer to choose Commerce department!!!";
                eligiblestream="Commerce";
            }
            else if(mark<420 && (stream==1 || stream==2))
            {
                eligible = "You are not Eligible for this Department because you have insufficient marks , prefer to chooce Computer Application Depratment!!!";
                eligiblestream="Computer Application";
            }

        }
        else if(department==2)
        {
            if(mark>=360 && stream!=3)
            {
                eligible = "Yes you are Eligible for this department!!!";
                eligiblestream="Computer Application";
            }
            else if(mark<360 && stream!=3)
            {
                eligible = "You are not Eligible for this Department because you have low marks , prefer to chooce Mathematics Department!!!";
                eligiblestream = "Mathematics";
            }
            else if(mark>=360 && stream==3)
            {
                eligible = "You are not Eligible for this Department because you are from commerce stream , prefer to choose Commerce Department!!!";
                eligiblestream="Commerce";
            }
        }
        else if(department==3)
        {
            if(mark>=300 && stream!=3)
            {
                eligible = "Yes you are Eligible for this department!!!";
                eligiblestream="Mathematics";
            }
            else if(mark<300 && stream!=3)
            {
                eligible = "You are not Eligible for this Department because you have low marks , prefer to chooce Commerce!!!";
                eligiblestream="Commerce";
            }
            else if(mark>=300 && stream==3)
            {
                eligible = "You are not Eligible for this Department because you are from commerce stream , prefer to choose Commerce Department!!!";
                eligiblestream="Commerce";
            }

        }
        else if(department==4)
        {
            if(mark>=250)
            {
                eligible = "Yes you are Eligible for this department!!!";
                eligiblestream="Commerce";
            }
        }
        System.out.println(eligible);
    }
    void fee()
    {
        if(eligiblestream.equals("Computer Science"))
        {
            System.out.println("Computer Science Department");
            System.out.println("Semester fees 16000");
            System.out.println("Exam fees 1600");
            fees=16000;
        }
        else if(eligiblestream.equals("Computer Application"))
        {
            System.out.println("Computer Application Department");
            System.out.println("Semester fees 14000");
            System.out.println("Exam fees 1400");
            fees=14000;
        }
        else if(eligiblestream.equals("Mathematics"))
        {
            System.out.println("Mathematics Department");
            System.out.println("Semester fees 12000");
            System.out.println("Exam fees 1200");
            fees=12000;
        }
        else if(eligiblestream.equals("Commerce"))
        {
            System.out.println("Commerce Department");
            System.out.println("Semester fees 10000");
            System.out.println("Exam fees 1000");
            fees=10000;
        }
    }
    void admissionsummary()
    {
        System.out.println("-----Admission Summary-----");
        System.out.println("Student Name : "+studentname);
        System.out.println("Father Name : "+fathername);
        System.out.println("Student Mark: "+mark);
        System.out.println("Stream : "+eligiblestream);
        System.out.println("Fee Structure : "+fees);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        admissionsystem a = new admissionsystem();
        System.out.println("====================================");
        System.out.println("   Don Bosco College Welcomes You   ");
        System.out.println("====================================");
        a.getdetails(scan);
        a.stream(scan);
        a.department(scan);
        a.eligibility();
        a.fee();
        System.out.println();
        a.admissionsummary();

    }
}
